package Stepup_definition;

import Baseclass.Base_domino;
import com_Pom_class.Beverages_page;
import com_Pom_class.Home_page;
import com_Pom_class.Price_page;
import com_Pom_class.veg_pizza_page;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.time.Duration;

public class Step_up extends Base_domino {

    Home_page Home=new Home_page();

    veg_pizza_page veg_pizza=new veg_pizza_page();

    Beverages_page beverages=new Beverages_page();


    Price_page price=new Price_page();



    @Given("User go to domino's website")
    public void user_go_to_domino_s_website() {
        driver.get("https://pizzaonline.dominos.co.in/");
        driver.manage().window().maximize();

    }
    @When("User,First enter the address and pincode")
    public void user_first_enter_the_address_and_pincode() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(Home.Allow).click();
        driver.findElement(Home.address).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(Home.area).sendKeys("600044");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(Home.locate_me_btn).click();
    }
    @When("User select veg pizza's\\(Caprese Gourmet pizza, margarita pizza, peppy panner) each {int} quantity")
    public void user_select_veg_pizza_s_caprese_gourmet_pizza_margarita_pizza_peppy_panner_each_quantity(Integer int1) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(veg_pizza.vegpizza).click();
//        scrolldown(driver,driver.findElement(vp.Margarita));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(veg_pizza.Margarita).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(veg_pizza.No_thanks).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(veg_pizza.Margarita_increment).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(veg_pizza.peppy_paneer).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(veg_pizza.peppy_increment).click();
    }
    @When("User select Beverages pepesi \\({int} Quantity)")
    public void user_select_beverages_pepesi_quantity(Integer int1) {
        driver.findElement(beverages.Beverages).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(beverages.pepsi_475).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(bp.pepsi_add).click(){
        for(int i=1;i<=11;i++ )
        {
            driver.findElement(beverages.pepsi_increment).click();
        }
    }
    @When("User remove products from cart, {int} margarita pizza and {int} pepsi's")
    public void user_remove_products_from_cart_margarita_pizza_and_pepsi_s(Integer int1, Integer int2) {
        driver.findElement(veg_pizza.decrement_margarita).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        for(int i=0;i<=6;i++){
            driver.findElement(beverages.pepsi_decrement).click();
        }
    }
    @Then("User get subtotal value and check out from the website\\(place order price details)")
    public void user_get_subtotal_value_and_check_out_from_the_website_place_order_price_details() {

        driver.findElement(price.check_out).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String sub_total = driver.findElement(price.sub_total).getText();
        Double val_of_total=Double.parseDouble(sub_total);
        System.out.println(val_of_total);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String tax=driver.findElement(price.tax).getText();
        Double taxes= Double.parseDouble(tax);
        System.out.println(taxes);

        Float subtotal=Float.valueOf(String.valueOf(val_of_total + taxes));
        System.out.println("subtotal" + subtotal);

        String Grandtotal = driver.findElement(price.Grand_total).getText();
        Float gtotal=Float.valueOf(Grandtotal);
        System.out.println("gtotal" + gtotal);

        Assert.assertEquals(subtotal,gtotal);
    }


}

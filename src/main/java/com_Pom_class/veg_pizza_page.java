package com_Pom_class;

import Baseclass.Base_domino;
import org.openqa.selenium.By;

public class veg_pizza_page extends Base_domino {

    public By vegpizza=By.xpath( "//div[contains(@class,'sc-kjoXOD hufhcG')]//span[.='VEG PIZZA']");

    public By Margarita=By.xpath("//div[@data-label='Veg Pizza']/descendant::div[@data-label='Margherita']/descendant::button[@data-label='addTocart']");

    public By Margarita_increment=By.xpath("(//div[@class='injectStyles-sc-1jy9bcf-0 gwKvJy'])[3]");

    public By peppy_paneer=By.xpath("(//div[contains(@data-label,'Peppy Paneer')])[2]//span[text()='ADD TO CART']");

    public By No_thanks =By.xpath("//button[@data-label=\"Add button\"]");

    public By add_button=By.xpath("(//div[@data-label='increase'])[3]");

    public By pep_addtocart =By.xpath("(//div[contains(@data-label,'Peppy Paneer')])[2]//span[text()='ADD TO CART']");

    public By peppy_increment = By.xpath("(//div[@data-label='increase'])[6]");

    public By decrement_margarita =By.xpath("(//div[@data-label=\"decrease\"])[5]");


}

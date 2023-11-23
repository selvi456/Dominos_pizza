package com_Pom_class;

import Baseclass.Base_domino;
import org.openqa.selenium.By;

public class Home_page extends Base_domino {
    public By Allow = By.xpath("//button[@id='optInText']");
    public  By address=By.xpath( "//input[@class='srch-cnt-srch-inpt']");
    public By area= By.xpath("//input[@placeholder='Enter Area / Locality']");

    public By locate_me_btn=By.xpath( "//button[@data-label='Locate_Me']");



}

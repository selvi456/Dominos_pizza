package com_Pom_class;

import Baseclass.Base_domino;
import org.openqa.selenium.By;

public class Beverages_page extends Base_domino {
    public By Beverages= By.xpath("//span[text()='BEVERAGES']");

    public By pepsi_475 = By.xpath("//div[@data-label=\"Beverages\"]/descendant::div[@data-label=\"Pepsi 475ml\"]/descendant::button[@data-label=\"addTocart\"]");

    public By pepsi_increment=By.xpath("(//div[@data-label=\"increase\"])[5]");

    public By pepsi_decrement=By.xpath("(//div[@data-label=\"decrease\"])[5]");
}

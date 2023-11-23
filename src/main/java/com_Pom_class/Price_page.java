package com_Pom_class;

import Baseclass.Base_domino;
import org.openqa.selenium.By;

public class Price_page extends Base_domino {

    public By check_out= By.xpath("//button[@data-label='miniCartCheckout']");

    public By sub_total= By.xpath("(//span[@class='rupee'])[4]");

    public By tax=By.xpath("(//span[@class='rupee'])[5]");

    public By Grand_total=By.xpath("(//span[@class='rupee'])[6]");
}

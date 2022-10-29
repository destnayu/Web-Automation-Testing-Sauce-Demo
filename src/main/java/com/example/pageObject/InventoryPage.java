package com.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {
    public static WebDriver driver;

    public InventoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement productSort;
    public void setProductSort(String sortProduct) {
        productSort.click();
        Select a = new Select(productSort);
        a.selectByVisibleText(sortProduct);
    }

    public void AddProduct1() {
        String xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']";
        driver.findElement(By.xpath(xpath)).click();
    }
    public void AddProduct2() {
        String xpath = "//button[@id='add-to-cart-sauce-labs-onesie']";
        driver.findElement(By.xpath(xpath)).click();
    }

    public void setClickCart() {
        String xpath = "//span[@class='shopping_cart_badge']";
        driver.findElement(By.xpath(xpath)).click();
    }

    public void setRemoveProduct() {
        String xpath ="//button[@id='remove-test.allthethings()-t-shirt-(red)']";
        driver.findElement(By.xpath(xpath)).click();
    }

    public static void clickButtonCheckOut() {
        String xpath = "//button[@id='checkout']";
        driver.findElement(By.xpath(xpath)).click();
    }

    public static void CheckoutInformation(String firstName, String lastName, String postalCode){
        String xpath1 = "//input[@id='first-name']";
        String xpath2 = "//input[@id='last-name']";
        String xpath3 = "//input[@id='postal-code']";
        String xpath4 = "//input[@id='continue']";

        driver.findElement(By.xpath(xpath1)).sendKeys(firstName);
        driver.findElement(By.xpath(xpath2)).sendKeys(lastName);
        driver.findElement(By.xpath(xpath3)).sendKeys(postalCode);
        driver.findElement(By.xpath(xpath4)).click();
    }

    public static void CheckoutOverview(){
        String xpath = "//div[@class='summary_info']";
        String xpath1 = "//div[@class='summary_subtotal_label']";//div[@class='summary_subtotal_label']
        String xpath2 = "//div[@class='summary_tax_label']";//div[@class='summary_tax_label']']
        String xpath3 = "//div[@class='summary_total_label']";//div[@class='summary_total_label']
        driver.findElement(By.xpath(xpath)).getText();
        driver.findElement(By.xpath(xpath1)).getText();
        driver.findElement(By.xpath(xpath2)).getText();
        driver.findElement(By.xpath(xpath3)).getText();
    }

    public static void CheckoutFinish(){
        String xpath = "//button[@id='finish']";
        driver.findElement(By.xpath(xpath)).click();
    }

    @FindBy (css = ".complete-header")
    private static WebElement CompleteHeader;
    public static String CompleteOrder(){
        return CompleteHeader.getText();
    }

}


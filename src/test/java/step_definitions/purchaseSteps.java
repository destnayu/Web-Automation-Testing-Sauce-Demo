package step_definitions;

import com.example.pageObject.InventoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class purchaseSteps {
    private WebDriver webDriver;

    public purchaseSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User sort product list by \"(.*)\"")
    public void userSortProductListBy(String sortProduct) throws InterruptedException{
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.setProductSort(sortProduct);
        Thread.sleep(2000);
    }
    @When("User can select item Test.allTheThings T-Shirt Red and Sauce Labs Onesie on landing page")
    public void userAddtoCart() throws InterruptedException{
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.AddProduct1();
        Thread.sleep(1000);
        inventoryPage.AddProduct2();
        Thread.sleep(2000);
    }
    @Then("User click icon cart on landing page")
    public void userClickCart() throws InterruptedException {
        InventoryPage inventoryPage=new InventoryPage(webDriver);
        inventoryPage.setClickCart();
        Thread.sleep(1000);
    }
    @And("User remove 1 item on Your Cart page")
    public void userRemoveProduct() throws InterruptedException {
        InventoryPage inventoryPage=new InventoryPage(webDriver);
        inventoryPage.setRemoveProduct();
        Thread.sleep(2000);
    }
    @Then ("User can click checkout button on Your Cart page")
    public void userCheckoutProduct() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickButtonCheckOut();
        Thread.sleep(2000);
    }
    @When ("User input \"(.*)\", \"(.*)\" and \"(.*)\" on Checkout Information page and click continue button")
    public void inputCredential(String firstName, String lastName, String postalCode) throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.CheckoutInformation(firstName, lastName, postalCode);
        Thread.sleep(5000);
    }

    @And ("User get checkout information")
    public void userGetCheckOutInformation() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.CheckoutOverview();
        Thread.sleep(2000);
    }

    @Then ("User can be click Finish button")
    public void userCheckOutFinish() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.CheckoutFinish();
        Thread.sleep(1000);
    }

    @And ("User success order product and a message will appear \"(.*)\" on Checkout Complete page")
    public void userCompleteOrder(String orderComplete){
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.CompleteOrder();
        Assert.assertEquals(orderComplete, InventoryPage.CompleteOrder());
        }

}

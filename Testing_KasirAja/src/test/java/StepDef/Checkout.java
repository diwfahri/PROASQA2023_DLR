package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout {
    WebDriver driver;
    @Given("I go to homepage after login")
    public void iGoToHomepageAfterLogin() throws InterruptedException {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
        driver.findElement(By.name("login-button")).isDisplayed();
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    }

    @And("I select a product to add to the cart")
    public void iSelectAProductToAddToTheCart() {
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).isDisplayed();
    }

    @When("I tap the Add to Cart button")
    public void iTapTheAddToCartButton() {
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
    }

    @And("I click on the cart icon")
    public void iClickOnTheCartIcon() {
        driver.findElement(By.cssSelector(".shopping_cart_container a.shopping_cart_link")).click();
    }

    @And("I tap the Checkout button")
    public void iTapTheCheckoutButton() {
        driver.findElement(By.name("checkout")).click();
    }

    @And("I input empty first name")
    public void iInputEmptyFirstName() {
        driver.findElement(By.name("firstName")).sendKeys("");
    }

    @And("I input my last name")
    public void iInputMyLastName() {
        driver.findElement(By.name("lastName")).sendKeys("Rianti");
    }


    @And("I input my zip or postal code")
    public void iInputMyZipOrPostalCode() {
        driver.findElement(By.name("postalCode")).sendKeys("1234");
    }

    @And("I tap the Continue button")
    public void iTapTheContinueButton() {
        driver.findElement(By.name("continue")).click();
    }

    @Then("Show error pop up {string}")
    public void showErrorPopUp(String errorMessage) {
        WebElement errorElement=driver.findElement(By.cssSelector(".error-message-container.error"));
        assert(errorElement.getText().contains(errorMessage));
        driver.close();
        driver.quit();
    }

    @And("I input my first name")
    public void iInputMyFirstName() {
        driver.findElement(By.name("firstName")).sendKeys("Dwi Latifah");
    }

    @Then("Launch checkout overview")
    public void launchCheckoutOverview() {
        driver.findElement(By.name("finish")).isDisplayed();
    }

    @And("I tap the finish button")
    public void iTapTheFinishButton() {
        driver.findElement(By.name("finish")).click();
    }

    @Then("I go to checkout complete")
    public void iGoToCheckoutComplete() {
        driver.findElement(By.name("back-to-products")).isDisplayed();
        driver.close();
        driver.quit();
    }
}

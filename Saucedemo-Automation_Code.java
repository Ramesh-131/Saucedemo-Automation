package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Merged_Code {
    public static void main(String[] args) {
        // Set up the WebDriver and navigate to the Saucedemo login page
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        try {
            // Navigate to the Saucedemo website
            driver.get("https://www.saucedemo.com/v1/index.html");
            Thread.sleep(2000);
            System.out.println("Navigated to Saucedemo website.");

            // Enter the username
            WebElement usernameInput = driver.findElement(By.id("user-name"));
            usernameInput.sendKeys("standard_user");
            Thread.sleep(2000);
            System.out.println("Entered username: standard_user.");

            // Enter the password
            WebElement passwordInput = driver.findElement(By.id("password"));
            passwordInput.sendKeys("secret_sauce");
            Thread.sleep(2000);
            System.out.println("Entered password: secret_sauce.");

            // Click the login button
            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();
            Thread.sleep(2000);
            System.out.println("Clicked login button.");

            // Verify successful login
            if (driver.getCurrentUrl().contains("inventory.html")) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Login failed.");
                return;
            }

            // Click Menu Button
            WebElement menuButton = driver.findElement(By.className("bm-burger-button"));
            menuButton.click();
            Thread.sleep(2000);
            System.out.println("Clicked menu button.");

            // Close the side menu bar
            WebElement closeButton = driver.findElement(By.className("bm-cross-button"));
            closeButton.click();
            Thread.sleep(2000);
            System.out.println("Closed side menu bar.");

            // Press on the name/title of the product
            WebElement productTitle = driver.findElement(By.id("item_4_title_link"));
            productTitle.click();
            Thread.sleep(2000);
            System.out.println("Clicked on product title.");

            // Press Back from the product page
            WebElement backButton = driver.findElement(By.className("inventory_details_back_button"));
            backButton.click();
            Thread.sleep(2000);
            System.out.println("Pressed back button from product page.");

            // Locate the image by its 'src' attribute and click on it
            WebElement productImage = driver.findElement(By.xpath("//img[@src='./img/sauce-backpack-1200x1500.jpg']"));
            productImage.click();
            Thread.sleep(2000);
            System.out.println("Clicked on product image.");

            // Press Back from the product page
            backButton = driver.findElement(By.className("inventory_details_back_button"));
            backButton.click();
            Thread.sleep(2000);
            System.out.println("Pressed back button from product page.");

            // Filter for Name from Z to A
            WebElement filterDropdown = driver.findElement(By.className("product_sort_container"));
            Select filterSelect = new Select(filterDropdown);
            filterSelect.selectByVisibleText("Name (Z to A)");
            Thread.sleep(2000);
            System.out.println("Filtered products by Name (Z to A).");

            // Filter for Price from low to high
            filterSelect.selectByVisibleText("Price (low to high)");
            Thread.sleep(2000);
            System.out.println("Filtered products by Price (low to high).");

            // Add "Sauce Labs Onesie" to cart
            WebElement addToCartButton = driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']/ancestor::div[contains(@class, 'inventory_item')]//button[text()='ADD TO CART']"));
            addToCartButton.click();
            Thread.sleep(2000);
            System.out.println("Added Sauce Labs Onesie to cart.");

            // Add "Sauce Labs Bike Light" to cart
            WebElement addToCartButton1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']/ancestor::div[contains(@class, 'inventory_item')]//button[text()='ADD TO CART']"));
            addToCartButton1.click();
            Thread.sleep(2000);
            System.out.println("Added Sauce Labs Bike Light to cart.");

            // Click on the cart icon to view the cart
            WebElement cartIcon = driver.findElement(By.id("shopping_cart_container"));
            cartIcon.click();
            Thread.sleep(2000);
            System.out.println("Viewed the cart.");

            // Click on the "Sauce Labs Bike Light" in the cart
            WebElement productName = driver.findElement(By.xpath("//div[contains(@class, 'cart_item')]//div[contains(@class, 'inventory_item_name') and text()='Sauce Labs Bike Light']"));
            productName.click();
            Thread.sleep(2000);
            System.out.println("Clicked on Sauce Labs Bike Light in the cart.");

            // Press Back from the product page
            backButton = driver.findElement(By.className("inventory_details_back_button"));
            backButton.click();
            Thread.sleep(2000);
            System.out.println("Pressed back button from product page.");

            // Remove "Sauce Labs Bike Light" from cart
            WebElement removeButton = driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']/ancestor::div[contains(@class, 'cart_item')]//button[text()='REMOVE']"));
            removeButton.click();
            Thread.sleep(2000);
            System.out.println("Removed Sauce Labs Bike Light from cart.");

            // Click on the checkout button
            WebElement checkoutButton = driver.findElement(By.cssSelector("a.btn_action.checkout_button"));
            checkoutButton.click();
            Thread.sleep(2000);
            System.out.println("Clicked checkout button.");

            // Fill in the checkout information
            WebElement firstNameInput = driver.findElement(By.id("first-name"));
            firstNameInput.sendKeys("John");
            WebElement lastNameInput = driver.findElement(By.id("last-name"));
            lastNameInput.sendKeys("Doe");
            WebElement postalCodeInput = driver.findElement(By.id("postal-code"));
            postalCodeInput.sendKeys("12345");
            Thread.sleep(2000);
            System.out.println("Entered checkout information.");

            // Click on the continue button
            WebElement continueButton = driver.findElement(By.cssSelector("input.btn_primary.cart_button"));
            continueButton.click();
            Thread.sleep(2000);
            System.out.println("Clicked continue button.");

            // Click on the finish button
            WebElement finishButton = driver.findElement(By.cssSelector("a.btn_action.cart_button"));
            finishButton.click();
            Thread.sleep(2000);
            System.out.println("Clicked finish button and completed purchase.");

            // Open the menu bar
            WebElement menuButton1 = driver.findElement(By.className("bm-burger-button"));
            menuButton1.click();
            Thread.sleep(2000);
            System.out.println("Opened menu bar.");

            // Click on the logout button
            WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
            logoutButton.click();
            Thread.sleep(2000);
            System.out.println("Clicked logout button.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}

public class SeleniumDemo {
    @Test
    public void Test() {
// Create a WebDriver instance.
        WebDriver driver = new ChromeDriver();

        // Navigate to the Google URL.
        driver.get("https://www.google.com");

        // Get the current URL of the page.
        String currentUrl = driver.getCurrentUrl();

        // Assert that the current URL is equal to the expected URL.
        assertEquals("https://www.google.com", currentUrl);

        // Close the browser.
        driver.quit();
    }
}

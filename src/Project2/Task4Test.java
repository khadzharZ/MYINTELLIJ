package Project2;

public class Task4Test {
    public static void main(String[] args) {
        Task4.RemoteWebDriver[] driver = {new Task4.ChromeDriver(),
                new Task4.FirefoxDriver(), new Task4.SafariDriver()};
        for (Task4.RemoteWebDriver d : driver) {
            d.open();
            d.navigate();
            System.out.println(d.getTitle());
            d.getScreenshot();
            d.close();

        }
    }
}


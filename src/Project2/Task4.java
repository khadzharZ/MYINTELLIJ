package Project2;
public class Task4 {
    interface WebDriver {
        void open ();
        void close ();
        String getTitle ();
    }
    interface TakesScreenShot {
        void getScreenshot ();
    }
    interface RemoteWebDriver extends WebDriver, TakesScreenShot {
        void navigate ();
    }
    static class ChromeDriver implements RemoteWebDriver {
        public void open() {
            System.out.println("Chrome browser opens");
        }
        public void close() {
            System.out.println("Chrome browser closes");
        }
        public String getTitle() {
            return "Chrome web title";
        }
        public void getScreenshot() {
            System.out.println("Screenshots Chrome browser");
        }
        @Override
        public void navigate() {
            System.out.println("Chrome navigate  to https://learn.canvas.net/login/canvas");
        }}
    static class FirefoxDriver implements RemoteWebDriver {
        public void open() {
            System.out.println("Mozilla browser opens");
        }
        public void close() {
            System.out.println("Mozilla browser closes");
        }
        public String getTitle() {
            return "Mozilla web title";
        }
        public void getScreenshot() {
            System.out.println("Screenshots Mozilla browser");
        }
        public void navigate() {
            System.out.println("Mozilla navigate  to https://www.facebook.com/");
        }}
    static class SafariDriver implements RemoteWebDriver {
        public void open() {
            System.out.println("Safari browser opens");
        }

        public void close() {
            System.out.println("Safari browser closes");
        }

        public String getTitle() {
            return "Safari web title";
        }

        public void getScreenshot() {
            System.out.println("Screenshots Safari browser");
        }

        public void navigate() {
            System.out.println("Safari navigate  to https://www.instagram.com/");
        }
    }}


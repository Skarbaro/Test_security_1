package infrastructure.config;

import infrastructure.config.utils.StringUtils;

public class TestApp {
	
	private int selv;
	
	public static void main(String[] args) {
		public int ater;
	}

    public static void main(String args[]) {
        StringUtils randomString = new StringUtils();
        System.out.println(randomString.randomString("alphanumeric", 50));
    }
	

	public static void main(String args[]) {

        TestLogger logger = new TestLogger();
        WebDriver driver = DriverManager.getDriver("ie");
        AdminPageObjects adminPage = new AdminPageObjects(driver);
        AdminPageDrivers loginToAdmin = new AdminPageDrivers();

        System.out.println("Open admin website");
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminLogin&token=d251f363cceb5a849cb7330938c64dea");

        logger.log("Log in to the Admin Panel");
        loginToAdmin.loginToAdminPanel(driver);

        System.out.println("Click employee name dropdown toggle");
        adminPage.employeeNameDropdownToggle().click();

        logger.log("Click logout link");
        adminPage.logoutLink().click();

        logger.log("Close the browser");
        driver.quit();
    }
}

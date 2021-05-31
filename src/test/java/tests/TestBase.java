package tests;

import com.codeborne.selenide.Configuration;
import config.DriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    static DriverConfig driverConfig = ConfigFactory.create
            (DriverConfig.class, System.getProperties());

    @BeforeAll
    public static void init() {
        Configuration.baseUrl = driverConfig.getWebUrl();
    }

}

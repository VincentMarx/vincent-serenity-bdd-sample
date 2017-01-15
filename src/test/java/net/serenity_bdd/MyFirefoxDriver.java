package net.serenity_bdd;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import java.io.File;

/**
 * Created by Administrator on 2017/1/15.
 */
public class MyFirefoxDriver implements DriverSource {

    @Override
    public WebDriver newDriver() {
        ProfilesIni profiles = new ProfilesIni();
        FirefoxProfile profile = profiles.getProfile("selenium");
        FirefoxBinary binary = new FirefoxBinary(new File("D:/Program Files/Mozilla Firefox32/firefox.exe"));
        WebDriver driver = new FirefoxDriver(binary, profile);
        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}

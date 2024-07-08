package com.fetch.step_definitions;

import com.fetch.utilities.ConfigurationReader;
import com.fetch.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {


    @Before (order = 1)
    public void setupMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperty("game_url"));
    }


    @After
    public void teardownMethod(Scenario scenario){

        if (scenario.isFailed()){

            byte[] screenshot =((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }

        Driver.closeDriver();
    }



}

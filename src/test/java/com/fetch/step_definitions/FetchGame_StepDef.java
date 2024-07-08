package com.fetch.step_definitions;

import com.fetch.pages.FetchGameMainPage;
import com.fetch.utilities.BrowserUtility;
import com.fetch.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;

import java.util.ArrayList;
import java.util.List;

public class FetchGame_StepDef {

    FetchGameMainPage fetchGameMainPage = new FetchGameMainPage();
    List<String> listOfResult;

    @Given("I open the website")
    public void i_open_the_website() {

    }
    @When("I insert number {int} in the first cell of the left bowl's grid")
    public void i_insert_number_in_the_first_cell_of_the_left_bowl_s_grid(Integer number) {
        fetchGameMainPage.leftCellNumber(number,"first");
    }
    @When("I insert number {int} in the first cell of the right bowl's grid")
    public void i_insert_number_in_the_first_cell_of_the_right_bowl_s_grid(Integer number) {
        fetchGameMainPage.rightCellNumber(number,"first");
    }
    @When("I press the {string} button")
    public void i_press_the_button(String button) {
        fetchGameMainPage.clickButton(button);
        BrowserUtility.sleep(3);

    }
    @Then("I get the result of weighing")
    public void i_get_the_result_of_weighing() {
        BrowserUtility.sleep(3);
       listOfResult = new ArrayList<>();
        listOfResult.add(fetchGameMainPage.weighingsResult.getText());

    }
    @When("I insert number {int} in the second cell of the left bowl's grid")
    public void i_insert_number_in_the_second_cell_of_the_left_bowl_s_grid(Integer number) {

        fetchGameMainPage.leftCellNumber(number,"second");

    }
    @When("I insert number {int} in the second cell of the right bowl's grid")
    public void i_insert_number_in_the_second_cell_of_the_right_bowl_s_grid(Integer number) {
        fetchGameMainPage.rightCellNumber(number,"second");
    }
    @When("I press the button {int}")
    public void i_press_the_button(Integer number) {
        fetchGameMainPage.findFakeGoldBar(number);
    }
    @Then("I get an alert message and output it")
    public void i_get_an_alert_message_and_output_it() {
        Alert alert = Driver.getDriver().switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }
    @Then("I get a list of weighingsResult and output them")
    public void i_get_a_list_of_and_output_them() {

        System.out.println(listOfResult);
    }

}

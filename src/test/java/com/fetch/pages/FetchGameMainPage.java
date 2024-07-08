package com.fetch.pages;

import com.fetch.utilities.BrowserUtility;
import com.fetch.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FetchGameMainPage {

    public FetchGameMainPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "left_0")
    public WebElement leftFirstBox;

    @FindBy(id = "left_1")
    public WebElement leftSecondBox;

    @FindBy(id = "left_2")
    public WebElement leftThirdBox;

    @FindBy(id = "left_3")
    public WebElement leftFourthBox;

    @FindBy(id = "left_4")
    public WebElement leftFifthBox;

    @FindBy(id = "left_5")
    public WebElement leftSixthBox;
    @FindBy(id = "left_6")
    public WebElement leftSeventhBox;
    @FindBy(id = "left_7")
    public WebElement leftEightBox;
    @FindBy(id = "left_8")
    public WebElement leftNinthBox;


    @FindBy(id = "right_0")
    public WebElement rightFirstBox;

    @FindBy(id = "right_1")
    public WebElement rightSecondBox;

    @FindBy(id = "right_2")
    public WebElement rightThirdBox;

    @FindBy(id = "right_3")
    public WebElement rightFourthBox;

    @FindBy(id = "right_4")
    public WebElement rightFifthBox;

    @FindBy(id = "right_5")
    public WebElement rightSixthBox;
    @FindBy(id = "right_6")
    public WebElement rightSeventhBox;
    @FindBy(id = "right_7")
    public WebElement rightEightBox;
    @FindBy(id = "right_8")
    public WebElement rightNinthBox;



    @FindBy(id = "coin_0")
    public WebElement coin0;

    @FindBy(id = "coin_1")
    public WebElement coin1;

    @FindBy(id = "coin_2")
    public WebElement coin2;

    @FindBy(id = "coin_3")
    public WebElement coin3;
    @FindBy(id = "coin_4")
    public WebElement coin4;
    @FindBy(id = "coin_5")
    public WebElement coin5;


    @FindBy(id = "coin_6")
    public WebElement coin6;

    @FindBy(id = "coin_7")
    public WebElement coin7;

    @FindBy(id = "coin_8")
    public WebElement coin8;

    @FindBy(id = "reset")
    public WebElement resultSign;

    @FindBy(className = "game-info")
    public WebElement weighingsResult;




    @FindBy(id = "weigh")
    public WebElement weighing;

    @FindBy(xpath = "//button[text()='Reset']")
    public WebElement reset;


    public void clickButton(String buttonName){

        if(buttonName.equalsIgnoreCase("weighing")){
            weighing.click();
        }else if(buttonName.equalsIgnoreCase("reset")){
            reset.click();
        }


    }

    public void rightCellNumber(int number,String cellNumber){
        if(cellNumber.equalsIgnoreCase("first")) {
            switch (number) {
                case 0:
                    rightFirstBox.sendKeys(number + "");
                    break;
                case 1:
                    rightFirstBox.sendKeys(number + "");
                    break;
                case 2:
                    rightFirstBox.sendKeys(number + "");
                    break;
                case 3:
                    rightFirstBox.sendKeys(number + "");
                    break;
                case 4:
                    rightFirstBox.sendKeys(number + "");
                    break;
                case 5:
                    rightFirstBox.sendKeys(number + "");
                    break;
                case 6:
                    rightSeventhBox.sendKeys(number + "");
                    break;
                case 7:
                    rightFirstBox.sendKeys(number + "");
                    break;
                case 8:
                    rightFirstBox.sendKeys(number + "");
                    break;

            }
        } else if(cellNumber.equalsIgnoreCase("second")) {

            switch (number) {
                case 0:
                    rightSecondBox.sendKeys(number + "");
                    break;
                case 1:
                    rightSecondBox.sendKeys(number + "");
                    break;
                case 2:
                    rightSecondBox.sendKeys(number + "");
                    break;
                case 3:
                    rightSecondBox.sendKeys(number + "");
                    break;
                case 4:
                    rightSecondBox.sendKeys(number + "");
                    break;
                case 5:
                    rightSecondBox.sendKeys(number + "");
                    break;
                case 6:
                    rightSecondBox.sendKeys(number + "");
                    break;
                case 7:
                    rightSecondBox.sendKeys(number + "");
                    break;
                case 8:
                    rightSecondBox.sendKeys(number + "");
                    break;

            }
        }

    }


    public void leftCellNumber(int number,String cellNumber) {
        if (cellNumber.equalsIgnoreCase("first")) {

            switch (number) {
                case 0:
                    leftFirstBox.sendKeys(number + "");
                    break;
                case 1:
                    leftFirstBox.sendKeys(number + "");
                    break;
                case 2:
                    leftFirstBox.sendKeys(number + "");
                    break;
                case 3:
                    leftFirstBox.sendKeys(number + "");
                    break;
                case 4:
                    leftFirstBox.sendKeys(number + "");
                    break;
                case 5:
                    leftFirstBox.sendKeys(number + "");
                    break;
                case 6:
                    leftFirstBox.sendKeys(number + "");
                    break;
                case 7:
                    leftFirstBox.sendKeys(number + "");
                    break;
                case 8:
                    leftFirstBox.sendKeys(number + "");
                    break;

            }

        }else if (cellNumber.equalsIgnoreCase("second")){

            switch (number) {
                case 0:
                    leftSecondBox.sendKeys(number + "");
                    break;
                case 1:
                    leftSecondBox.sendKeys(number + "");
                    break;
                case 2:
                    leftSecondBox.sendKeys(number + "");
                    break;
                case 3:
                    leftSecondBox.sendKeys(number + "");
                    break;
                case 4:
                    leftSecondBox.sendKeys(number + "");
                    break;
                case 5:
                    leftSecondBox.sendKeys(number + "");
                    break;
                case 6:
                    leftSecondBox.sendKeys(number + "");
                    break;
                case 7:
                    leftSecondBox.sendKeys(number + "");
                    break;
                case 8:
                    leftSecondBox.sendKeys(number + "");
                    break;

            }

        }
    }

    public void findFakeGoldBar(int number){
        switch (number){
            case 0:
               coin0.click();
               break;
            case 1:
                coin1.click();
                break;
            case 2:
                coin2.click();
                break;
            case 3:
                coin3.click();
                break;
            case 4:
                coin4.click();
                break;
            case 5:
                coin5.click();
                break;
            case 6:
                coin6.click();
                break;
            case 7:
                coin7.click();
                break;
            case 8:
                coin8.click();
                break;

        }

    }



}

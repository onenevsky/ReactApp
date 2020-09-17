package com.katalon.kata.sample.testcase.simple;

import com.katalon.kata.sample.Constants;
import com.katalon.kata.sample.page.CuraAppoinmentPage;
import com.katalon.kata.sample.page.CuraHomePage;
import com.katalon.kata.sample.page.CuraLoginPage;
import com.katalon.kata.testng.TestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest{

  private CuraHomePage ReactHomePage = new CuraHomePage(Constants.baseUrl);

 // private CuraLoginPage curaMainPage;

 // private CuraAppoinmentPage curaAppoinmentPage;

  @Test
  public void shouldOpen() {
    ReactHomePage.open();
    ReactHomePage.makeTodo();
    boolean exist = curaTodoList.isOnPage();
    Assert.assertTrue(exist);
    driver.quit();
  }
}
package com.imdb.base;

import org.apache.logging.log4j.core.async.JCToolsBlockingQueueFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.sql.DriverManager;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public abstract class BasePage {

    protected final WebDriver driver;
    protected final Logger log = LogManager.getLogger(getClass());

    protected BasePage(){
        this.driver = DriverManager.get();
        PageFactory.initElements(driver, this);
    }

    protected void click(By locator){

    }
}

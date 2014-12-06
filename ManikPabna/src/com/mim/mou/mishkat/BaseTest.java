package com.mim.mou.mishkat;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest
{
	FirefoxDriver fd;
	
	BaseTest(FirefoxDriver moga)
	{
		fd=moga;
	}
	void click(By by)
	{
		fd.findElement(by).click();
	}
}

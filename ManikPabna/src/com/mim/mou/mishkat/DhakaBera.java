package com.mim.mou.mishkat;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DhakaBera
{

	public static void main(String[] args) 
	{
	FirefoxDriver dr = new	FirefoxDriver();
	dr.get("https://www.bluefly.com");
	dr.getTitle();
	System.out.println(dr.getTitle());
	BaseTest bs = new BaseTest(dr);
	bs.click(By.xpath("//*[@id='main-nav-new']/a"));
	bs.click(By.xpath("//*[@id='main-nav-woman']/a"));
	bs.click(By.xpath("//*[@id='main-nav-shoes']/a"));
	dr.quit();
	}

}

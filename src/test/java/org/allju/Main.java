package org.allju;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Asserts;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

import junit.framework.Assert;

public class Main extends Baseclass {
	@BeforeClass
	public static void beforeclass() {
		browser("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("B1 Success");
	}

	@Test
	public void test() throws InterruptedException {
		url("https://en-gb.facebook.com/");
		assertTrue("Vefrfy", currenturl().contains("facebook"));
		Pom p = new Pom();
		fillthetextbox(p.getUser(), "avisumar");
		assertEquals("aviskumar",getatt(p.getUser()));
		
		fillthetextbox(p.getPassword(), "aviskumar");
		assertEquals("aviskumar",getatt(p.getPassword()));
		
		btnclick(p.getLogin());
		System.out.println("B2 Success");

	}
}

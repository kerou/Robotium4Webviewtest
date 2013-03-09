package com.testcalc;

import java.io.IOException;
import java.util.ArrayList;

import com.jayway.android.robotium.solo.By;

import android.view.View;

public class Testcase1 extends Apptest{

	public Testcase1() throws ClassNotFoundException {
		super();
	}

	public void testDisplayBlackBox() throws IOException {

		Commonval.log(this.getName().toString());
		
		solo.clickOnText("Go to");
		solo.waitForWebElement(By.textContent("Hello, WebView"), 10, false);
		solo.sleep(5000);
	}
}

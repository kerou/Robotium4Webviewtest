package com.testcalc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import android.util.Log;

class Commonval {

	// String required in this test
	public static String appname = "wow what an app";

	/**
	 * Log message
	 * @param str
	 */
	public static void log(String str) {
		Log.d("com.android.notepad", str);

	}

	/**
	 * Read file from SDCARD
	 * 
	 * @param filepath
	 * @throws IOException
	 */
	public static void readfromsdcard(String filepath) throws IOException {
		// FileInputStream fis = new FileInputStream("sdcard/test.properties");
		FileInputStream fis = new FileInputStream(filepath);
		Properties cfg = new Properties();
		cfg.load(fis);
	}
}

package com.testcalc;

import java.io.IOException;
import java.util.Properties;
import com.testcalc.Commonval;
import com.jayway.android.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;

@SuppressWarnings("unchecked")
public class Apptest extends ActivityInstrumentationTestCase2 {
	private static final String TARGET_PACKAGE_ID = "com.myapp";
	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.myapp.MainActivity";
	private static Class launcherActivityClass;

	Properties cfg = new Properties();

	static {
		try {
			launcherActivityClass = Class
					.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}

	}

	public Apptest() throws ClassNotFoundException {
		super(launcherActivityClass);
	}

	protected Solo solo;

	@Override
	protected void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}

	@Override
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
}

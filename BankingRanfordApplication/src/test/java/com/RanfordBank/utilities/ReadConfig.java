package com.RanfordBank.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {

		try {
			File src = new File("./Configuration/config.properties");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is =" + e.getMessage());
		}
	}

	public String getAppURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUsername() {
		String UserName = pro.getProperty("username");
		return UserName;
	}

	public String getPasswordL() {
		String Password = pro.getProperty("password");
		return Password;
	}

	public String readChromePath() {
		String chromePath = pro.getProperty("chromedriverpath");
		return chromePath;
	}
}

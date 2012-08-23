package com.digitalgradient.portal.util;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigProperties {
	private static Properties configProperties = null;
		
	private ConfigProperties() {
	}

	public static void initialize(String filePath) {
		configProperties = new Properties();
		try {
			configProperties.load(new FileInputStream(filePath));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static Properties getInstance() {
		if (configProperties == null) {
			System.out.println("call initialize method of ConfigProperties class first!");
		}
		return configProperties;
	}
}
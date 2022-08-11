package com.rcastrucci.dev.singleton;

import java.io.IOException;
import java.util.Properties;

public class Config {
	
	
	private static Properties props;
	private static String configFilePath = "/resources/config.properties";
	
	
	/**
	 * Private constructor for a Singleton
	 */
	private Config() {}
	
	
	public static Properties getInstance() {
		if (props == null) {
			props = new Properties();
			try {
				props.load(Config.class.getResourceAsStream(configFilePath));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return props;
	}

}
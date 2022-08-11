package com.rcastrucci.dev.main;

import java.util.Properties;

import com.rcastrucci.dev.singleton.Config;

public class Test {
	
	private static Properties configProps = Config.getInstance();
	
	public static void main(String[] args) {
	
		System.out.println(configProps.getProperty("load"));
		System.out.println(configProps.getProperty("welcome"));
	
	}
}
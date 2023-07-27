package com.mystore.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties properties;
	
	String path= "C:\\Users\\Pc\\grandson\\MyStoreDDT\\configuration\\config.properties";

	public ReadConfig() {
		
		try {
		properties=new Properties();
		
			FileInputStream fis=new FileInputStream(path);
			properties.load(fis);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public String getBaseUrl(){
		String vaule= properties.getProperty("baseUrl");
        if(vaule!=null) {
        	return vaule;
        }
        else{
          throw new RuntimeException(" url not specified in config file. ");	
        }
	
	}

	
	public String getBrowser(){
		String vaule= properties.getProperty("browser");
        if(vaule!=null) {
        	return vaule;
        }
        else{
          throw new RuntimeException(" url not specified in config file. ");	
        }
	
	}

	
}

package com.actitimeProject.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLibrary {
        
	public String getProperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/actitime.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
}

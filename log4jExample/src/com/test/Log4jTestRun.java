package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


//https://www.youtube.com/watch?v=OoLwE_Imtq8    - > VIDEO LINK OF A LOGGER
public class Log4jTestRun {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties props = new Properties();

        props.load(new FileInputStream("src/log4j.properties"));
        PropertyConfigurator.configure(props);

		final Logger logger = Logger.getLogger(Log4jTestRun.class);
		logger.debug("This is debug");
		logger.warn("this is warn");
		logger.error("this is erro");
		logger.fatal("this is fatal");
		
	}

}

package org.mesonmsit.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;
import org.json.simple.JSONObject;

public class Misc {

	public static void setLogLevel() {
    	switch (Constants.LOG_LEVEL) {
		case "WARN":
			Configurator.setRootLevel(Level.WARN);
			break;
		case "ERROR":
			Configurator.setRootLevel(Level.ERROR);
			break;
		case "FATAL":
			Configurator.setRootLevel(Level.FATAL);
			break;
		case "INFO":
			Configurator.setRootLevel(Level.INFO);
			break;
		case "DEBUG":
			Configurator.setRootLevel(Level.DEBUG);
			break;
		default:
			Configurator.setRootLevel(Level.TRACE);
			break;
		}
    }
	
	public static JSONObject getMessages() throws Exception {
		JSONObject object = new JSONObject();
		InputStream input = null;
		Path path = Paths.get(Misc.class.getResource("/").toURI());
		// The path for messages file in Lambda Instance -
		String resourceLoc = path + "/resources/MessagesBundle.properties";
		input = new FileInputStream(resourceLoc);
		Properties prop = new Properties();
		prop.load(input);
		Enumeration enuKeys = prop.keys();
		while (enuKeys.hasMoreElements()) {
			String key = (String) enuKeys.nextElement();
			String value = prop.getProperty(key);
			object.put(key, value);
		}
		return object;
	}
}

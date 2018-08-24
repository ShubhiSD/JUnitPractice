package util;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log {
	 
	 private static Logger Log = Logger.getLogger(Log.class.getName());//
	 public static void logConfig() {
	 DOMConfigurator.configure("log4j2.xml");
	 }

	 public static void info(String message) {
	 
	Log.info(message);

	}
}

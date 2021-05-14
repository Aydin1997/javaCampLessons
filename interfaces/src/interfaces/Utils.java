package interfaces;

public class Utils {
	
	public static void runLoggers(Logger[] loggers,String message) { // static tanýmladýðýmýz için Utils new'lemeye gerek yok!!
		
		for(Logger logger:loggers) {
			logger.log(message);
		}
		
	}
}

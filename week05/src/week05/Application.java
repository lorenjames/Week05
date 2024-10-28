package week05;

import java.util.List;

public class Application {
	
	static Logger logger;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger = new FileLogger();
		
		logger.info("HellO");
		logger.warning("This is a warning");
		logger.error("Oops, this is an error!");
		logger.fatal("Fatal Error");
		logger.close();
		
		setLogger(new FileLogger());
		setLogger(new ConsoleLogger());

	}
	
	private static void setLogger(Logger l) {
		logger = l;
	}

}

package ch08.ex04;

import java.util.logging.Level;
import java.util.logging.Logger;

public class C02MyLogger {
	private Logger logger;
	
	public C02MyLogger() {
		this.logger = Logger.getLogger("ch08.ex04");
	}
	
	public void log() {
		logger.info("logging start.");
		try {
			throw new Exception("일부러 예외 발생.");
		} catch(Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
		logger.info("logging end.");
	}
	
	public static void main(String[] args) {
		new C02MyLogger().log();
	}

}

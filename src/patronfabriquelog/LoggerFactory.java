package patronfabriquelog;

import consolelog.ILog_Console;
import consolelog.console;
import consolelog.log;

public class LoggerFactory extends abstractLoggerFactory {
	public LoggerFactory(boolean b) {
		// TODO Auto-generated constructor stub
	}
       @Override
	public ILogger createLogger() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ILogger createLogger(typelogcon type) {
		ILogger unite = null;;
		switch(type)
		{
		case log :unite = new log(); 
			break;
		case console:unite = new console();
			break;
		}
		return unite;
	
		// TODO Auto-generated method stub		
	}

}

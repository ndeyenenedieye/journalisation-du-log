package patronfabriquelog;

public class test {
	public static void main(String[] args) {
		abstractLoggerFactory factory= new LoggerFactory(true);
		ILogger logger= factory.createLogger(typelogcon.log);
		logger.log(test.class.toString(),"bonjour");
		logger.log(test.class.toString(),"le");
		logger.log(test.class.toString(),"monde");

	}

}

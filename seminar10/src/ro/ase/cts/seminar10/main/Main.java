package ro.ase.cts.seminar10.main;

import ro.ase.cts.seminar10.chain.AbstractLogger;
import ro.ase.cts.seminar10.chain.LoggerChainFactory;
import ro.ase.cts.seminar10.chain.Verbosity;
import ro.ase.cts.seminar10.strategy.ModulMarketing;
import ro.ase.cts.seminar10.strategy.RandomMarketingStrategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModulMarketing modulMarketing = new ModulMarketing();
		modulMarketing.setCurrentStrategy(new RandomMarketingStrategy());
		double puncteBonus = modulMarketing.getBonus(100);
		
		System.out.println("Numar puncte bonus: " + puncteBonus);
		
		System.out.println("-----------------------------------");
		
		AbstractLogger loggerChain = LoggerChainFactory.getChainOfLoggers();
		loggerChain.logMessage(Verbosity.INFO, "This log is FYI");
		
		loggerChain.logMessage(Verbosity.ERROR, "Something went wrong");
		
		loggerChain.logMessage(Verbosity.DEBUG,"This is a debug message");
		
	}

}

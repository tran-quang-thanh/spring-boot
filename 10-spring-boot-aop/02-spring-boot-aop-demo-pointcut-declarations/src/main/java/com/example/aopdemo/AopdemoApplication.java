package com.example.aopdemo;

import com.example.aopdemo.dao.AccountDAO;
import com.example.aopdemo.dao.MembershipDAO;
import com.example.aopdemo.service.TrafficFortuneService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AccountDAO accountDAO,
			MembershipDAO membershipDAO,
			TrafficFortuneService trafficFortuneService
	) {
		return runner -> {
//			demoTheBeforeAdvice(accountDAO, membershipDAO);

//			demoTheAfterReturningAdvice(accountDAO);

//			demoTheAfterThrowingAdvice(accountDAO);

//			demoTheAfterAdvice(accountDAO);

//			demoTheAroundAdvice(trafficFortuneService);

//			demoTheAroundAdviceHandleException(trafficFortuneService);

			demoTheAroundAdviceRethrowException(trafficFortuneService);
		};
	}

	private void demoTheAroundAdviceRethrowException(TrafficFortuneService trafficFortuneService) {
		System.out.println("\nMain Program: demoTheAroundAdviceRethrowException");

		System.out.println("Calling getFortune()");

		boolean tripWire = true;
		String data = trafficFortuneService.getFortune(tripWire);

		System.out.println("\nMy fortune is: " + data);
	}

	private void demoTheAroundAdviceHandleException(TrafficFortuneService trafficFortuneService) {
		System.out.println("\nMain Program: demoTheAroundAdviceHandleException");

		System.out.println("Calling getFortune()");

		boolean tripWire = true;
		String data = trafficFortuneService.getFortune(tripWire);

		System.out.println("\nMy fortune is: " + data);
	}

	private void demoTheAroundAdvice(TrafficFortuneService trafficFortuneService) {
		System.out.println("\nMain Program: demoTheAroundService");

		System.out.println("Calling getFortune()");

		String data = trafficFortuneService.getFortune();

		System.out.println("\nMy fortune is: " + data);
	}

	private void demoTheAfterAdvice(AccountDAO accountDAO) {
		List<Account> accounts = null;

		try {
			boolean tripWire = false;
			accounts = accountDAO.findAccounts(tripWire);
		} catch (Exception exc) {
			System.out.println("\n\nMain Program: ... caught exception: " + exc);
		}

		// display the accounts
		System.out.println("\n\nMain Program: demoTheAfterReturningAdvice");
		System.out.println("----");

		System.out.println(accounts);
		System.out.println("\n");
	}

	private void demoTheAfterThrowingAdvice(AccountDAO accountDAO) {
		List<Account> accounts = null;

		try {
			boolean tripWire = true;
			accounts = accountDAO.findAccounts(tripWire);
		} catch (Exception exc) {
			System.out.println("\n\nMain Program: ... caught exception: " + exc);
		}

		// display the accounts
		System.out.println("\n\nMain Program: demoTheAfterReturningAdvice");
		System.out.println("----");

		System.out.println(accounts);
		System.out.println("\n");
	}

	private void demoTheAfterReturningAdvice(AccountDAO accountDAO) {
		List<Account> accounts = accountDAO.findAccounts();

		// display the accounts
		System.out.println("\n\nMain Program: demoTheAfterReturningAdvice");
		System.out.println("----");

		System.out.println(accounts);
		System.out.println("\n");
	}

	private void demoTheBeforeAdvice(AccountDAO accountDAO, MembershipDAO membershipDAO) {
		 accountDAO.addAccount();

		 // call getter and setter methods
		 accountDAO.setName("foobar");
		 accountDAO.setServiceCode("silver");

		 String name = accountDAO.getName();
		 String code = accountDAO.getServiceCode();

		 membershipDAO.addAccount();
		 membershipDAO.addSillyMember();
	}

}

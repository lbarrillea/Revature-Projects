package controllers;

import daos.TableDAO;
import exceptions.NOSQLResultsException;
import io.javalin.Javalin;
import io.javalin.http.Context;
import models.Main;
import utilities.ConnectionFactory;

import java.sql.SQLException;
import io.javalin.Javalin;

public class BankingController {
	
	public static Javalin javalin;
	
	public static void init(Javalin app) {
	      javalin = app;
	        app.get("/test", TestController::testConnection);
	        app.post("/test/:id", TestController::insertTestData);
	        app.get("/test/:id", TestController::getById);
	}
	
}
	
	
	
//	private BankingService bankingService;
//
//	//passes the Javalin app through the constructor to allow us to test endpoints
//	public BankingController(Javalin app) {
//		this.bankingService = new BankingService();
//		
//		//this creates endpoint groups
//		app.routes(() -> {
//			path("/enterance"), () -> {
//				
//			});
//		});
//	}
//	
//	public List<Accounts> findAllAccountsAlphabetical(){
//		List<Accounts> allAccounts = this.bankingService.findAll();
//		
//		//custom sorting here
//		
//		return null;
//	}
//
//	//writes lambda expression of accounts to response as a JSON
//	private Handler findallaccounts = ctx -> ctx.json(this.bankingService.findAll())
//}

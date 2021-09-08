package controllers;

import daos.TableDAO;
import exceptions.NOSQLResultsException;
import io.javalin.Javalin;
import io.javalin.http.Context;
import models.Main;
import utilities.ConnectionFactory;

import java.sql.SQLException;



public class TestController {
	private static Javalin javalin;
	
	public static void init(Javalin app) {
	      javalin = app;
	        app.get("/test", TestController::testConnection);
	        app.post("/test/:id", TestController::insertTestData);
	        app.get("/test/:id", TestController::getById);
	}
	
	 public static void testConnection(Context ctx) {
	        ctx.status(200);
	        ctx.result("Test Received!");
	    }

	    public static void insertTestData(Context ctx) throws SQLException {
	        TableDAO dao = new TableDAO(ConnectionFactory.getConnection());
	        Main row = ctx.bodyAsClass(Main.class);
	        dao.save(row);
	    }

	    public static void getById(Context ctx) throws SQLException, NOSQLResultsException {
	    	TableDAO dao = new TableDAO(ConnectionFactory.getConnection());
	        Main row = dao.get(Integer.parseInt(ctx.pathParam("id")));
	        ctx.json(row);
	    }

}

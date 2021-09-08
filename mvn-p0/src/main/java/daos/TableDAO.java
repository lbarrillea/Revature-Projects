package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exceptions.NOSQLResultsException;

import models.Main;


public class TableDAO implements Dao<Main> {
	Connection connection;
	
	public TableDAO(Connection conn) {
		connection = conn;
	}
	
@Override
public Main get(int id) throws SQLException, NOSQLResultsException{
	String sql = "Select * FROM account WHERE account_id = ? LIMIT 1";
	PreparedStatement pstmt = connection.prepareStatement(sql);
	pstmt.setInt(1, id);
	
	ResultSet rs = pstmt.executeQuery();
  if(rs.next()) {
      Main row = new Main();
      row.setStringId(rs.getInt("account_id"));
      row.setString(rs.getString("string"));
      return row;
  }else {
	  throw new NOSQLResultsException("ID: " + id + " not found.");
  }
}


@Override
public List<Main> getAll() throws SQLException {
	 String sql = "SELECT * FROM customers";
	 PreparedStatement pstmt = connection.prepareStatement(sql);
	 ResultSet rs = pstmt.executeQuery();
	 
	 List<Main> mainList = new ArrayList<>();
	 
	 while(rs.next()) {
	 Main row = new Main();
	 row.setStringId(rs.getInt("customer_id"));
	 row.setString(rs.getString("string"));	 
	 mainList.add(row);
	 
	 }
	 return mainList;
}

@Override
public void save(Main main) throws SQLException {
    String sql = "INSERT INTO customers (string) VALUES (?)";
    PreparedStatement pstmt = connection.prepareStatement(sql);
    pstmt.setString(1, main.getString());

    if(pstmt.executeUpdate() > 0) {
        pstmt.getResultSet();
    }
}





//	@Override
//	public Main get(int id) throws SQLException, NOSQLResultsException {
//        String sql = "Select * FROM test_table WHERE string_id = ? LIMIT 1";
//        PreparedStatement pstmt = connection.prepareStatement(sql);
//        pstmt.setInt(1, id);
//
//        ResultSet rs = pstmt.executeQuery();
//        if(rs.next()) {
//            Main row = new Main();
//            row.setStringId(rs.getInt("string_id"));
//            row.setString(rs.getString("string"));
//            return row;
//        } else {
//            throw new NOSQLResultsException("ID: " + id + " not found.");
//        }
//    }
//	
//	@Override
//	    public List<Main> getAll() throws SQLException {
//	        String sql = "SELECT * FROM test_table";
//	        PreparedStatement pstmt = connection.prepareStatement(sql);
//	        ResultSet rs = pstmt.executeQuery();
//
//	        List<Main> mainList = new ArrayList<>();
//
//	        while(rs.next()) {
//	            Main row = new Main();
//	            row.setStringId(rs.getInt("string_id"));
//	            row.setString(rs.getString("string"));
//	            mainList.add(row);
//	        }
//	        return mainList;
//	    }
//
//	@Override
//	    public void save(Main main) throws SQLException {
//	        String sql = "INSERT INTO test_table (string) VALUES (?)";
//	        PreparedStatement pstmt = connection.prepareStatement(sql);
//	        pstmt.setString(1, main.getString());
//
//	        if(pstmt.executeUpdate() > 0) {
//	            pstmt.getResultSet();
//	        }
//	    }

	@Override
	    public void update(Main main, String[] params) {

	    }

	@Override
	    public void delete(Main main) {

	    }

}

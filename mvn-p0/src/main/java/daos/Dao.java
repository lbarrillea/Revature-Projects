package daos;

import java.sql.SQLException;
import java.util.List;

import exceptions.NOSQLResultsException;

public interface Dao<T> {

    T get(int id) throws SQLException, NOSQLResultsException;

    List<T> getAll() throws SQLException;

	void save(T main) throws SQLException;

	void update(T main, String[] params);

	void delete(T main);

}

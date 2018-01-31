package ps.learning.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

  public static void main(String[] args) {
    DbSingleton singleton = DbSingleton.getInstance();

    Connection connection = singleton.getConnection();
    try(Statement statement = connection.createStatement()) {
      statement.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
      System.out.println("Table created");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}

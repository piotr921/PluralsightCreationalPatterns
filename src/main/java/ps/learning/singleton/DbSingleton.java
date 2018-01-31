package ps.learning.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.derby.jdbc.EmbeddedDriver;

public class DbSingleton {

  private static DbSingleton instance = null;
  private static final Object monitor = new Object();
  private Connection connection = null;

  private DbSingleton() {
    try {
      DriverManager.registerDriver(new EmbeddedDriver());
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static DbSingleton getInstance() {
    if (instance == null) {
      synchronized (monitor) {
        instance = new DbSingleton();
      }
    }
    return instance;
  }

  public Connection getConnection() {
    if (connection == null) {
      synchronized (monitor) {
        try {
          connection = DriverManager.getConnection("jdbc:derby:memory:codejava/webdb;create=true");
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    return connection;
  }
}

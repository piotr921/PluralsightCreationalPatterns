package ps.learning.prototype;

import java.util.List;

public class Statement implements Cloneable {

  private String sql;
  private List<String> params;
  private Record record;

  public Statement(String sql, List<String> params, Record record) {
    this.sql = sql;
    this.params = params;
    this.record = record;
  }

  public Statement clone() {
    try {
      return (Statement) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }

  public String getSql() {
    return sql;
  }

  public List<String> getParams() {
    return params;
  }

  public Record getRecord() {
    return record;
  }
}

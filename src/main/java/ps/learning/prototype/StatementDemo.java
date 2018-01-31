package ps.learning.prototype;

import java.util.ArrayList;
import java.util.List;

public class StatementDemo {

  public static void main(String[] args) {
    String sql = "Select * from movies where title = ?";
    List<String> params = new ArrayList<>();
    params.add("Star wars");
    Record record = new Record();

    Statement first = new Statement(sql, params, record);
    System.out.println(first.getSql());
    System.out.println(first.getParams());
    System.out.println(first.getRecord());

    Statement second = first.clone();
    System.out.println(second.getSql());
    System.out.println(second.getParams());
    System.out.println(second.getRecord());
  }
}

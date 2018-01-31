package ps.learning.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

  private Map<String, Item> items = new HashMap<>();

  public Registry() {
    loadItems();
  }

  public Item createItem(String type) {
    Item item = null;
    try {
      item = (Item) items.get(type).clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return item;
  }

  private void loadItems() {
    Movie movie = new Movie();
    movie.setTitle("Batman");
    movie.setPrice(24.99);
    movie.setRuntime("2h25m");
    items.put("Movie", movie);

    Book book = new Book();
    book.setTitle("Wiesmin");
    book.setPrice(14.99);
    book.setNoOfPages(365);
    items.put("Book", book);
  }
}

package ps.learning.prototype;

public class PrototypeDemo {

  public static void main(String[] args) {
    Registry registry = new Registry();
    Movie movie = (Movie) registry.createItem("Movie");
    movie.setTitle("Scary Movie");

    System.out.println(movie);
    System.out.println(movie.getTitle());
    System.out.println(movie.getPrice());
    System.out.println(movie.getUrl());
    System.out.println(movie.getRuntime());

    Movie nextMovie = (Movie) registry.createItem("Movie");
    nextMovie.setTitle("Casablanca");

    System.out.println(nextMovie);
    System.out.println(nextMovie.getTitle());
    System.out.println(nextMovie.getPrice());
    System.out.println(nextMovie.getUrl());
    System.out.println(nextMovie.getRuntime());
  }
}

package ps.learning.singleton;

public class RuntimeDemo {

  public static void main(String[] args) {
    Runtime runtime = Runtime.getRuntime();
    runtime.gc();
    System.out.println(runtime);

    Runtime another = Runtime.getRuntime();
    another.gc();
    System.out.println(another);

    if (runtime == another) {
      System.out.println("Same object");
    }
  }
}

package ps.learning.builder;

public class LunchOrderBuilderDemo {


  public static void main(String[] args) {
    LunchOrderBean lunchOrder = new LunchOrderBean();

    lunchOrder.setBread("Wheat");
    lunchOrder.setCondiments("Lettuce");
    lunchOrder.setDressing("Mustard");
    lunchOrder.setMeat("Ham");

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(lunchOrder.getBread());
    stringBuilder.append(", ");
    stringBuilder.append(lunchOrder.getCondiments());
    stringBuilder.append(", ");
    stringBuilder.append(lunchOrder.getDressing());
    stringBuilder.append(", ");
    stringBuilder.append(lunchOrder.getMeat());

    System.out.println(stringBuilder.toString());


    LunchOrder.SandwichBuilder sandwichBuilder = new LunchOrder.SandwichBuilder();

    LunchOrder order = sandwichBuilder.bread("Wheat").condiments("Tomato").dressing("Mayo").meat("Turkey").build();

    StringBuilder sBuilder = new StringBuilder();
    sBuilder.append(order.getBread());
    sBuilder.append(", ");
    sBuilder.append(order.getCondiments());
    sBuilder.append(", ");
    sBuilder.append(order.getDressing());
    sBuilder.append(", ");
    sBuilder.append(order.getMeat());

    System.out.println(sBuilder.toString());
  }
}

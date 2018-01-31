package ps.learning.builder;

public class LunchOrder {

  public static class SandwichBuilder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    // with mandatory fields
    public SandwichBuilder() {
    }

    public LunchOrder build() {
      return new LunchOrder(this);
    }

    public SandwichBuilder bread(String bread) {
      this.bread = bread;
      return this;
    }

    public SandwichBuilder condiments(String condiments) {
      this.condiments = condiments;
      return this;
    }

    public SandwichBuilder dressing(String dressing) {
      this.dressing = dressing;
      return this;
    }

    public SandwichBuilder meat(String meat) {
      this.meat = meat;
      return this;
    }
  }

  private final String bread;
  private final String condiments;
  private final String dressing;
  private final String meat;

  private LunchOrder(SandwichBuilder builder) {
    this.bread = builder.bread;
    this.condiments = builder.condiments;
    this.dressing = builder.dressing;
    this.meat = builder.meat;
  }

  public String getBread() {
    return bread;
  }

  public String getCondiments() {
    return condiments;
  }

  public String getDressing() {
    return dressing;
  }

  public String getMeat() {
    return meat;
  }
}

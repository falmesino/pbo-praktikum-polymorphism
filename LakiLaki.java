public class LakiLaki extends Manusia {
  public LakiLaki(double tinggiBadan) {
    super(tinggiBadan);
  }

  @Override
  public double HtgBBI() {
    // (tinggiBadan - 100) * 90%
    return (super.getTinggiBadan() - 100) * 0.9;
  }
}
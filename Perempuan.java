public class Perempuan extends Manusia {
  public Perempuan(double tinggiBadan) {
    super(tinggiBadan);
  }

  @Override
  public double HtgBBI() {
    // (tinggiBadan - 100) * 80%
    return (super.getTinggiBadan() - 100) * 0.8;
  }
}
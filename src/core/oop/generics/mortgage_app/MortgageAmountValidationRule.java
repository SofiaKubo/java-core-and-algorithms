package core.oop.generics.mortgage_app;

public class MortgageAmountValidationRule extends ValidationRule<Integer> {
  public MortgageAmountValidationRule(Integer value) {
    super(value, "Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
  }

  @Override
  public boolean isValid() {
    return 1_000_000 <= value && value <= 10_000_000;
  }
}

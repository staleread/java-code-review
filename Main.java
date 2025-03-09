public class Main {
  public static void main(String[] args) {
    var weight = 80.0;
    var height = 1.52;

    var bmi = BmiCalculator.getBmi(weight, height);
    var bmiFeedback = BmiCalculator.getBmiFeedback(bmi);

    System.out.println(bmiFeedback.name());
  }
}

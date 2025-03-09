class BmiCalculator {
  public static double getBmi(double weight, double height) {
    return weight / (height * height);
  }

  public static BmiFeedback getBmiFeedback(double bmi) {
    if (bmi < 18.5) {
      return BmiFeedback.DEFICIT;
    }
    if (bmi >= 18.5 && bmi < 25) {
      return BmiFeedback.NORM;
    }
    if (bmi >= 25 & bmi < 30) {
      return BmiFeedback.WARNING;
    }
    return BmiFeedback.FAT;
  }
}

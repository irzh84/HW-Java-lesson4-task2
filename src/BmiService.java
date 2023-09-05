public class BmiService {
    public double calculate(double weightInKG, double heightInM) {
        double bmi = weightInKG / (heightInM * heightInM);
        return bmi;
    }
}

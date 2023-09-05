public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKG = 98;
        double heightInM = 1.87;

        double myBmi = service.calculate(weightInKG, heightInM);
        int myBmiWhole = (int) myBmi;
        System.out.println(myBmiWhole);
    }
}

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bodyMassIndexForHeight172 = service.calculate(56, 1.72);
        System.out.println(bodyMassIndexForHeight172);

        double bodyMassIndexForHeight182 = service.calculate(82, 1.83);
        System.out.println(bodyMassIndexForHeight182);

        double bodyMassIndexForHeight120 = service.calculate(21, 1.20);
        System.out.println(bodyMassIndexForHeight120);

        double bodyMassIndexForHeight72 = service.calculate(9, 0.72);
        System.out.println(bodyMassIndexForHeight72);
    }
}

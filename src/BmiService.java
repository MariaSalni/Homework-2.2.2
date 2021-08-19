public class BmiService {
    public double calculate (int bodyMass, double height) {
        double bodyMassIndex = bodyMass / height * height;
        return bodyMassIndex;
    }
}

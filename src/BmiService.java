public class BmiService {
    public double calculate(double height, double weight) {
        double heightDegree2 = (height * height);
        double result = (weight / heightDegree2);
        return result;
    }
}

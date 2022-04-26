public class BmiService {
    public double calculate (double weight, double height) {
        double ims  = weight / (height * height);
        return ims;

    }

}

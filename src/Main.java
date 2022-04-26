public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 72;
        double height = 1.72;

        double ims = service.calculate(weight, height);

        System.out.println("Значение Индекса Массы Тела: " + ims);

    }
}

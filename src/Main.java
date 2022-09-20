public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int growth = 165;
        int weight = 50;
        int bmi = service.calculate(growth, weight);

        String description = new String();
        if (bmi >= 0 && bmi <= 16) {
            description = "выраженным дефицитом массы тела.";
        }
        else if (bmi >= 16 && bmi <= 18.5) {
            description = "недостаточной массой тела (дефицит).";
        }
        else if (bmi >= 18.5 && bmi <= 25) {
            description = "нормальной массой тела.";
        }
        else if (bmi >= 25 && bmi <= 30) {
            description = "избыточной массой тела (состояние, предшествующее ожирению).";
        }
        else if (bmi > 30) {
            description = "ожирением.";
        }
        System.out.println("Ваш индекс массы тела = " + bmi + " кг/м2. Вы относитесь к группе людей с " + description);
    }
}

public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        int prase = 7_500;
        int miles = service.calculate(prase);

        System.out.println(miles);


    }
}

import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double budget = Double.parseDouble(input.nextLine());
        int extra = Integer.parseInt(input.nextLine());
        double cloth = Double.parseDouble(input.nextLine());
        double set = 0.1*budget;
        double pcloth = extra*cloth;
        double pdisc = pcloth;
//        System.out.printf("Movie budget : %.2f USD", budget);
//        System.out.printf("%n Number of extras : %d", extra);
//        System.out.printf("%n Price for clothing of one extra : %.2f USD", cloth);
//        System.out.printf("%n Price for decor : %.2f USD", set);
//        System.out.printf("%n Total price for cloth : %.2f USD", pcloth);
        if (extra > 150) {
            pdisc = 0.9*pcloth;
        }
        double total = set+pdisc;
//        System.out.printf("%n Price of cloth after discount : %.2f USD", pdisc);
//        System.out.printf("%n Total sum for the movie : %.2f USD", total);
        if (total > budget) {
            double min = total-budget;
            System.out.printf("%n Not enough money! %n" +
                    "Wingard needs %.2f USD more.", min);
        } else {
            double plus = budget-total;
            System.out.printf("%n Action! %n" +
                    "Wingard starts filming with %.2f USD left.", plus);
        }
     }
}

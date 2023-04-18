import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double trip = Double.parseDouble(input.nextLine());
        int puzz = Integer.parseInt(input.nextLine());
        int doll = Integer.parseInt(input.nextLine());
        int bear = Integer.parseInt(input.nextLine());
        int min = Integer.parseInt(input.nextLine());
        int truck = Integer.parseInt(input.nextLine());
        int toy = puzz+doll+bear+min+truck;
        double price1 = (puzz*2.60)+(doll*3)+(bear*4.10)+(min*8.20)+(truck*2);
        double disc = 0;
        double price2 = price1;
     //   System.out.printf("Price for trip : %.2f USD", trip);
     //   System.out.printf("%n Total toys ordered : %d", toy);
     //   System.out.printf("%n Total price (normal) : %.2f USD", price1);
        if (toy >= 50) {
            disc = price1*0.25;
            price2 = price1-disc;
     //       System.out.printf("%n The discount is : %.2f USD", disc);
     //       System.out.printf("%n The price (final) : %.2f USD", price2);
        }
//        else {
//            System.out.printf("%n The discount is : 0 USD", disc);
//            System.out.printf("%n The price (final) : %.2f USD", price2);
//        }
        double earn = 0.9*price2;
//        System.out.printf("%n Money earned : %.2f USD", earn);
        if (earn >= trip) {
            double sisa = earn-trip;
            System.out.printf("%n Yes! %.2f USD left.", sisa);
        } else {
            double minus = trip-earn;
            System.out.printf("%n Not enough money! %.2f USD needed.", minus);
        }
    }
}

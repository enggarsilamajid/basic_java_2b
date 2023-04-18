import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        double bonus = 0;
        if (num <= 100) {
            bonus = 5;
        } else if (num <= 1000) {
            bonus = 0.2*num;
        } else {
            bonus = 0.1*num;
        } if (num % 2 == 0) {
            bonus = bonus+1;
        } else if (num % 10 == 5) {
            bonus = bonus+2;
        }
        double score = num+bonus;
        System.out.println(bonus);
        System.out.println(num + bonus);
    }
}

//System.out.printf("The actual score is %d" +
//                "%n The bonus is %.2f " +
//                "%n The final score is %.2f", num, bonus, score);
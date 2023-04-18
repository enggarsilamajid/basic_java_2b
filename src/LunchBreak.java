import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int eps = Integer.parseInt(input.nextLine());
        int dur = Integer.parseInt(input.nextLine());
            double lunch = 0.125*dur;
            double rest = 0.25*dur;
            double time = dur-lunch-rest;
//        System.out.printf("%n Duration of episode %d minutes", eps);
//        System.out.printf("%n Duration of lunch %.2f minutes", lunch);
//        System.out.printf("%n Duration of rest %.2f minutes", rest);
//        System.out.printf("%n Remaining time is %.2f minutes", time);
            double rem = time-eps;
            if (rem >= 0) {
                rem = Math.ceil(rem);
                System.out.printf("%n You have enough time to watch %s and left with %.0f minutes free time.", name, rem);
            } else {
                rem = Math.abs(rem);
                rem = Math.ceil(rem);
                System.out.printf("%n You don't have enough time to watch %s, you need %.0f more minutes.", name, rem);
            }
        }
    }

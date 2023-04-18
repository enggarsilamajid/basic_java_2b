import java.util.Scanner;

public class Time15m {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = Integer.parseInt(input.nextLine());
        int num2 = Integer.parseInt(input.nextLine());
        int hour = num1%24;
        int minute = num2%60;
        int add = minute+15;
        int minute2 = add%60;
    //    System.out.printf("Now is : %d:%02d %n", hour, minute);
        if (add >= 60) {
            hour = hour+1;
        }
        if (hour >=24) {
            hour = hour%24;
        }
        System.out.printf("%d:%02d", hour, minute2);
    }
}

//    System.out.printf("The next 15 mins is : %d:%02d", hour, minute2);
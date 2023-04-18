import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time1 = Integer.parseInt(input.nextLine());
        int time2 = Integer.parseInt(input.nextLine());
        int time3 = Integer.parseInt(input.nextLine());
        int total = time1+time2+time3;
        int minute = total/60;
        int sec = total%60;
    //    System.out.printf("time in seconds is %d seconds", total);
        if (sec < 10) {
            System.out.printf("%n %d:%02d", minute, sec);
        } else {
            System.out.printf("%n %d:%d", minute, sec);
        }
    }
}

//System.out.printf("%n Total time is %d:%02d", minute, sec);
//System.out.printf("%n Total time is %d:%d", minute, sec);
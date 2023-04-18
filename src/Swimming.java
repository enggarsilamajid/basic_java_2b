import java.util.Scanner;

public class Swimming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rec = Double.parseDouble(input.nextLine());
        double dist = Double.parseDouble(input.nextLine());
        double time = Double.parseDouble(input.nextLine());
//        System.out.printf("The record is %.2f seconds", rec);
//        System.out.printf("%n The distance is %.2f meters", dist);
//        System.out.printf("%n Oliver swimming %.2f seconds per meter", time);
        double oliv1 = time*dist;
//        System.out.printf("%n Total time Oliver must swim is %.2f seconds", oliv1);
        double down0 = dist/15;
        double down = Math.floor(down0);
        double slow = down*12.5;
//        System.out.printf("%n Total slowing time is %.2f", slow);
        double oliv2 = oliv1+slow;
//        System.out.printf("%n Total time Oliver swimming is %.2f seconds", oliv2);
        if (oliv2 < rec) {
            System.out.printf("%n Yes, he succeeded! The new world record is %.2f seconds.", oliv2);
        } else {
            double plus = oliv2-rec;
            System.out.printf("%n No, he failed! He was %.2f seconds slower.", plus);
        }
    }
}

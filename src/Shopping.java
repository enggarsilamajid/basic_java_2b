import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double budg = Double.parseDouble(input.nextLine());
        int vid = Integer.parseInt(input.nextLine());
        int cpu = Integer.parseInt(input.nextLine());
        int ram = Integer.parseInt(input.nextLine());
        double pvid = 250;
        double cvid = pvid*vid;
        double pcpu = 0.35*cvid;
        double pram = 0.1*cvid;
        double ccpu = pcpu*cpu;
        double cram = pram*ram;
        double total = cvid+ccpu+cram;
        double disc = 0;
//        System.out.printf("Price of video card : %.2f USD", pvid);
//        System.out.printf("%n Price of cpu : %.2f USD", pcpu);
//        System.out.printf("%n Price of RAM : %.2f USD", pram);
//        System.out.printf("%n Total price : %.2f USD", total);
        if (vid > cpu) {
            disc = 0.15*total;
        }
        double bill = total-disc;
//        System.out.printf("%n Discount : %.2f USD", disc);
//        System.out.printf("%n Bill to be paid : %.2f USD", bill);
        if (budg >= bill) {
            double plus = budg-bill;
            System.out.printf("%n You have %.2f USD left!", plus);
        } else {
            double minus = bill-budg;
            System.out.printf("%n Not enough money! You need %.2f USD more!", minus);
        }
    }
}
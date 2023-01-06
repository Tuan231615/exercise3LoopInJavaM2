import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so");
        usd = sc.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Gia tri VND" + quydoi);
    }
}
import java.util.Scanner;

public class hipotenusProgram {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int a,b;
        double c;
        System.out.print("1.Kenari giriniz: ");
        a = girdi.nextInt();

        System.out.print("2.Kenarı giriniz: ");
        b= girdi.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println(c);
    }
}

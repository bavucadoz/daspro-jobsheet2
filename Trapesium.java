import java.util.Scanner;
public class Trapesium {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aB, cD, t;

        System.out.println("panjang AB = ");
        aB = sc.nextDouble();
        System.out.println("Panjang CD = ");
        cD = sc.nextDouble();
        System.out.println("Tinggi Trapesium = ");
        t = sc.nextDouble();

        double aO = ((aB-cD)/2);
        double sisiMiring = Math.sqrt((aO*aO)+(t*t));
        double keliling = (aB+cD+(sisiMiring*2));

        System.out.println("Keliling Trapesium adalah " + keliling );
        sc.close();

    }
}

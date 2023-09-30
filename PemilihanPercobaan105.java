import java.util.Scanner;
/**
 * PemilihanPercobaan105
 */
public class PemilihanPercobaan105 {

    public static void main(String[] args) {
      
        Scanner input05 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input05.nextInt();
        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " Bilangan " + hasil);
           
        input05.close();     }
}

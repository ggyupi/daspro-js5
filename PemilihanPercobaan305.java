import java.util.Scanner;
/**
 * PemilihanPercobaan305
 */
public class PemilihanPercobaan305 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama    : ");
        angka1 = input05.nextDouble();
        System.out.print("Masukkan angka kedua      : ");
        angka2 = input05.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = input05.next().charAt(0);

        input05.close();
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
        }
    }
}

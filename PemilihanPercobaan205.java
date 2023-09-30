import java.util.Scanner;

/**
 * PemilihanPercobaan205
 */
public class PemilihanPercobaan205 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas = input05.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input05.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input05.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input05.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        if (total > 80 && total <= 100) {
            System.out.println("Nilai Akhir " + total);
            System.out.println("Nilai Huruf = A, Nilai Setara = 4, Kualifikasi = Sangat Baik");
        } else if (total > 73 && total <= 80) {
            System.out.println("Nilai Akhir " + total);
            System.out.println("Nilai Huruf = B+, Nilai Setara = 3.5, Kualifikasi = Lebih Dari Baik");
        } else if (total > 65 && total <= 73) {
            System.out.println("Nilai Akhir " + total);
            System.out.println("Nilai huruf = B, Nilai setara = 3, Kualifikasi = Baik");
        } else if (total > 60 && total <= 65) {
            System.out.println("Nilai Akhir " + total);
            System.out.println("Nilai Huruf = C+, Nilai Setara = 2.5, Kualifikasi = Lebih Dari Cukup");
        } else if (total > 50 && total <= 60) {
            System.out.println("Nilai AKhir " + total);
            System.out.println("Nilai Huruf = C, Nilai Setara = 2, Kualifikasi = Cukup");
        }else if (total > 39 && total <= 50) {
            System.out.println("Nilai Akhir " + total);
            System.out.println("Nilai Huruf : D, Nilai Setara : 1, Kualifikasi : Kurang");
        }else if (total > 0 && total <= 39) {
            System.out.println("Nilai AKhir " + total);
            System.out.println("Nilai Huruf : E, Nilai Setara : 0, Kualifikasi : Gagal");

        input05.close();

        }
    }
}

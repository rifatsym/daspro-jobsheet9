import java.util.Scanner;
public class SearchNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan di input: ");
        int jmlMhs = sc.nextInt();

        int[] arrNilai = new int[jmlMhs];

        for (int i = 0; i < arrNilai.length; i++){
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.println("Masukkan Nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++){
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan di dalam array.");
        }
    }
}

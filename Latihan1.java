import java.util.Scanner;
public class Latihan1 {
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;

    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode= kode;
        this.nama= nama;
        this.harga= harga;
        this.jumlah= jumlah;
    }

    public float getTotalPembelian() {
        return harga * jumlah;
    }

    public String getBonus() {
        float totalPembelian = getTotalPembelian();
        if (totalPembelian >= 500000 || jumlah > 5) {
            return "Setrika";
        } else if (totalPembelian >= 100000 || jumlah > 3) {
            return "Payung";
        } else if (totalPembelian >= 50000 || jumlah > 2) {
            return "ballpoint";
        } else {
            return "Tidak mendaptkan bonus";
        }
    }

    public void cetakNota() {
        System.out.println("Kode   : " + kode);
        System.out.println("Nama   : " + nama);
        System.out.println("Harga  : " + harga);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total  : " + getTotalPembelian());
        System.out.println("Bonus  : " + getBonus());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Latihan1 latihan1 = new Latihan1();
        String inputLagi;
        do {
            System.out.print("Kode : ");
            String kode = scanner.nextLine();
            System.out.print("Nama : ");
            String nama = scanner.nextLine();
            System.out.print("Harga : ");
            float harga = scanner.nextFloat();
            System.out.print("Jumlah : ");
            int jumlah = scanner.nextInt();
            scanner.nextLine();

            latihan1.setData(kode, nama, harga, jumlah);
            latihan1.cetakNota();

            System.out.print("Input data lagi [y/t] : ");
            inputLagi = scanner.nextLine();
        } while (inputLagi.equalsIgnoreCase("y"));
    }
}
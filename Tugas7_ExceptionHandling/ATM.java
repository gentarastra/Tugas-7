import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 200_000;

        System.out.println("=== Selamat Datang di ATM ===");
        System.out.println("Saldo Anda saat ini: Rp " + saldo);
        System.out.print("Masukkan jumlah penarikan: Rp ");

        int jumlah = scanner.nextInt();

        try {
            tarikTunai(jumlah, saldo);
        } catch (SaldoTidakCukupException e) {
            System.out.println("Transaksi gagal: " + e.getMessage());
        }

        scanner.close();
    }

    public static void tarikTunai(int jumlah, int saldo) throws SaldoTidakCukupException {
        if (jumlah > saldo) {
            throw new SaldoTidakCukupException("Saldo tidak mencukupi. Saldo Anda: Rp " + saldo);
        }

        System.out.println("Penarikan berhasil sebesar Rp " + jumlah);
        System.out.println("Sisa saldo: Rp " + (saldo - jumlah));
    }
}

class SaldoTidakCukupException extends Exception {
    public SaldoTidakCukupException(String pesan) {
        super(pesan);
    }
}

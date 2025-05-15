package Tugas7_ExceptionHandling;
import java.util.Scanner;

public class Main {

    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 17) {
            throw new IllegalArgumentException("Umur minimal untuk mendaftar adalah 17 tahun.");
        }
        System.out.println("Pendaftaran berhasil. Selamat bergabung!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan umur Anda: ");
            int age = scanner.nextInt();
            validateAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input tidak valid.");
        }
    }
}

# Tugas 7 - Exception Handling (ATM)

## 👤 Identitas
- **Nama:** Genta Rastra Listiawan
- **NIM:** 245150707111031
- **Kelas:** TI-C

## 📚 Tujuan Program
Program ini dibuat untuk memenuhi tugas praktikum Pemrograman Lanjut pada bab Exception Handling. Program mensimulasikan proses penarikan uang dari mesin ATM dengan validasi saldo menggunakan custom exception.

## ❗ Tipe Exception
- `try-catch` digunakan untuk menangani kesalahan input penarikan.
- `throw` digunakan untuk melempar exception secara manual.
- `throws` digunakan dalam method untuk menyatakan bahwa exception bisa dilempar keluar.
- `SaldoTidakCukupException` adalah **custom exception** yang dibuat khusus untuk kasus saldo tidak mencukupi.

## 🔧 Cara Menjalankan
```bash
javac ATM.java
java ATM

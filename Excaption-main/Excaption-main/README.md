# ☕ Exception Handling in Java — Praktikum PBO

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge\&logo=java\&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Practice-blueviolet?style=for-the-badge)

> Praktikum ini membahas penanganan exception dalam Java, mulai dari kasus sederhana hingga penggunaan `throw`, `throws`, `try-catch-finally`, dan custom exception class.

---

## 📚 Deskripsi Proyek

Proyek ini merupakan bagian dari tugas **Pemrograman Berorientasi Objek (PBO)** yang bertujuan untuk:

* Memahami konsep dasar **exception dan error** dalam Java.
* Mempelajari penggunaan struktur `try-catch-finally`.
* Menangani berbagai jenis **exception runtime dan I/O**.
* Menerapkan **custom exception** untuk penanganan kondisi khusus.
* Menguji dan menganalisis program berbasis exception.

---

## 📁 Struktur Folder

```
exception-handling-java/
├── src/
│   ├── Exception1.java
│   ├── Exception2.java
│   ├── Exception3.java
│   ├── CobaException4.java
│   ├── Exception5.java
│   ├── ThrowExample.java
│   ├── ThrowExample2.java
│   ├── Test3.java
│   ├── Utama.java
│   ├── Propagate.java
│   ├── RandomAccessRevisi.java
│   ├── RangeErrorException.java
│   ├── MyException.java
│   └── Eksepsi.java
├── books.txt
└── README.md
```

---

## 🔧 Cara Menjalankan

1. **Kompilasi file Java**
   Buka terminal pada folder `src/` lalu jalankan:

   ```bash
   javac NamaFile.java
   ```

2. **Eksekusi program**

   ```bash
   java NamaFile
   ```

3. **Contoh:**

   ```bash
   javac Exception1.java
   java Exception1
   ```

---

## 📌 Fitur yang Dibahas

* ✔️ Menangani `ArrayIndexOutOfBoundsException`
* ✔️ Menangani `ArithmeticException`
* ✔️ Menangani `IOException` menggunakan `RandomAccessFile`
* ✔️ Penggunaan `throw` dan `throws`
* ✔️ Struktur `try-catch-finally`
* ✔️ Membuat custom exception (`MyException`, `RangeErrorException`)
* ✔️ Debugging menggunakan `getMessage()` dan `printStackTrace()`

---

## 📷 Cuplikan Kode

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Terjadi Aritmatika error: " + e.getMessage());
}
```

---

## 👤 Kontributor

* **Nama:** M Ranggis Refaldi
* **NIM:** 20230040197
* **Kelas:** TI23E
* **Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)

---

## 📝 Lisensi

Proyek ini dibuat untuk keperluan akademik dan praktikum. Bebas digunakan kembali untuk pembelajaran dengan mencantumkan sumber.

---

## 🌟 Showcase

Jika kamu menyukai proyek ini, bantu dengan ⭐ star dan fork untuk eksplorasi lebih lanjut!

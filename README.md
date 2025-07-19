# Thai Tea Gallery App 🍹
**UAS Pemrograman Mobile ITBS-JM**  
**Developer:** Alif Caesar Awaludin  
**NIM:** 221232026  
**Kelas:** ITBS-JM SMT 6

---

## 📱 Deskripsi Aplikasi

Aplikasi ini menampilkan berbagai varian minuman **Thai Tea** beserta resep dan gambarnya. Dibuat menggunakan **Android Studio** dan **Java**.  
Aplikasi memiliki desain modern, navigasi antar halaman, dan tampilan menarik.

---

## 🎯 Fitur Aplikasi

### 1. Splash Screen
- Tampilan awal aplikasi dengan logo Thai Tea dan nama aplikasi
- Terdapat tombol **"Masuk"** untuk melanjutkan ke menu utama

### 2. Menu Utama (Galeri Thai Tea)
- Menampilkan daftar varian Thai Tea dalam bentuk **Grid**
- Tiap item berisi gambar dan nama minuman
- Menggunakan **CardView** dengan tampilan modern

### 3. Halaman Detail
- Saat item diklik, akan terbuka halaman baru dengan:
  - Gambar ukuran besar
  - Nama minuman
  - **Deskripsi lengkap & resep pembuatan panjang**

### 4. Intent & Navigasi
- Splash ➡ Menu Utama  
- Menu Utama ➡ Detail (via Intent kirim gambar, nama, resep)

### 5. Styling dan Desain
- Desain modern & cerah
- **CardView** membulat dengan bayangan lembut
- Background warna pastel
- Layout rapi, gambar responsif (CENTER_CROP)

---

## 🧱 Komponen yang Digunakan

| Komponen       | Fungsi                                    |
|----------------|--------------------------------------------|
| `TextView`     | Menampilkan nama minuman, resep            |
| `ImageView`    | Menampilkan gambar Thai Tea                |
| `Button`       | Navigasi (Masuk, Kembali)                  |
| `Intent`       | Navigasi antar Activity                    |
| `CardView`     | Styling item di menu utama                 |
| `GridLayout`   | Layout grid di MainActivity                |
| `ScrollView`   | Untuk membuat konten dapat discroll        |
| `colors.xml`   | Menyimpan warna aplikasi                   |
| `strings.xml`  | Menyimpan teks aplikasi                    |
| `AndroidManifest.xml` | Deklarasi Activity & permission     |

---

## 🧰 Tools & Teknologi

- **Bahasa**: Java  
- **IDE**: Android Studio  
- **Minimum SDK**: 21  
- **Target API**: 31 (Android 12)  
- **Gradle**: default bawaan Android Studio  

---

## 📸 Screenshot Aplikasi

> _(Masukkan gambar hasil screenshot kamu di repo: folder `/screenshots/` lalu tampilkan di bawah ini)_

**Splash Screen**  
![Splash Screen](screenshots/splash_screen.png)

**Galeri Thai Tea**  
![Galeri](screenshots/galeri_thai_tea.png)

**Halaman Detail**  
![Detail](screenshots/halaman_detail.png)

---

## 📁 Struktur Folder Proyek


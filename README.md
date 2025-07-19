# Thai Tea Gallery App
**UAS Pemrograman Mobile ITBS-JM**  
**Developer:** Alif Caesar Awaludin  
**NIM:** 221232026  
**Kelas:** ITBS-JM SMT 6

---

## Deskripsi Aplikasi

Aplikasi ini menampilkan berbagai varian minuman **Thai Tea** beserta resep dan gambarnya. Dibuat menggunakan **Android Studio** dan **Java**.  
Aplikasi memiliki desain modern, navigasi antar halaman, dan tampilan menarik.

---

## Fitur Aplikasi

### 1. Splash Screen
- Tampilan awal aplikasi dengan logo Thai Tea dan nama aplikasi
- Terdapat tombol **"Masuk dengan input username dan password"** dan **"Daftar dengan input username dan password pengguna baru"** untuk melanjutkan ke halaman menu utama

### 2. Menu Utama (Galeri Thai Tea)
- Menampilkan daftar varian Thai Tea dalam bentuk **Grid**
- Tiap item berisi gambar dan nama minuman
- Menggunakan **CardView** dengan tampilan modern
- Terdapat tombol tambah untuk menambahkan varian thai tea baru

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


## Tools & Teknologi

- **Bahasa**: Java  
- **IDE**: Android Studio  
- **Minimum SDK**: 21  
- **Target API**: 31 (Android 12)  
- **Gradle**: default bawaan Android Studio  

---

# DetailActivity
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/fb9a5f4e-7c7e-4eba-b4de-935e52b7cc1c" />

# MainActivity
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/b4975c17-0cc2-4fb5-91a3-d745bd7a22d5" />

# SplashActivity
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/57c96448-e0b3-4f2f-9412-fcaa7c9a19e3" />

# DatabaseHelper
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/79077ae1-a247-4d4b-af10-521b486d0511" />

# DetailActivity
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/7f1bd7a7-8656-4ff4-bfd4-5baefbed70ae" />

# InputDescriptionActivity
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/b8db4e89-6165-41a1-a27b-900ee6ebad3c" />

# LoginActivity
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/32b2160e-8bac-4874-891a-21cb0e9c509b" />

# RegisterActivity
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/859247b1-6272-4dc1-afe1-3472774c8b77" />


## Fitur
- Ikon
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/f24f3afe-e6b1-4f60-96f3-9d0c4fa85030" />

- Tampilan Grid Menu Thai Tea
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/5c8d642e-c2b1-4a28-81c1-aa4c3c15b5d1" />

- Intent ke halaman Detail
![tampilan masuk](https://github.com/user-attachments/assets/a547dc9d-71ca-475b-b3e9-fdd8a9dd1815)

- Gambar dan Deskripsi lengkap tiap varian
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/85ced02e-0340-40fb-9206-d392a82aeb89" />


- Styling modern dengan CardView
![dashboard](https://github.com/user-attachments/assets/8050b5cc-8af0-4e59-98fc-f743055ffc3f)

## Komponen yang Digunakan
- TextView
![TextView](https://github.com/user-attachments/assets/b6f8b24d-28e2-4d64-8c45-015402be35d2)

- ImageView
![ImageView](https://github.com/user-attachments/assets/514b3906-6d75-4085-94b9-c3b6367de75d)

- Button
![Button](https://github.com/user-attachments/assets/42b2a682-90ff-4d5d-a3bb-997233839c66)

- Intent
![Button](https://github.com/user-attachments/assets/d004cc50-4625-45ee-9fbc-7c1bf7560fdd)

- Color
![Colors](https://github.com/user-attachments/assets/a7a752cb-aa52-4347-881a-61647cfd188c)

- String
![Strings](https://github.com/user-attachments/assets/262e5724-25c3-4551-aa9c-8f3d5afedf82)

- GridLayout
![Scroll View](https://github.com/user-attachments/assets/deda1bc8-0a40-4c04-a108-69fe4afc057f)

- ScrollView
![Grid Layout](https://github.com/user-attachments/assets/eb3fb0a9-37e6-4bca-8f0e-2561a3b7eb9e)

- Android Manifest
![Andoid Manifest](https://github.com/user-attachments/assets/8e62724e-1555-4fdd-be9e-0b2881a478cc)


## Screenshot Aplikasi

> _(Masukkan gambar hasil screenshot kamu di repo: folder `/screenshots/` lalu tampilkan di bawah ini)_

**Splash Screen**  
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/17c8203f-9842-47d9-bbf1-0935e6c9552c" />

**Login Galeri Thai Tea**  
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/76a6f8d1-0c99-4dab-8e29-ff7c60fe6c64" />

**Fitur SQLite Database**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/75686fc3-169e-4a6a-937d-a1f09e8387e0" />

**Login Berhasil**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/b9ed9cea-0d42-447c-a7ea-f238d151221a" />

**Halaman Detail**  
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/95ad6a0a-8dd3-4609-865d-becab48d654f" />

**Tambahkan Foto untuk Menambahkan Foto Baru**
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/1bd48b51-f61d-4fb2-9c72-6d7ec3721e28" />

---
## Developer
Nama: Alif Caesar Awaludin  
NIM: 221232026
Kelas: ITBS-JM SMT 6  

## Link GitHub
https://github.com/alifc/ThaiTeaGalleryApp.git

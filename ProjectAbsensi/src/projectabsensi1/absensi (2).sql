-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 05 Apr 2023 pada 07.13
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `absensi`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `absen_siswa`
--
-- Kesalahan membaca struktur untuk tabel absensi.absen_siswa: #1932 - Table &#039;absensi.absen_siswa&#039; doesn&#039;t exist in engine
-- Kesalahan membaca data untuk tabel absensi.absen_siswa: #1064 - You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near &#039;FROM `absensi`.`absen_siswa`&#039; at line 1

--
-- Trigger `absen_siswa`
--
DELIMITER $$
CREATE TRIGGER `tambah_alfa` BEFORE INSERT ON `absen_siswa` FOR EACH ROW BEGIN
	UPDATE rekap_absensi set alfa = alfa + new.alfa
    WHERE nis = new.nis;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `tambah_hadir` AFTER INSERT ON `absen_siswa` FOR EACH ROW BEGIN
	UPDATE rekap_absensi set hadir = hadir + NEW.hadir 
    WHERE nis = NEW.nis;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `tambah_izin` AFTER INSERT ON `absen_siswa` FOR EACH ROW BEGIN
	UPDATE rekap_absensi set izin = izin + new.izin
    WHERE nis = new.nis;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `tambah_sakit` AFTER INSERT ON `absen_siswa` FOR EACH ROW BEGIN
	UPDATE rekap_absensi set sakit = sakit + new.sakit
    WHERE nis = new.nis;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `loginguru`
--
-- Kesalahan membaca struktur untuk tabel absensi.loginguru: #1932 - Table &#039;absensi.loginguru&#039; doesn&#039;t exist in engine
-- Kesalahan membaca data untuk tabel absensi.loginguru: #1064 - You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near &#039;FROM `absensi`.`loginguru`&#039; at line 1

-- --------------------------------------------------------

--
-- Struktur dari tabel `rekap_absensi`
--
-- Kesalahan membaca struktur untuk tabel absensi.rekap_absensi: #1932 - Table &#039;absensi.rekap_absensi&#039; doesn&#039;t exist in engine
-- Kesalahan membaca data untuk tabel absensi.rekap_absensi: #1064 - You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near &#039;FROM `absensi`.`rekap_absensi`&#039; at line 1
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

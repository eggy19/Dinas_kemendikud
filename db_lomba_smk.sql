-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 18 Apr 2016 pada 15.22
-- Versi Server: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_lomba_smk`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `agama`
--

CREATE TABLE IF NOT EXISTS `agama` (
  `no` int(2) NOT NULL,
  `agama` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `agama`
--

INSERT INTO `agama` (`no`, `agama`) VALUES
(4, 'BUDDHA'),
(5, 'HINDU'),
(1, 'ISLAM'),
(2, 'KATOLIK'),
(3, 'PROTESTAN');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `no` int(3) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `user` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  `level` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`no`, `nama`, `user`, `pass`, `no_hp`, `level`) VALUES
(1, 'Eggy Suprapman', 'admin', 'eggy1910', '085393182350', '1'),
(2, 'Naruto', 'lks', 'lks', '0867536353662', '2'),
(3, 'Monkey D. Luffy', 'ostn', 'ostn', '0876554654688', '3'),
(4, 'corazon', 'fls2n', 'fls2n', '098767667257', '4'),
(5, 'kakashi', 'db', 'db', '086653265323', '5');

-- --------------------------------------------------------

--
-- Struktur dari tabel `loma_fls2n`
--

CREATE TABLE IF NOT EXISTS `loma_fls2n` (
  `nama_lomba` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `loma_fls2n`
--

INSERT INTO `loma_fls2n` (`nama_lomba`) VALUES
('Seni Musik Band'),
('Seni Musik Daerah'),
('Seni Tari Tradisional'),
('Seni Teater Bahasa Indonesia');

-- --------------------------------------------------------

--
-- Struktur dari tabel `lomba_lks`
--

CREATE TABLE IF NOT EXISTS `lomba_lks` (
  `nama_lomba` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `lomba_lks`
--

INSERT INTO `lomba_lks` (`nama_lomba`) VALUES
('Accounting'),
('Agronomy'),
('Animation'),
('Automobile Technology'),
('Bricklaying'),
('CADD Building (Auto CAD)'),
('Cooking'),
('Electrical Installation'),
('Fishery'),
('Graphic Design Technology'),
('IT / Networking Support '),
('IT / Software Application '),
('Ladies Dressmaking'),
('Marketing'),
('Pharmacy'),
('Production Machine'),
('Secretary'),
('Tourist Industry'),
('Web Design'),
('Welding');

-- --------------------------------------------------------

--
-- Struktur dari tabel `lomba_ostn`
--

CREATE TABLE IF NOT EXISTS `lomba_ostn` (
  `nama_lomba` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `lomba_ostn`
--

INSERT INTO `lomba_ostn` (`nama_lomba`) VALUES
('Biologi Terapan'),
('Fisika Terapan'),
('Kimia Terapan'),
('Matematika Non teknologi'),
('Matematika Teknologi');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_juri`
--

CREATE TABLE IF NOT EXISTS `tb_juri` (
  `nip` varchar(18) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `pangkat` varchar(20) NOT NULL,
  `tempat_lahir` varchar(20) NOT NULL,
  `tgl_lahir` varchar(20) NOT NULL,
  `agama` varchar(30) NOT NULL,
  `jenkel` varchar(10) NOT NULL,
  `lomba` varchar(40) NOT NULL,
  `unit_kerja` varchar(20) NOT NULL,
  `alamat_kantor` text NOT NULL,
  `telp_kantor` varchar(13) NOT NULL,
  `alamat_rumah` text NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  `katagori` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_juri`
--

INSERT INTO `tb_juri` (`nip`, `nama`, `pangkat`, `tempat_lahir`, `tgl_lahir`, `agama`, `jenkel`, `lomba`, `unit_kerja`, `alamat_kantor`, `telp_kantor`, `alamat_rumah`, `no_hp`, `katagori`) VALUES
('073673463646766567', 'eggy', 'gjaghsj', 'samarinda', '2015-12-01', 'BUDDHA', 'Laki-Laki', 'Accounting', 'gjshgsjh', 'xckxcx', '087687767', 'samarinda', '0737646348638', 'LKS'),
('0827382372673', 'fauzan', 'hajsh', 'sono', '27 Nov 15', 'PROTESTAN', 'Laki-Laki', 'Debat Bahasa Indonesia', 'eggy', 'udsgjshd', '9236823687263', 'samarinda', '8994872873628', 'Debat Bahasa'),
('516752176527165267', 'eggy', 'pop', 'samarinda', '23 Nov 15', 'KATOLIK', 'Laki-Laki', 'Debat Bahasa Indonesia', 'kantor', 'samarinda', '0186721576251', 'hgnasvnbavsbn', '0637625366234', 'Debat Bahasa'),
('573265376', 'rena', 'gaje', 'jepang', '23 Nov 15', 'HINDU', 'Perempuan', 'Debat Bahasa Inggris', 'kantor', 'jakarata', '0862653623546', 'sanga', '0767576656465', 'Debat Bahasa'),
('78472367253627357', 'mama', 'adadeh', 'sini', '2015-12-10', 'KATOLIK', 'Perempuan', 'Debat Bahasa Inggris', 'ashashka', 'dshjgds', '982323232', 'shjgsdhjs', '0872653263', 'Debat Bahasa'),
('937486734', 'eggy', 'lskajjka', 'bshasjj', '2015-12-03', 'BUDDHA', 'Laki-Laki', 'Debat Bahasa Indonesia', 'hsjhdjh', 'sdsddsd', '02873623', 'samarinda', '082736253', 'Debat Bahasa');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_ketua_kontingen`
--

CREATE TABLE IF NOT EXISTS `tb_ketua_kontingen` (
  `nip` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `pangkat` varchar(20) NOT NULL,
  `tempat_lahir` varchar(20) NOT NULL,
  `tgl_lahir` varchar(20) NOT NULL,
  `agama` varchar(30) NOT NULL,
  `jenkel` varchar(10) NOT NULL,
  `unit_kerja` varchar(20) NOT NULL,
  `alamat_kantor` text NOT NULL,
  `telp_kantor` varchar(13) NOT NULL,
  `alamat_rumah` text NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  `katagori` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_ketua_kontingen`
--

INSERT INTO `tb_ketua_kontingen` (`nip`, `nama`, `pangkat`, `tempat_lahir`, `tgl_lahir`, `agama`, `jenkel`, `unit_kerja`, `alamat_kantor`, `telp_kantor`, `alamat_rumah`, `no_hp`, `katagori`) VALUES
('93437846', 'eggy', 'alpol', 'samarinda', '2015-12-01', 'ISLAM', 'Laki-laki', 'hsjdh', 'sdsdggh', '0373477345', 'cjhfgdjhf', '084734683', 'Debat Bahasa'),
('93786438479834', 'pradana', 'jsdh', 'samarinda', '2015-12-24', 'BUDDHA', 'Laki-Laki', 'dhgg', 'whdjsdgs', '097363654763', 'samarinda', '089635623426', 'Debat Bahasa'),
('98273862352765', 'eggy', 'aja', 'samarinda', '2016-02-10', 'ISLAM', 'Laki-Laki', 'seketaris', 'sangatta', '0862736527635', 'Samarinda', '0865232763532', 'FLS2N');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_pendamping`
--

CREATE TABLE IF NOT EXISTS `tb_pendamping` (
  `nip` varchar(18) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `pangkat` varchar(20) NOT NULL,
  `tempat_lahir` varchar(20) NOT NULL,
  `tgl_lahir` varchar(20) NOT NULL,
  `agama` varchar(30) NOT NULL,
  `jenkel` varchar(10) NOT NULL,
  `lomba` varchar(30) NOT NULL,
  `unit_kerja` varchar(20) NOT NULL,
  `alamat_kantor` text NOT NULL,
  `telp_kantor` varchar(13) NOT NULL,
  `alamat_rumah` text NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  `katagori` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_pendamping`
--

INSERT INTO `tb_pendamping` (`nip`, `nama`, `pangkat`, `tempat_lahir`, `tgl_lahir`, `agama`, `jenkel`, `lomba`, `unit_kerja`, `alamat_kantor`, `telp_kantor`, `alamat_rumah`, `no_hp`, `katagori`) VALUES
('126576125176257', 'hendra', 'jendral', 'samarinda', '2015-12-17', 'ISLAM', 'Laki-Laki', 'Automobile Technology', 'jhsgd', 'sdsdsbndh', '987263576253', 'nsns', '376543457634', 'LKS'),
('846573543645736', 'sayful anwar', 'apaja', 'samarinda', '2015-12-16', 'ISLAM', 'Laki-Laki', 'Debat Bahasa Inggris', 'hjdhsjd', 'dhgsjd', '937463746576', 'samboja', '083746674', 'Debat Bahasa'),
('877263623766867832', 'nanang', 'apa', 'samarinda', '23/11/15', 'BUDDHA', 'Laki-Laki', 'Debat Bahasa Inggris', 'waka', 'samaronda', '0726357256376', 'juanda', '0637253672443', 'Debat Bahasa'),
('963623623876387632', 'alif muna', 'balalalalala', 'samarinda', '2015-12-09', 'KATOLIK', 'Perempuan', 'Debat Bahasa Inggris', 'bendahara', 'jepang', '0823526342653', 'kamboja', '0876352356235', 'Debat Bahasa');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_peserta`
--

CREATE TABLE IF NOT EXISTS `tb_peserta` (
  `nisn` varchar(12) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `kelas` varchar(10) NOT NULL,
  `tempat_lahir` varchar(20) NOT NULL,
  `tgl_lahir` varchar(20) NOT NULL,
  `agama` varchar(30) NOT NULL,
  `jenkel` varchar(10) NOT NULL,
  `bidang_lomba` varchar(40) NOT NULL,
  `asal_sekolah` varchar(20) NOT NULL,
  `alamat_sekolah` text NOT NULL,
  `telp_sekolah` varchar(12) NOT NULL,
  `provinsi` varchar(20) NOT NULL,
  `alamat_rumah` text NOT NULL,
  `hp_pribadi` varchar(12) NOT NULL,
  `katagori` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_peserta`
--

INSERT INTO `tb_peserta` (`nisn`, `nama`, `kelas`, `tempat_lahir`, `tgl_lahir`, `agama`, `jenkel`, `bidang_lomba`, `asal_sekolah`, `alamat_sekolah`, `telp_sekolah`, `provinsi`, `alamat_rumah`, `hp_pribadi`, `katagori`) VALUES
('0738473874', 'onigiru', 'XII TKJ 1', 'jepang', '27/11/15', 'HINDU', 'Perempuan', 'Debat Bahasa Indonesia', 'oxford', 'sjdgsjdhgs', '298378726367', 'hdsddgfd', 'fdgfdgfdg', '982939746386', 'Debat Bahasa'),
('2837387467', 'sabo', '10', 'Samarinda', '2015-12-24', 'ISLAM', 'Laki-Laki', 'Web Design', 'smkn8 ', 'aminahsyukur', '083477348374', 'Samarinda', 'sana sini', '023878273627', 'LKS'),
('6236283682', 'Rifki Randa', '10', 'bontang', '27/11/15', 'PROTESTAN', 'Laki-Laki', 'Debat Bahasa Indonesia', 'SMKN7', 'Aminah Syukur', '082362563526', 'Samarinda', 'gatsu', '085541325413', 'Debat Bahasa'),
('6238235435', 'ryfanda', 'xii', 'samarinda', '1998-01-08', 'ISLAM', 'Laki-Laki', 'IT / Networking Support ', 'smkn7', 'aminah syukur', '762357263567', 'samarinda', 'sana', '083764572643', 'LKS'),
('9236263572', 'rizky amar', 'XII RPL 3', 'Samarinda', '2015-12-18', 'ISLAM', 'Laki-Laki', 'Debat Bahasa Inggris', 'SMKN7 SAMARINDA', 'ghfdhgs', '027737523652', 'Samarinda', 'aminah syukur', '008237635263', 'Debat Bahasa'),
('9971726375', 'Axel T.J.S', 'XII RPL 1', 'Samarinda', '27/11/15', 'ISLAM', 'Laki-Laki', 'Debat Bahasa Inggris', 'Samarinda', 'Aminah Syukur', '083827368236', 'Samarinda', 'Karang paci', '088632753626', 'Debat Bahasa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `agama`
--
ALTER TABLE `agama`
 ADD PRIMARY KEY (`agama`), ADD KEY `agama` (`agama`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
 ADD PRIMARY KEY (`no`);

--
-- Indexes for table `loma_fls2n`
--
ALTER TABLE `loma_fls2n`
 ADD PRIMARY KEY (`nama_lomba`);

--
-- Indexes for table `lomba_lks`
--
ALTER TABLE `lomba_lks`
 ADD PRIMARY KEY (`nama_lomba`);

--
-- Indexes for table `lomba_ostn`
--
ALTER TABLE `lomba_ostn`
 ADD PRIMARY KEY (`nama_lomba`);

--
-- Indexes for table `tb_juri`
--
ALTER TABLE `tb_juri`
 ADD PRIMARY KEY (`nip`), ADD KEY `agama` (`agama`), ADD KEY `agama_2` (`agama`);

--
-- Indexes for table `tb_ketua_kontingen`
--
ALTER TABLE `tb_ketua_kontingen`
 ADD PRIMARY KEY (`nip`), ADD KEY `agama` (`agama`);

--
-- Indexes for table `tb_pendamping`
--
ALTER TABLE `tb_pendamping`
 ADD PRIMARY KEY (`nip`), ADD KEY `agama` (`agama`);

--
-- Indexes for table `tb_peserta`
--
ALTER TABLE `tb_peserta`
 ADD PRIMARY KEY (`nisn`), ADD KEY `Agama` (`agama`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tb_juri`
--
ALTER TABLE `tb_juri`
ADD CONSTRAINT `tb_juri_ibfk_1` FOREIGN KEY (`agama`) REFERENCES `agama` (`agama`);

--
-- Ketidakleluasaan untuk tabel `tb_ketua_kontingen`
--
ALTER TABLE `tb_ketua_kontingen`
ADD CONSTRAINT `tb_ketua_kontingen_ibfk_1` FOREIGN KEY (`agama`) REFERENCES `agama` (`agama`);

--
-- Ketidakleluasaan untuk tabel `tb_pendamping`
--
ALTER TABLE `tb_pendamping`
ADD CONSTRAINT `tb_pendamping_ibfk_1` FOREIGN KEY (`agama`) REFERENCES `agama` (`agama`);

--
-- Ketidakleluasaan untuk tabel `tb_peserta`
--
ALTER TABLE `tb_peserta`
ADD CONSTRAINT `tb_peserta_ibfk_1` FOREIGN KEY (`agama`) REFERENCES `agama` (`agama`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- MySQL dump 10.17  Distrib 10.3.25-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: pemadam
-- ------------------------------------------------------
-- Server version	10.3.25-MariaDB-0ubuntu0.20.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `barangmasuk`
--

DROP TABLE IF EXISTS `barangmasuk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `barangmasuk` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idperalatan` char(10) NOT NULL,
  `namaperalatan` varchar(100) NOT NULL,
  `tanggal` date NOT NULL,
  `jumlah` varchar(5) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `barangmasuk`
--

LOCK TABLES `barangmasuk` WRITE;
/*!40000 ALTER TABLE `barangmasuk` DISABLE KEYS */;
/*!40000 ALTER TABLE `barangmasuk` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groupa`
--

DROP TABLE IF EXISTS `groupa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groupa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nrk` char(6) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `group` varchar(1) NOT NULL DEFAULT '',
  `idperalatan` varchar(10) NOT NULL DEFAULT '',
  `namaperalatan` varchar(100) NOT NULL DEFAULT '',
  `kondisi` varchar(10) NOT NULL DEFAULT '',
  `keterangan` varchar(100) NOT NULL DEFAULT '',
  `jenis` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groupa`
--

LOCK TABLES `groupa` WRITE;
/*!40000 ALTER TABLE `groupa` DISABLE KEYS */;
INSERT INTO `groupa` VALUES (2,'180438','friska ramadhan','A','002','nozle','Baik','baik','HIGH PRESSURE'),(3,'180467','anto','B','001','nozle 1,5\"','Baik','siap tempur','HIGH PRESSURE'),(5,'180675','umar','A','003','selang2,5\"','Baik','siap tempur','HIGH PRESSURE'),(6,'180438','friska ramadehan','A','001','nozle 1,5\"','Baik','siap tempur','HIGH PRESSURE');
/*!40000 ALTER TABLE `groupa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groupb`
--

DROP TABLE IF EXISTS `groupb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groupb` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nrk` char(6) NOT NULL,
  `nama` varchar(20) NOT NULL DEFAULT '',
  `group` varchar(1) NOT NULL DEFAULT '',
  `idperalatan` varchar(10) NOT NULL DEFAULT '',
  `namaperalatan` varchar(100) NOT NULL DEFAULT '',
  `kondisi` varchar(10) NOT NULL DEFAULT '',
  `keterangan` varchar(100) NOT NULL DEFAULT '',
  `jenis` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groupb`
--

LOCK TABLES `groupb` WRITE;
/*!40000 ALTER TABLE `groupb` DISABLE KEYS */;
INSERT INTO `groupb` VALUES (1,'180435','arik','B','001','nozle 1,5\"','Baik','siap tempur','HIGH PRESSURE');
/*!40000 ALTER TABLE `groupb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groupc`
--

DROP TABLE IF EXISTS `groupc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groupc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nrk` char(6) NOT NULL,
  `nama` varchar(20) NOT NULL DEFAULT '',
  `group` varchar(1) NOT NULL DEFAULT '',
  `idperalatan` varchar(10) NOT NULL DEFAULT '',
  `namaperalatan` varchar(100) NOT NULL DEFAULT '',
  `kondisi` varchar(10) NOT NULL DEFAULT '',
  `keterangan` varchar(100) NOT NULL DEFAULT '',
  `jenis` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groupc`
--

LOCK TABLES `groupc` WRITE;
/*!40000 ALTER TABLE `groupc` DISABLE KEYS */;
INSERT INTO `groupc` VALUES (4,'180498','ali','C','001','nozle1,5\"','buruk','buruk','HIGH PRESSURE'),(5,'189762','Ilham Nur Alamsyah','C','001','noozle 1,5\"','Baik','Mantap','MEDIUM PRESSURE'),(6,'189762','Ilham Nur Alamsyah','C','002','nozzle 1.5\" a','Baik','Bagus','PERALATAN MASYARAKAT');
/*!40000 ALTER TABLE `groupc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pegawai`
--

DROP TABLE IF EXISTS `pegawai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pegawai` (
  `nrk` char(6) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `nip` char(20) NOT NULL DEFAULT '',
  `alamat` varchar(100) NOT NULL DEFAULT '',
  `tanggallahir` date NOT NULL,
  `group` varchar(1) NOT NULL,
  `password` varchar(100) NOT NULL DEFAULT '',
  `username` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`nrk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pegawai`
--

LOCK TABLES `pegawai` WRITE;
/*!40000 ALTER TABLE `pegawai` DISABLE KEYS */;
INSERT INTO `pegawai` VALUES ('121212','Anton','123213','Sukabumi','2021-05-03','A','password','user'),('129876','Marzuki.m','196302181986091001','parung,bogor','1963-02-18','A','679','marzuki'),('145643','Kuat Prianto','198409172009041004','jakta barat','1984-09-17','B','768','kuat'),('156789','Miftahul Arifin','198010242009041004','cisauk','2020-10-24','B','543','miftahul'),('165706','Tito Setiawan','199010092011011002','jakarta pusat','1990-09-10','C','6785','tito'),('165789','Rachman Nugroho, Kom','198211282009041006','jakarta barat','1982-11-28','B','890','rachman'),('167489','Widianto, SE','198001162008011017','bogor','1980-01-16','A','321','widianto'),('167829','Heri Supriyasi, S.AP','196709171991021001','jakarta barat','1967-09-17','B','789','heri'),('176785','Muhammad Abidin','199012132011011001','Jakarta Utara','1990-12-13','B','6754','muhammad'),('178398','Harsono, SH','19811006200009041003','ciracas,JAKTIM','1981-06-10','A','456','harsono'),('179329','Uung Surnita','198103092009041004','tangerang selatan','1981-03-09','A','888888','uung'),('180438','Friska Ramadhan','1989040720110111004','bekasi','1989-04-07','A','123','bismillah'),('180489','Iskandarsyah','19880825201101101','bekasi','1988-08-25','A','654321','iskandar'),('180567','Dika Aditya Ramadhan','199203302011011001','bekasi','1992-03-30','A','777777','dika'),('180578','Iwan Sugiyono','198408122009041007','jakarta','1984-08-08','A','222222','iwan'),('180589','Rahmadhon ilyas','198007162008011016','jakarta','1981-04-07','A','123456','ilyas'),('180670','Hery Setiawan','198509092009041004','tangerang','1985-09-09','A','111111','hery'),('187689','Sutan Tinur Ahkaf','198803242011011004','jakarta timur','1988-03-24','B','564','sutan'),('189762','Ilham Nur Alamsyah','199207012011011001','jakarta utara','1992-01-07','C','7869','ilham');
/*!40000 ALTER TABLE `pegawai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pengadaanbarang`
--

DROP TABLE IF EXISTS `pengadaanbarang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pengadaanbarang` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idperalatan` char(10) NOT NULL,
  `namaperalatan` varchar(100) NOT NULL,
  `tanggal` date NOT NULL,
  `jumlah` varchar(5) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pengadaanbarang`
--

LOCK TABLES `pengadaanbarang` WRITE;
/*!40000 ALTER TABLE `pengadaanbarang` DISABLE KEYS */;
INSERT INTO `pengadaanbarang` VALUES (1,'002','nozzle 1.5\" a','2021-05-04','1');
/*!40000 ALTER TABLE `pengadaanbarang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `peralatan`
--

DROP TABLE IF EXISTS `peralatan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `peralatan` (
  `idperalatan` char(10) NOT NULL,
  `namaperalatan` varchar(100) NOT NULL DEFAULT '',
  `kondisi` varchar(50) NOT NULL DEFAULT '',
  `keterangan` varchar(200) NOT NULL DEFAULT '',
  PRIMARY KEY (`idperalatan`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peralatan`
--

LOCK TABLES `peralatan` WRITE;
/*!40000 ALTER TABLE `peralatan` DISABLE KEYS */;
INSERT INTO `peralatan` VALUES ('001','noozle 1,5\"','baik','baik'),('002','nozzle 1.5\" a','baik','baik'),('003','selang 1,5\" a','baik','baik'),('004','nozzle 1,5\" b','baik','baik'),('005','nozzle 1,5\" c','baik','baik'),('006','selang 1,5 a','baik','baik'),('007','nozzle 2,5\"','baik','bisa di gunakan'),('008','pipa cabang 1,5\"','baik','baik'),('009','selang 1,5\" b','baik','baik'),('010','selang 1,5\" c','baik','baik'),('011','kunci hydrant','baik','baik');
/*!40000 ALTER TABLE `peralatan` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-26 23:13:11

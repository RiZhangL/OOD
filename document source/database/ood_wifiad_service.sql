CREATE DATABASE  IF NOT EXISTS `ood` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `ood`;
-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ood
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `wifiad_service`
--

DROP TABLE IF EXISTS `wifiad_service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `wifiad_service` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `station_id` int(11) DEFAULT NULL,
  `service_name` varchar(45) DEFAULT NULL,
  `service_detail` varchar(1000) DEFAULT NULL,
  `service_pic` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wifiad_service`
--

LOCK TABLES `wifiad_service` WRITE;
/*!40000 ALTER TABLE `wifiad_service` DISABLE KEYS */;
INSERT INTO `wifiad_service` VALUES (1,1,'Shanghai Museum','The Shanghai Museum has 11 special halls and 3 exhibition halls, covering an area of 2,800 square meters. It has nearly one million pieces of cultural relics in its collection, including 120,000 fine ones, which are especially characterized by bronze ware, ceramics, calligraphy and painting. Collected from Baoji, Henan, Hunan and other places of bronze, cultural relics \"half of the country\" reputation, is a large museum of ancient Chinese art.','service1.jpg'),(2,1,'Bank','BANK OF CHINA, INDUSTRIAL AND COMMERCIAL BANK OF CHINA, AGRICULTURAL BANK OF CHINA, China Construction Bank, Postal Savings Bank of China, BANK OF COMMUNICATIONS','service2.jpg'),(3,1,'Shanghai Grand Theatre','Shanghai Grand Theatre covers an area of about 21,000 square meters, with a total construction area of 70,000 square meters. The total height of the building is 40 meters. It is divided into 8 floors above ground and 2 floors below ground. The Shanghai Grand Theatre consists of three theatres, including the Ticket Center, Ballet rehearsal room, Band rehearsal room, VIP room, exhibition room, art shop, coffee bar, banquet hall and parking garage.','service3.jpg');
/*!40000 ALTER TABLE `wifiad_service` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-07 18:14:32

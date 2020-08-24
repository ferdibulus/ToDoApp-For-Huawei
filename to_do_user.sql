-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: to_do
-- ------------------------------------------------------
-- Server version	5.7.31-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKob8kqyqqgmefl0aco34akdtpe` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'ferdi_bulus@hotmail.com','Ferdi','BULUS','$2a$10$d8QfLSGYtaYGZVT37G1ywu51RkHWkQX3gtIFtfyXyrZhHx5Od2GkS'),(2,'erdi_bulus@hotmail.com','erdi','bulus','$2a$10$LF.9jcYFwoaskgGkbZGL1.4xz/U0Pqe.l8jCqmuFCMoZNITi7R0Ne'),(3,'basa@hotmail.com','basak','ozdemir','$2a$10$WzSv2HxkBKdzHwWnCTByWO8PPTA6qvvgWcqKXdJszo2Kjn96xKoKK'),(4,'lapone1042@inmail3.com','Robert ','BULUS','$2a$10$UeEIfyXOsyl94ZOiK7xIIuoDJtjv2V9wlbhiBIUKTFQe8RMAQlAB.'),(5,'dsad@hotmail.com','eymen','uras','$2a$10$A.33fseR5.naRXe039NY0exDkg3UxeIk0cmhDo2s.f9vWTymxpu0C'),(6,'ferdibulus08@gmail.com','qq','qq','$2a$10$ia2ZPC26ftHlbBlUGW3Ny.maMhiA8w4L3JCKcxcaSqHVZrD6gkXoe'),(8,'ferdi_buludsadas@hotmail.com','Melez','BULUS','$2a$10$EU4flRn/upqP8/Jxx5RxP.q/3e4EssT6DKKpupuiuMhxx/jnqh/o6'),(9,'fe11rdibulus08@gmail.com','Melez','11','$2a$10$WYLUstuWd9LyeBsddZIKT.6tv/4ZJmxlrQvhstc.1unWC.G07e1V.'),(10,'robert@inmail3.com','Robert ','BULUS','$2a$10$n5YQKuybhdxTXGqBKMPF0uG8fUSR1.JagJ3KvZvmQGfQC8TkFRxBS');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-24  7:22:56

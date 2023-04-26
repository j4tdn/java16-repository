-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: java16_shopping_test
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `ID` int NOT NULL,
  `NAME` varchar(100) NOT NULL,
  `PHONE` varchar(22) NOT NULL,
  `ADDRESS` text NOT NULL,
  `ACCOUNT` varchar(100) NOT NULL,
  `PASSWORD` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Le Teo','123456789','Da Nang','leteo123','abctoklqjsl5hdyd'),(2,'Le Na','568945726','Quang Nam','lena234','abctoklqjsl5hdyd'),(3,'Hoang Ha','369852172','Quang Binh','hha256','abctoklqjsl5hdyd'),(4,'Phan Van','222356485','Quang Tri','pvan256','abctoklqjsl5hdyd');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item` (
  `ID` int NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `COLOR` varchar(50) NOT NULL,
  `BUY_PRICE` double NOT NULL,
  `SELL_PRICE` double NOT NULL,
  `METERIAL` varchar(50) NOT NULL,
  `ITEM_GROUP_ID` int NOT NULL,
  `PROVIDER_ID` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_ITEM_ITEM_GROUP` (`ITEM_GROUP_ID`),
  KEY `FK_ITEM_PROVIDER` (`PROVIDER_ID`),
  CONSTRAINT `FK_ITEM_PROVIDER` FOREIGN KEY (`PROVIDER_ID`) REFERENCES `provider` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (1,'Áo 1','Vàng',420,560,'Coton',1,1),(2,'Áo 2','Trắng',180,860,'Coton',1,2),(3,'Quần 1','Xanh',120,260,'Coton',2,3),(4,'Quần 2','Vàng',320,980,'Coton',2,3),(5,'Mũ 1','Xanh',115,156,'Coton',3,2),(6,'Mũ 2','Đỏ',230,460,'Coton',3,3),(7,'Giày 1','Xanh',220,450,'Coton',4,2),(8,'Giày 2','Đỏ',600,800,'Coton',4,1),(9,'Dép 1','Xanh',700,990,'Coton',5,1),(10,'Dép 2','Vàng',210,225,'Coton',5,2);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_detail`
--

DROP TABLE IF EXISTS `item_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_detail` (
  `ITEM_ID` int NOT NULL,
  `SIZE_ID` varchar(5) NOT NULL,
  `AMOUNT` int NOT NULL,
  PRIMARY KEY (`ITEM_ID`,`SIZE_ID`),
  KEY `FK_ITEM_DETAIL_SIZE` (`SIZE_ID`),
  CONSTRAINT `FK_ITEM_DETAIL_ITEM` FOREIGN KEY (`ITEM_ID`) REFERENCES `item` (`ID`),
  CONSTRAINT `FK_ITEM_DETAIL_SIZE` FOREIGN KEY (`SIZE_ID`) REFERENCES `size` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_detail`
--

LOCK TABLES `item_detail` WRITE;
/*!40000 ALTER TABLE `item_detail` DISABLE KEYS */;
INSERT INTO `item_detail` VALUES (1,'M',40),(1,'S',12),(2,'L',70),(2,'M',22),(2,'S',60),(2,'XL',40),(3,'M',55),(3,'S',70),(4,'M',26),(4,'S',99),(5,'L',8),(5,'M',12),(5,'S',22),(5,'XL',22),(5,'XXL',60),(6,'M',23),(6,'S',12),(7,'L',120),(7,'M',63),(7,'S',12),(7,'XL',66),(8,'M',18),(8,'S',44),(9,'M',55),(9,'S',66),(10,'M',66),(10,'S',88);
/*!40000 ALTER TABLE `item_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_group`
--

DROP TABLE IF EXISTS `item_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_group` (
  `ID` int NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `DESC` text,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_group`
--

LOCK TABLES `item_group` WRITE;
/*!40000 ALTER TABLE `item_group` DISABLE KEYS */;
INSERT INTO `item_group` VALUES (1,'Áo','Loại Hàng - Áo'),(2,'Quần','Loại Hàng - Quần'),(3,'Mũ','Loại Hàng - Mũ'),(4,'Giày','Loại Hàng - Giày'),(5,'Dép','Loại Hàng - Dép'),(6,'Nịt Bụng','Loại Hàng - Nịt Bụng');
/*!40000 ALTER TABLE `item_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
  `ID` int NOT NULL,
  `ORDER_TIME` datetime NOT NULL DEFAULT (now()),
  `TOTAL_OF_MONEY` double DEFAULT NULL,
  `DELIVERY_FEE` double NOT NULL DEFAULT (0),
  `DELIVERY_PLACE` text NOT NULL,
  `CUSTOMER_ID` int NOT NULL,
  `PAYMENT_TYPE_ID` int NOT NULL,
  `NOTE` text,
  PRIMARY KEY (`ID`),
  KEY `FK_ORDER_PAYMENT_TYPE` (`PAYMENT_TYPE_ID`),
  CONSTRAINT `FK_ORDER_PAYMENT_TYPE` FOREIGN KEY (`PAYMENT_TYPE_ID`) REFERENCES `payment_type` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (1,'2020-03-06 20:02:55',200,10,'Nam Cao',1,1,'Nothing'),(2,'2019-12-06 20:02:55',460,15,'Dong Ke',2,1,'Nothing'),(3,'2018-11-06 20:02:55',180,10,'Nam Cao',3,1,'Nothing'),(4,'2023-03-26 13:29:49',336,15,'Au Co',4,1,'Nothing'),(5,'2010-03-06 20:02:55',988,10,'Nam Cao',4,1,'Nothing'),(6,'2023-03-26 13:29:49',258,50,'Pham Nhu Xuong',2,1,'Nothing'),(7,'2019-11-29 20:02:55',200,10,'Quang Trung',2,1,'Nothing'),(8,'2020-03-06 20:02:55',400,15,'Tran Cao Van',3,1,'Nothing'),(9,'2026-03-06 20:02:55',866,10,'Nam Cao',3,1,'Nothing'),(10,'2020-10-10 20:02:55',330,30,'Ong Ich Khiem',2,1,'Nothing');
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_detail`
--

DROP TABLE IF EXISTS `order_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_detail` (
  `ORDER_ID` int NOT NULL,
  `ITEM_ID` int NOT NULL,
  `AMOUNT` int NOT NULL,
  PRIMARY KEY (`ORDER_ID`,`ITEM_ID`),
  KEY `FK_ORDER_DETAIL_ITEM` (`ITEM_ID`),
  CONSTRAINT `FK_ORDER_DETAIL_ITEM` FOREIGN KEY (`ITEM_ID`) REFERENCES `item` (`ID`),
  CONSTRAINT `FK_ORDER_DETAIL_ORDER` FOREIGN KEY (`ORDER_ID`) REFERENCES `order` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_detail`
--

LOCK TABLES `order_detail` WRITE;
/*!40000 ALTER TABLE `order_detail` DISABLE KEYS */;
INSERT INTO `order_detail` VALUES (1,1,6),(1,2,4),(1,8,6),(2,1,6),(2,3,8),(2,5,7),(2,10,1),(3,2,2),(3,9,6),(4,3,3),(4,6,6),(5,1,6),(5,4,4),(6,1,6),(6,2,6),(6,4,6),(6,5,5),(6,7,6),(7,1,6),(7,5,6),(8,4,6),(8,8,7),(9,2,2),(9,4,6),(9,9,6),(10,1,2),(10,6,2),(10,8,6);
/*!40000 ALTER TABLE `order_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment_type`
--

DROP TABLE IF EXISTS `payment_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment_type` (
  `ID` int NOT NULL,
  `DESC` text NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment_type`
--

LOCK TABLES `payment_type` WRITE;
/*!40000 ALTER TABLE `payment_type` DISABLE KEYS */;
INSERT INTO `payment_type` VALUES (1,'Tiền mặt'),(2,'Chuyển khoản'),(3,'Tín dụng trong nước'),(4,'Tín dụng quốc tế');
/*!40000 ALTER TABLE `payment_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `provider`
--

DROP TABLE IF EXISTS `provider`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `provider` (
  `ID` int NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `ADDRESS` text NOT NULL,
  `PHONE` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provider`
--

LOCK TABLES `provider` WRITE;
/*!40000 ALTER TABLE `provider` DISABLE KEYS */;
INSERT INTO `provider` VALUES (1,'Provider A','P1','123456789'),(2,'Provider B','P2','123789456'),(3,'Provider C','P3','789123456');
/*!40000 ALTER TABLE `provider` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `size`
--

DROP TABLE IF EXISTS `size`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `size` (
  `ID` varchar(5) NOT NULL,
  `DESC` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `size`
--

LOCK TABLES `size` WRITE;
/*!40000 ALTER TABLE `size` DISABLE KEYS */;
INSERT INTO `size` VALUES ('L','Từ 51 đến 65 kg'),('M','Từ 41 đến 50 kg'),('S','Từ 30 đến 40 kg'),('XL','Từ 66 đến 72 kg'),('XXL','Từ 73 đến 80 kg');
/*!40000 ALTER TABLE `size` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-17 20:39:07

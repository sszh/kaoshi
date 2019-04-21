
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


INSERT INTO product VALUES ('1', 'Car', '290000.1');
INSERT INTO product VALUES ('2', 'PC', '5600.2');
INSERT INTO product VALUES ('3', 'IPhone', '8000.3');


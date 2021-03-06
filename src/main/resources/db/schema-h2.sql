
DROP TABLE IF EXISTS user;

CREATE TABLE user
(
	test_id BIGINT(20) NOT NULL COMMENT '主键ID',
	tenant_id BIGINT(20) NOT NULL COMMENT '租户ID',
	name VARCHAR(30) NULL DEFAULT NULL COMMENT '名称',
	age INT(11) NULL DEFAULT NULL COMMENT '年龄',
	test_type INT(11) NULL DEFAULT NULL COMMENT '测试下划线字段命名类型',
	test_date DATETIME NULL DEFAULT NULL COMMENT '日期',
	role BIGINT(20) NULL DEFAULT NULL COMMENT '测试',
	phone VARCHAR(11) NULL DEFAULT NULL COMMENT '手机号码',
	PRIMARY KEY (test_id)
);

CREATE TABLE `t_order` (
  `order_id` INT(32) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) DEFAULT NULL,
  `status` VARCHAR(10) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=INNODB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `t_order_0` (
  `order_id` INT(32) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) DEFAULT NULL,
  `status` VARCHAR(10) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=INNODB AUTO_INCREMENT=397 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `t_order_1` (
  `order_id` INT(32) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) DEFAULT NULL,
  `status` VARCHAR(10) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=INNODB AUTO_INCREMENT=395 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `t_order_2` (
  `order_id` INT(32) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) DEFAULT NULL,
  `status` VARCHAR(10) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=INNODB AUTO_INCREMENT=399 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


CREATE TABLE `t_order_item_0` (
   `order_item_id` INT(32) NOT NULL AUTO_INCREMENT,
   `order_id` INT(32) DEFAULT NULL,
   `user_id` INT(11) DEFAULT NULL,
   `price` DECIMAL(8,2) DEFAULT NULL,
   `status` VARCHAR(10) COLLATE utf8_bin DEFAULT NULL,
   `create_time` DATETIME DEFAULT NULL,
   PRIMARY KEY (`order_item_id`)
 ) ENGINE=INNODB AUTO_INCREMENT=400 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

 CREATE TABLE `t_order_item_1` (
   `order_item_id` INT(32) NOT NULL AUTO_INCREMENT,
   `order_id` INT(32) DEFAULT NULL,
   `user_id` INT(11) DEFAULT NULL,
   `price` DECIMAL(8,2) DEFAULT NULL,
   `status` VARCHAR(10) COLLATE utf8_bin DEFAULT NULL,
   `create_time` DATETIME DEFAULT NULL,
   PRIMARY KEY (`order_item_id`)
 ) ENGINE=INNODB AUTO_INCREMENT=400 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

  CREATE TABLE `t_order_item_2` (
   `order_item_id` INT(32) NOT NULL AUTO_INCREMENT,
   `order_id` INT(32) DEFAULT NULL,
   `user_id` INT(11) DEFAULT NULL,
   `price` DECIMAL(8,2) DEFAULT NULL,
   `status` VARCHAR(10) COLLATE utf8_bin DEFAULT NULL,
   `create_time` DATETIME DEFAULT NULL,
   PRIMARY KEY (`order_item_id`)
 ) ENGINE=INNODB AUTO_INCREMENT=400 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


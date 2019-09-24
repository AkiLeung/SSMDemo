/*
 Navicat Premium Data Transfer

 Source Server         : MYSQL57
 Source Server Type    : MySQL
 Source Server Version : 50716
 Source Host           : localhost:3306
 Source Schema         : dbtest

 Target Server Type    : MySQL
 Target Server Version : 50716
 File Encoding         : 65001

 Date: 24/09/2019 16:54:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_sysl_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `tb_sysl_role_permission`;
CREATE TABLE `tb_sysl_role_permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色id',
  `permission_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 875 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_sysl_role_permission
-- ----------------------------
INSERT INTO `tb_sysl_role_permission` VALUES (1, 'R00000', 'P0000');
INSERT INTO `tb_sysl_role_permission` VALUES (869, 'R00001', 'P0001');
INSERT INTO `tb_sysl_role_permission` VALUES (870, 'R00001', 'P0002');
INSERT INTO `tb_sysl_role_permission` VALUES (871, 'R00001', 'P0003');
INSERT INTO `tb_sysl_role_permission` VALUES (872, 'R00001', 'P0004');
INSERT INTO `tb_sysl_role_permission` VALUES (873, 'R00002', 'P0005');
INSERT INTO `tb_sysl_role_permission` VALUES (874, 'R00002', 'P0006');

-- ----------------------------
-- Table structure for tbl_sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `tbl_sys_permission`;
CREATE TABLE `tbl_sys_permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permission_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限id',
  `permission_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限名称',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限访问路径',
  `type` int(1) NULL DEFAULT NULL COMMENT '类型   0：目录   1：菜单   2：按钮',
  `icon` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图标',
  `status` int(1) NOT NULL COMMENT '状态：1有效；2删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_sys_permission
-- ----------------------------
INSERT INTO `tbl_sys_permission` VALUES (1, 'P0000', 'admin:*', NULL, NULL, NULL, 1);
INSERT INTO `tbl_sys_permission` VALUES (32, 'P0001', 'test:test01', NULL, NULL, NULL, 1);
INSERT INTO `tbl_sys_permission` VALUES (33, 'P0002', 'test:test02', NULL, NULL, NULL, 1);
INSERT INTO `tbl_sys_permission` VALUES (34, 'P0003', 'test:test03', NULL, NULL, NULL, 1);
INSERT INTO `tbl_sys_permission` VALUES (35, 'P0004', 'test:test04', NULL, NULL, NULL, 1);
INSERT INTO `tbl_sys_permission` VALUES (36, 'P0005', 'test:test05', NULL, NULL, NULL, 1);
INSERT INTO `tbl_sys_permission` VALUES (37, 'P0006', 'test:test06', NULL, NULL, NULL, 1);

-- ----------------------------
-- Table structure for tbl_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `tbl_sys_role`;
CREATE TABLE `tbl_sys_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `role_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `status` int(1) NOT NULL COMMENT '状态：1有效；2删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_sys_role
-- ----------------------------
INSERT INTO `tbl_sys_role` VALUES (5, 'R00001', '测试权限', 1);

-- ----------------------------
-- Table structure for tbl_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `tbl_sys_user`;
CREATE TABLE `tbl_sys_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `salt` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '加密盐值',
  `status` int(1) NOT NULL COMMENT '用户状态：1有效; 2删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_sys_user
-- ----------------------------
INSERT INTO `tbl_sys_user` VALUES (1, 'admin', '000000', 'admin', '7002e90cec3a81abefdad7fbe2ad3d46', 'TEST0', 1);

-- ----------------------------
-- Table structure for tbl_sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `tbl_sys_user_role`;
CREATE TABLE `tbl_sys_user_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户code',
  `role_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色code',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_sys_user_role
-- ----------------------------
INSERT INTO `tbl_sys_user_role` VALUES (1, '000000', 'R00000');
INSERT INTO `tbl_sys_user_role` VALUES (2, '000000', 'R00002');
INSERT INTO `tbl_sys_user_role` VALUES (3, '000000', 'R00001');

SET FOREIGN_KEY_CHECKS = 1;

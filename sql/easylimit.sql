SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_function
-- ----------------------------
DROP TABLE IF EXISTS `sys_function`;
CREATE TABLE `sys_function` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `myself_id` varchar(255) NOT NULL COMMENT '自身唯一标识ID',
  `parent_id` varchar(255) DEFAULT NULL COMMENT '父级资源项ID ,取myselfid值',
  `name` varchar(255) DEFAULT NULL COMMENT '权限名称',
  `type` int(11) DEFAULT NULL COMMENT '资源类型： 1.菜单   2.按钮',
  `level` int(11) DEFAULT NULL COMMENT '层级：1.一级导航菜单  2.二级导航菜单  3.功能按钮',
  `path_url` varchar(255) DEFAULT NULL COMMENT '权限路径',
  `icon_url` varchar(255) DEFAULT NULL COMMENT '图标路径',
  `sequence_num` int(11) DEFAULT NULL COMMENT '排序',
  `state` int(11) DEFAULT '0' COMMENT '状态（0:正常；1：删除）',
  `description` varchar(255) DEFAULT NULL COMMENT '资源项描述',
  `institution_id` varchar(50) DEFAULT NULL COMMENT '公司id',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `creater` varchar(255) DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`id`),
  UNIQUE KEY `myself_id` (`myself_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='资源/权限表';

-- ----------------------------
-- Records of sys_function
-- ----------------------------
INSERT INTO `sys_function` VALUES ('1', 'manage-0', '0', '所有权限', '1', '0', '', '', '0', '0', '所有权限', '', '2017-06-28 18:53:53', 'wxn');
INSERT INTO `sys_function` VALUES ('2', 'manage-10', 'manage-0', '测试权限1', '1', '1', '/aaa/bbb', '', '1', '0', '测试权限1', '', '2019-03-20 00:00:03', '');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(255) DEFAULT NULL COMMENT '角色名',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `status` int(4) DEFAULT '0' COMMENT '状态（0:正常；1：删除）',
  `institution_id` int(11) DEFAULT NULL COMMENT '公司id',
  `creater` varchar(255) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', 'manager', '超级管理员', '0', null, 'admin', '2017-07-11 13:53:13');
INSERT INTO `sys_role` VALUES ('2', '测试角色', '1', '0', null, null, null);

-- ----------------------------
-- Table structure for sys_role_function
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_function`;
CREATE TABLE `sys_role_function` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `role_id` bigint(19) NOT NULL COMMENT '角色id',
  `func_id` bigint(19) NOT NULL COMMENT '资源id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='角色资源表';

-- ----------------------------
-- Records of sys_role_function
-- ----------------------------
INSERT INTO `sys_role_function` VALUES ('1', '1', '1');
INSERT INTO `sys_role_function` VALUES ('2', '2', '2');
INSERT INTO `sys_role_function` VALUES ('3', '1', '2');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `username` varchar(255) NOT NULL COMMENT '登录名',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `encrypt_mode` varchar(100) DEFAULT NULL COMMENT '密码加密方式',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `user_type` int(2) DEFAULT '0' COMMENT '0：后台用户；1：前台用户',
  `institution_id` int(11) DEFAULT NULL COMMENT '机构id',
  `status` int(4) DEFAULT '0' COMMENT '用户状态（0:可用；1:锁定；2:未开通）',
  `is_del` tinyint(1) DEFAULT '0' COMMENT '删除状态：0正常；1删除',
  `login_ip` varchar(100) DEFAULT NULL,
  `login_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '上次登录时间',
  `creater` varchar(255) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '超级管理员', '$5$a8lsN8nw$oTwkzm3kNLqfkoZsfvL6RFu51DfxEtNdWJBvqwYD1P5', 'Sha256Crypt', '12345678909', '', '1', null, '0', '0', '127.0.0.1', '2020-01-06 16:55:59', null, '2017-08-10 00:00:01');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` bigint(19) NOT NULL COMMENT '用户id',
  `role_id` bigint(19) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户角色关联表';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1', '1');

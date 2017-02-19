
-- ----------------------------
-- Records of audio
-- ----------------------------
INSERT INTO `audio` VALUES ('1', '2017-01-05 11:08:14','0', '230', 'explication de git push', '/resources/1.mp3', 'https://blog.fabianpiau.com/contact/');
INSERT INTO `audio` VALUES ('2', '2017-01-05 11:08:30','0', '421', 'explication de git merge', '/resources/2.mp3', 'https://blog.fabianpiau.com/contact2/');
-- ----------------------------
-- Records of image
-- ----------------------------
INSERT INTO `image` VALUES ('1', '2017-01-05 10:34:59','0', '800', 'photo 1', 'relative/path/to/resource.png', 'file:///home/someuser/somefile.png', '420');
INSERT INTO `image` VALUES ('2', '2017-01-05 10:35:10','0', '820', 'photo 2', 'relative/path/to/resource2.png', 'file:///home/someuser/somefile.png', '400');
-- ----------------------------
-- Records of text
-- ----------------------------
INSERT INTO `text` VALUES ('1', '2017-01-05 10:59:51','0', '<scheme name> : <hierarchical part> [ ? <query> ] [ # <fragment> ]', 'Toutes les URIs sont formées de la sorte :');
INSERT INTO `text` VALUES ('2', '2017-01-05 11:00:10','0', '<html>', 'Pour les détails, voir la page wikipedia');
-- ----------------------------
-- Records of video
-- ----------------------------
INSERT INTO `video` VALUES ('1', '2017-01-05 10:58:30','0', '45', 'video 1', '/resource.mp4#frag01', 'file:///home/someuser/video1.mp4');
INSERT INTO `video` VALUES ('2', '2017-01-05 10:58:42','0', '120', 'video 2', '/resource2.mp4#frag01', 'file:///home/someuser/section2.mp4');

-- ----------------------------
-- Records of author
-- ----------------------------
INSERT INTO `author` VALUES ('1', '2017-01-05 11:04:59','0', 'Montpellier', 'France', 'avenue du professeur louis ravas', '34080', 'le meilleur auteur du monde', 'zaier.alaeddine@gmail.com', true,'Alaeddine', 'Zaier', 'coucou', '0652522113', '1',null);
INSERT INTO `author` VALUES ('2', '2017-01-05 11:07:01','0', 'Fontainebleau', 'France', 'chemin des étoiles', '92000', 'auteur très geek', 'houssem.zaier@gmail.com',true, 'Houssem', 'Zaier', 'coucou', '0781490988', '2',null);
INSERT INTO `author` VALUES ('3', '2017-01-05 11:07:01','0', 'Nabeul', 'Tunisie', 'impasse des lacs', '92000', 'auteur très connu en afrique', 'houssem.zaier@gmail.com',true, 'Houssem eddine', 'Zaier', 'coucou', '0781490988', '2',null);
INSERT INTO `author` VALUES ('4', '2017-01-05 11:07:01','0', 'Nabeul', 'Tunisia', 'impasse des lacs', '92000', 'aucun livre édité', 'houssem.zaier@gmail.com',true, 'Refka', 'Zaier', 'coucou', '0781490988', null,null);
INSERT INTO `author` VALUES ('5', '2017-01-05 11:07:01','0', 'Nabeul', 'Tunisia', 'impasse des lacs', '92000', 'auteur très connu en afrique', 'houssem.zaier@gmail.com',true, 'Duboit', 'F', 'coucou', '0781490988', null,null);
INSERT INTO `author` VALUES ('8', '2017-01-12 10:57:58','0', null, null, null, null, 'f5a5ri', 'zaier.mohsen@gmail.com',true, 'mohsen', 'zaier', '0505', '0652', null,null);
INSERT INTO `author` VALUES ('9', '2017-01-12 11:07:22','0', null, null, null, null, 'kalb', 'azz.ff@gmail.com',true, 'aaa', 'aloulou', 'zeze', '065252', null,null);
INSERT INTO `author` VALUES ('10', '2017-01-13 00:46:59','0', '', '', '', '', 'Raaaafka', 'azz.ff@gmail.com',true, 'Rafka', 'Refka', 'zeze', '065252', null,null);
INSERT INTO `author` VALUES ('11', '2017-01-12 11:09:43','0', null, null, null, null, 'kalb', 'azz.ff@gmail.com',true, 'aaa', 'aloulou', 'zeze', '065252', null,null);
INSERT INTO `author` VALUES ('12', '2017-01-12 11:23:48','0', 'montpellier', 'france', '45', null, 'zaea', 'zaier.alaeddine@gmail.com',true, 'aa', 'zaier', '0505', '06', null,null);
INSERT INTO `author` VALUES ('13', '2017-01-12 11:45:13','0', '', '', '', null, 'zaea', 'zaier.alaeddine@gmail.com',true, 'aa', 'zaier 13', '0505', '06', null,null);
INSERT INTO `author` VALUES ('14', '2017-01-12 13:44:39','0', 'paris', 'france', 'avenue de lavenue', null, 'kilb', 'hou.za@gmail.com',true, 'houssem', 'haska', 'hzzz', '0652522113', null,null);
INSERT INTO `author` VALUES ('15', '2017-01-12 13:46:12','0', 'paris', 'france', 'avenue de lavenue', null, 'zzzz', 'hou.za@gmail.com',true, 'houssem', 'haska', '0505', '0652522113', null,null);
INSERT INTO `author` VALUES ('16', '2017-01-12 14:00:39','0', 'paris', 'france', 'avenue de lavenue', '34000', 'ala twil', 'hou.za@gmail.com',true, 'alaala', 'zaier', 'mmmm', '0652522113', null,null);
INSERT INTO `author` VALUES ('17', '2017-01-13 12:13:44','0', 'paris', 'france', 'avenue de lavenue', '34000', 'zz', 'hou.za@gmail.com',true, 'kerchou bel 3sal', 'Bhim', 'ya za77i', '0652522113', null,null);
INSERT INTO `author` VALUES ('18', '2017-01-13 14:02:43','0', 'paris', 'france', 'avenue de lavenue', '34000', 'sans decription', 'hou.za@gmail.com',true, 'moto', 'hello', 'hello moto', '0652522113', null,null);
-- ----------------------------
-- Records of courses
-- ----------------------------
INSERT INTO `course` VALUES ('1', '2017-01-16 15:39:50','0', 'Cours Très intéressant', 'INTERMEDIATE',TRUE, 'Scrum with Houssem', 'Be Agile', '1', '1');
INSERT INTO `course` VALUES ('2', '2017-01-16 15:41:08','0', 'Git Advanced and git flow ', 'BEGINNER',TRUE, 'Git with Alaeddine', 'Git', '2', '2');
INSERT INTO `course` VALUES ('3', '2017-01-16 15:41:08','0', 'Git Bisics for begginers', 'INTERMEDIATE',TRUE, 'Git forever', 'Git Basics', '2', '2');
INSERT INTO `course` VALUES ('4', '2017-01-16 15:41:08','0', 'Git Bisics for begginers', 'INTERMEDIATE',TRUE, 'Git forever', 'Git Basics', '2', '2');

-- ----------------------------
-- Records of section
-- ----------------------------
INSERT INTO `section` VALUES ('1', '2017-01-05 11:17:45','0', 'Cest la première section', '1', 'Introduction', '1');
INSERT INTO `section` VALUES ('2', '2017-01-05 11:17:46','0', 'cest la deuxième section', '2', 'Section 1', '1');

-- ----------------------------
-- Records of lecture
-- ----------------------------
INSERT INTO `lecture` VALUES ('1', '2017-01-05 11:21:29','0', 'Lecture 1', '1', '1');
INSERT INTO `lecture` VALUES ('2', '2017-01-05 11:21:36','0', 'Lecture 2', '2', '1');

-- ----------------------------
-- Records of pricing
-- ----------------------------
INSERT INTO `pricing` VALUES ('1', '2017-01-05 11:16:59','0', '99', 'NEVER', '1');
INSERT INTO `pricing` VALUES ('2', '2017-01-05 11:17:19','0', '20', 'MONTHLY', '2');


-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', 'Informatique');
INSERT INTO `category` VALUES ('2', 'Design');
INSERT INTO `category` VALUES ('3', 'Mode');
INSERT INTO `category` VALUES ('4', 'Musique');
INSERT INTO `category` VALUES ('5', 'Multimédia');
INSERT INTO `category` VALUES ('6', 'Historique');
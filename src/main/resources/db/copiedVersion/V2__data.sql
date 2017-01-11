
-- ----------------------------
-- Records of audio
-- ----------------------------
INSERT INTO `audio` VALUES ('1', '2017-01-05 11:08:14', '230', 'explication de git push', '/resources/1.mp3', 'https://blog.fabianpiau.com/contact/');
INSERT INTO `audio` VALUES ('2', '2017-01-05 11:08:30', '421', 'explication de git merge', '/resources/2.mp3', 'https://blog.fabianpiau.com/contact2/');
-- ----------------------------
-- Records of image
-- ----------------------------
INSERT INTO `image` VALUES ('1', '2017-01-05 10:34:59', '800', 'photo 1', 'relative/path/to/resource.png', 'file:///home/someuser/somefile.png', '420');
INSERT INTO `image` VALUES ('2', '2017-01-05 10:35:10', '820', 'photo 2', 'relative/path/to/resource2.png', 'file:///home/someuser/somefile.png', '400');
-- ----------------------------
-- Records of text
-- ----------------------------
INSERT INTO `text` VALUES ('1', '2017-01-05 10:59:51', '<scheme name> : <hierarchical part> [ ? <query> ] [ # <fragment> ]', 'Toutes les URIs sont formées de la sorte :');
INSERT INTO `text` VALUES ('2', '2017-01-05 11:00:10', '<html>', 'Pour les détails, voir la page wikipedia');
-- ----------------------------
-- Records of video
-- ----------------------------
INSERT INTO `video` VALUES ('1', '2017-01-05 10:58:30', '45', 'video 1', '/resource.mp4#frag01', 'file:///home/someuser/video1.mp4');
INSERT INTO `video` VALUES ('2', '2017-01-05 10:58:42', '120', 'video 2', '/resource2.mp4#frag01', 'file:///home/someuser/section2.mp4');

-- ----------------------------
-- Records of author
-- ----------------------------
INSERT INTO `author` VALUES ('1', '2017-01-05 11:04:59', 'Montpellier', 'France', 'avenue du professeur louis ravas', '34080', 'le meilleur auteur du monde', 'zaier.alaeddine@gmail.com', 'Alaeddine', 'Zaier', 'coucou', '0652522113', '1');
INSERT INTO `author` VALUES ('2', '2017-01-05 11:07:01', 'Fontainebleau', 'France', 'chemin des étoiles', '92000', 'auteur très geek', 'houssem.zaier@gmail.com', 'Houssem', 'Zaier', 'coucou', '0781490988', '2');
INSERT INTO `author` VALUES ('3', '2017-01-05 11:07:01', 'Nabeul', 'Tunisie', 'impasse des lacs', '92000', 'auteur très connu en afrique', 'houssem.zaier@gmail.com', 'Houssem eddine', 'Zaier', 'coucou', '0781490988', '2');

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', '2017-01-05 11:12:18', 'cours sur les méthodologies agile', '0', 'Be AGILE', 'Be AGILE with Houssem', '2', '1');
INSERT INTO `course` VALUES ('2', '2017-01-05 11:12:19', 'Git Advanced and git flow ', '0', 'Git Advanced', 'Git So Easy', '1', '2');

-- ----------------------------
-- Records of section
-- ----------------------------
INSERT INTO `section` VALUES ('1', '2017-01-05 11:17:45', 'Cest la première section', '1', 'Introduction', '1');
INSERT INTO `section` VALUES ('2', '2017-01-05 11:17:46', 'cest la deuxième section', '2', 'Section 1', '1');

-- ----------------------------
-- Records of lecture
-- ----------------------------
INSERT INTO `lecture` VALUES ('1', '2017-01-05 11:21:29', 'Lecture 1', '1', '1');
INSERT INTO `lecture` VALUES ('2', '2017-01-05 11:21:36', 'Lecture 2', '2', '1');

-- ----------------------------
-- Records of pricing
-- ----------------------------
INSERT INTO `pricing` VALUES ('1', '2017-01-05 11:16:59', '99', 'NEVER', '1');
INSERT INTO `pricing` VALUES ('2', '2017-01-05 11:17:19', '20', 'MONTHLY', '2');


-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', 'Informatique');
INSERT INTO `category` VALUES ('2', 'Design');
INSERT INTO `category` VALUES ('3', 'Mode');
INSERT INTO `category` VALUES ('4', 'Musique');
INSERT INTO `category` VALUES ('5', 'Multimédia');
INSERT INTO `category` VALUES ('6', 'Historique');
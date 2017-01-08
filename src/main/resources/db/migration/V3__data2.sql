INSERT INTO personne ( `name`)
VALUES
  ('Australia'),
  ('Australia'),
  ('Australia'),
  ('Canada'),
  ('Japan'),
  ('Spain'),
  ('Switzerland'),
  ('UK'),
  ('TUNISIA'),
  ('USA');
  
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
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', 'Informatique');
INSERT INTO `category` VALUES ('2', 'Design');
INSERT INTO `category` VALUES ('3', 'Mode');
INSERT INTO `category` VALUES ('4', 'Musique');
INSERT INTO `category` VALUES ('5', 'Multimédia');
INSERT INTO `category` VALUES ('6', 'Historique');
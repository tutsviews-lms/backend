ALTER TABLE  `author` DROP FOREIGN KEY  `FKlgw2jmewdn0g1ago2o7axfvey` ,
ADD FOREIGN KEY (  `image_id` ) REFERENCES  `tutsviewsdb`.`image` (
`id`
) ON DELETE CASCADE ON UPDATE CASCADE ;




ALTER TABLE  `content` DROP FOREIGN KEY  `FKgiftldcfgbw45aq1qax3164nl` ,
ADD FOREIGN KEY (  `lecture_id` ) REFERENCES  `tutsviewsdb`.`lecture` (
`id`
) ON DELETE CASCADE ON UPDATE CASCADE ;




ALTER TABLE  `course` DROP FOREIGN KEY  `FK5t0ynyp27x7h1rny57tvgjb3o` ,
ADD FOREIGN KEY (  `author_id` ) REFERENCES  `tutsviewsdb`.`author` (
`id`
) ON DELETE CASCADE ON UPDATE CASCADE ;

ALTER TABLE  `course` DROP FOREIGN KEY  `FKihmtkvkw075b5yknss1fpmscy` ,
ADD FOREIGN KEY (  `image_id` ) REFERENCES  `tutsviewsdb`.`image` (
`id`
) ON DELETE CASCADE ON UPDATE CASCADE ;





ALTER TABLE  `lecture` DROP FOREIGN KEY  `FK568elaju5okd8k0hukt18mtk7` ,
ADD FOREIGN KEY (  `section_id` ) REFERENCES  `tutsviewsdb`.`section` (
`id`
) ON DELETE CASCADE ON UPDATE CASCADE ;




ALTER TABLE  `pricing` DROP FOREIGN KEY  `FK78kffjb4lp67vtmi7mb61hbb9` ,
ADD FOREIGN KEY (  `course_id` ) REFERENCES  `tutsviewsdb`.`course` (
`id`
) ON DELETE CASCADE ON UPDATE CASCADE ;



ALTER TABLE  `section` DROP FOREIGN KEY  `FKoy8uc0ftpivwopwf5ptwdtar0` ,
ADD FOREIGN KEY (  `course_id` ) REFERENCES  `tutsviewsdb`.`course` (
`id`
) ON DELETE CASCADE ON UPDATE CASCADE ;
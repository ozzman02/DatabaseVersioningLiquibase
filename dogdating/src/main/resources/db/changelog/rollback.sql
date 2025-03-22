--  *********************************************************************
--  SQL to roll back currently unexecuted changes
--  *********************************************************************
--  Change Log: changelog-master.xml
--  Ran at: 22/3/25, 07:00
--  Against: webuser@172.17.0.1@jdbc:mysql://localhost:3306/dogdating
--  Liquibase version: 4.29.2
--  *********************************************************************

--  Lock Database
UPDATE dogdating.DATABASECHANGELOGLOCK SET `LOCKED` = 1, LOCKEDBY = 'ossantpc (192.168.0.13)', LOCKGRANTED = NOW() WHERE ID = 1 AND `LOCKED` = 0;

--  Rolling Back ChangeSet: changelog-master.xml::osantamaria-006::osantamaria
ALTER TABLE dogdating.profiles DROP COLUMN pro_gender;

DELETE FROM dogdating.DATABASECHANGELOG WHERE ID = 'osantamaria-006' AND AUTHOR = 'osantamaria' AND FILENAME = 'changelog-master.xml';

--  Rolling Back ChangeSet: changelog-master.xml::osantamaria-005::osantamaria
ALTER TABLE dogdating.profiles DROP FOREIGN KEY fk_profiles_breeds_id;

DELETE FROM dogdating.DATABASECHANGELOG WHERE ID = 'osantamaria-005' AND AUTHOR = 'osantamaria' AND FILENAME = 'changelog-master.xml';

--  Rolling Back ChangeSet: changelog-master.xml::osantamaria-004::osantamaria
DROP INDEX ix_profiles_breeds_id ON dogdating.profiles;

DELETE FROM dogdating.DATABASECHANGELOG WHERE ID = 'osantamaria-004' AND AUTHOR = 'osantamaria' AND FILENAME = 'changelog-master.xml';

--  Release Database Lock
UPDATE dogdating.DATABASECHANGELOGLOCK SET `LOCKED` = 0, LOCKEDBY = NULL, LOCKGRANTED = NULL WHERE ID = 1;


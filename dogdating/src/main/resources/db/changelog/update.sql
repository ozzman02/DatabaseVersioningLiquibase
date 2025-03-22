--  Lock Database
UPDATE dogdating.DATABASECHANGELOGLOCK SET `LOCKED` = 1, LOCKEDBY = 'ossantpc (192.168.0.13)', LOCKGRANTED = NOW() WHERE ID = 1 AND `LOCKED` = 0;

--  *********************************************************************
--  Update Database Script
--  *********************************************************************
--  Change Log: changelog-master.xml
--  Ran at: 22/3/25, 06:52
--  Against: webuser@172.17.0.1@jdbc:mysql://localhost:3306/dogdating
--  Liquibase version: 4.29.2
--  *********************************************************************

--  Changeset changelog-master.xml::osantamaria-004::osantamaria
CREATE INDEX ix_profiles_breeds_id ON dogdating.profiles(pro_bre_id);

INSERT INTO dogdating.DATABASECHANGELOG (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, MD5SUM, `DESCRIPTION`, COMMENTS, EXECTYPE, CONTEXTS, LABELS, LIQUIBASE, DEPLOYMENT_ID) VALUES ('osantamaria-004', 'osantamaria', 'changelog-master.xml', NOW(), 4, '9:d93035b3bd2a2d87be5e33a60352ef87', 'createIndex indexName=ix_profiles_breeds_id, tableName=profiles', '', 'EXECUTED', NULL, NULL, '4.29.2', '2647956216');

--  Changeset changelog-master.xml::osantamaria-005::osantamaria
ALTER TABLE dogdating.profiles ADD CONSTRAINT fk_profiles_breeds_id FOREIGN KEY (pro_bre_id) REFERENCES dogdating.breeds (bre_id);

INSERT INTO dogdating.DATABASECHANGELOG (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, MD5SUM, `DESCRIPTION`, COMMENTS, EXECTYPE, CONTEXTS, LABELS, LIQUIBASE, DEPLOYMENT_ID) VALUES ('osantamaria-005', 'osantamaria', 'changelog-master.xml', NOW(), 5, '9:1e588a06c4d2f068395ca0a5b6e489fd', 'addForeignKeyConstraint baseTableName=profiles, constraintName=fk_profiles_breeds_id, referencedTableName=breeds', '', 'EXECUTED', NULL, NULL, '4.29.2', '2647956216');

--  Changeset changelog-master.xml::osantamaria-006::osantamaria
ALTER TABLE dogdating.profiles ADD pro_gender CHAR(1) NULL;

INSERT INTO dogdating.DATABASECHANGELOG (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, MD5SUM, `DESCRIPTION`, COMMENTS, EXECTYPE, CONTEXTS, LABELS, LIQUIBASE, DEPLOYMENT_ID) VALUES ('osantamaria-006', 'osantamaria', 'changelog-master.xml', NOW(), 6, '9:5a937ff2cf06bd8fbbaa3e114b2808ae', 'addColumn tableName=profiles', '', 'EXECUTED', NULL, NULL, '4.29.2', '2647956216');

--  Release Database Lock
UPDATE dogdating.DATABASECHANGELOGLOCK SET `LOCKED` = 0, LOCKEDBY = NULL, LOCKGRANTED = NULL WHERE ID = 1;


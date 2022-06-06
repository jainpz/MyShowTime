-------------CREATE SCHEMA-----------------------
CREATE SCHEMA MY_SHOW_TIME_TEST AUTHORIZATION sa;


-------------CREATE TABLES-----------------------
CREATE TABLE LANGUAGE(ID INT, NAME VARCHAR(50) NOT NULL, PRIMARY KEY (ID));
CREATE TABLE GENRE(ID INT, NAME VARCHAR(50) NOT NULL, PRIMARY KEY (ID));

--------------REFERENCE DATA----------------------
INSERT INTO LANGUAGE (ID, NAME) VALUES (1, 'ENGLISH');
INSERT INTO LANGUAGE (ID, NAME) VALUES (2, 'FRENCH');
INSERT INTO LANGUAGE (ID, NAME) VALUES (3, 'SPANISH');
INSERT INTO LANGUAGE (ID, NAME) VALUES (4, 'GERMAN');

INSERT INTO GENRE(ID, NAME) VALUES(1, 'ACTION');
INSERT INTO GENRE(ID, NAME) VALUES(2, 'SCI-FI');
INSERT INTO GENRE(ID, NAME) VALUES(3, 'DRAMA');
INSERT INTO GENRE(ID, NAME) VALUES(4, 'HORROR');
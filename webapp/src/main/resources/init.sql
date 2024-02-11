CREATE DATABASE IF NOT EXISTS eclinic_db;
CREATE USER IF NOT EXISTS 'appuser'@'%' identified by 'password';
GRANT ALL ON eclinic_db.* to 'appuser'@'%';

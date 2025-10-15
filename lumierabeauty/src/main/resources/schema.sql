CREATE DATABASE IF NOT EXISTS lumiera;
USE lumiera;

CREATE TABLE IF NOT EXISTS registration (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    fullname VARCHAR(255),
    email VARCHAR(255),
    phonenumber VARCHAR(20),
    password VARCHAR(255),
    role ENUM('USER', 'ADMIN', 'MODERATOR')
);
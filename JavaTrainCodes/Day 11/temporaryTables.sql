CREATE SCHEMA test;

USE test;

SHOW tables;
CREATE TEMPORARY TABLE user (
    userID INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(15) NOT NULL
);
INSERT INTO user 
VALUES 
(1, 'Jay'),
(2, 'Yash'),
(3, 'Ravi');

select * from user;

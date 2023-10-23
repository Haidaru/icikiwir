CREATE DATABASE icikiwirrr;
USE icikiwirrr;

CREATE TABLE User(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50),
    email VARCHAR(100),
    status VARCHAR(50),
    rfid VARCHAR(50),
    fingerid VARCHAR(50),
    faceid VARCHAR(50),
    phone VARCHAR(50),
    PRIMARY KEY(id)
);

SELECT * FROM User;

INSERT INTO User (name, email, status, rfid, fingerid, faceid, phone)
VALUES ('John Doe', 'johndoe@example.com', 'Active', 'RFID123', 'Finger123', 'Face123', '123-456-7890');
DELETE FROM User
WHERE id = 3;



CREATE TABLE MSG
(
    id  SERIAL NOT NULL PRIMARY KEY,
    msg TEXT   NOT NULL
);

INSERT INTO MSG(msg)
VALUES ('test msg');
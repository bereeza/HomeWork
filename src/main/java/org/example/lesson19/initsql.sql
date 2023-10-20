CREATE DATABASE HOMEWORK;

\c HOMEWORK;

CREATE TABLE homework
(
    id          SERIAL       NOT NULL PRIMARY KEY,
    name        VARCHAR(256) NOT NULL,
    description VARCHAR(256)
);

CREATE TABLE lesson
(
    id          SERIAL       NOT NULL PRIMARY KEY,
    name        VARCHAR(256) NOT NULL,
    updatedAt   DATE         NOT NULL,
    homework_id INT REFERENCES homework (id)
);

CREATE TABLE schedule
(
    id        SERIAL       NOT NULL PRIMARY KEY,
    name      VARCHAR(256) NOT NULL,
    updatedAt DATE         NOT NULL
);

-- n - n
CREATE TABLE lessonSchedule
(
    lesson_id   INT REFERENCES lesson (id),
    schedule_id INT REFERENCES schedule (id),
    PRIMARY KEY (lesson_id, schedule_id)
);

DROP TABLE lesson, homework, schedule, lessonSchedule;

INSERT INTO homework (name, description)
VALUES ('Java', 'Write SPRING app');
INSERT INTO homework (name, description)
VALUES ('Python', 'Do nothing');

SELECT *
FROM homework;

INSERT INTO lesson (name, updatedAt, homework_id)
VALUES ('Spring Security', '2023-10-17', 1);

INSERT INTO lesson (name, updatedAt, homework_id)
VALUES ('Machine Learning', '2023-10-17', 2);

SELECT *
FROM lesson;

INSERT INTO schedule (name, updatedAt)
VALUES ('1 lesson', '2023-10-17');

INSERT INTO schedule (name, updatedAt)
VALUES ('3 lesson', '2023-10-17');

SELECT *
FROM schedule;

INSERT INTO lessonSchedule(lesson_id, schedule_id)
VALUES (1, 1);

INSERT INTO lessonSchedule(lesson_id, schedule_id)
VALUES (2, 2);
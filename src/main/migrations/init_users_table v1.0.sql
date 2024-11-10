CREATE TABLE users
(
    id     VARCHAR(36) PRIMARY KEY,
    name   VARCHAR(255) NOT NULL,
    points INT          NOT NULL,
    level  INT          NOT NULL,
    coins  INT          NOT NULL
);

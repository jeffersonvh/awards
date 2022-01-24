CREATE TABLE STUDIOS(
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(100) NOT NULL
);

CREATE TABLE PRODUCERS(
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(100) NOT NULL
);

CREATE TABLE MOVIES(
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    TITLE VARCHAR(100) NOT NULL,
    STUDIO_ID INTEGER REFERENCES STUDIOS (ID),
    PRODUCER_ID INTEGER REFERENCES PRODUCERS (ID)
);

CREATE TABLE AWARDS(
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    YEAR VARCHAR(4) NOT NULL,
    MOVIE_ID INTEGER REFERENCES MOVIES (ID)
);
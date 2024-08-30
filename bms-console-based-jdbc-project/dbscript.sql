DROP TABLE character_details;
DROP TABLE book_character_details;
DROP TABLE book_details;
DROP TABLE author_details;



CREATE TABLE BMS.author_details(
    author_id NUMBER GENERATED ALWAYS AS IDENTITY,
    author_firstname VARCHAR2(20) NOT NULL,
    author_lastname VARCHAR2(20) NOT NULL,
    author_image_url VARCHAR2(255),
    PRIMARY KEY(author_id)
);

CREATE TABLE BMS.character_details(
    character_id NUMBER GENERATED ALWAYS AS IDENTITY,
    character_firstname VARCHAR2(20) NOT NULL,
    character_lastName VARCHAR2(20) NOT NULL,
    character_image_url VARCHAR2(255) NOT NULL,
    PRIMARY KEY(character_id)
);

CREATE TABLE BMS.book_details(
    book_id NUMBER GENERATED ALWAYS AS IDENTITY,
    book_title VARCHAR2(100) NOT NULL,
    book_genre VARCHAR2(20) NOT NULL,
    book_author_id NUMBER,
    book_price NUMBER,
    book_published DATE NOT NULL,
    book_image_url VARCHAR2(255) NOT NULL,
    PRIMARY KEY(book_id),-- table level
    FOREIGN KEY(book_author_id) REFERENCES author_details(author_id)
);

CREATE TABLE BMS.book_character_details(
    book_char_id NUMBER GENERATED ALWAYS AS IDENTITY,
    book_id NUMBER,
    character_id NUMBER,
    PRIMARY KEY(book_char_id),
    FOREIGN KEY(book_id) REFERENCES book_details(book_id),
    FOREIGN KEY(character_id) REFERENCES character_details(character_id)
);


CREATE OR REPLACE PROCEDURE insert_author (auth_firstname IN VARCHAR, auth_lastname IN VARCHAR2, auth_image_url IN VARCHAR2, out_author_id OUT NUMBER) AS
   BEGIN
    INSERT INTO 
        author_details(author_firstname, author_lastname, author_image_url) 
        VALUES(auth_firstname, auth_lastname, auth_image_url)
        RETURNING author_id INTO out_author_id;
   END;
/

INSERT INTO character_details(character_firstname, character_lastname, character_image_url) VALUES('Haryy', 'Potter', 'https://cdn.pixabay.com/photo/2018/09/11/19/22/harry-potter-3670411_1280.png');
INSERT INTO character_details(character_firstname, character_lastname, character_image_url) VALUES('Ron', 'Weasley', 'https://cdn.pixabay.com/photo/2019/04/16/17/17/ron-4132263_1280.jpg');
INSERT INTO character_details(character_firstname, character_lastname, character_image_url) VALUES('Draco', 'Malfoy', 'https://cdn.pixabay.com/photo/2021/12/16/18/34/draco-malfoy-6875025_1280.png');
INSERT INTO character_details(character_firstname, character_lastname, character_image_url) VALUES('Lord', 'Voldermort', 'https://cdn.pixabay.com/photo/2021/12/14/13/36/fantasy-6870524_1280.jpg');
INSERT INTO character_details(character_firstname, character_lastname, character_image_url) VALUES('Mark', 'Stewart', 'https://cdn.pixabay.com/photo/2015/06/21/17/33/mouse-816849_1280.jpg');
INSERT INTO character_details(character_firstname, character_lastname, character_image_url) VALUES('Leo', 'Stewart', 'https://cdn.pixabay.com/photo/2015/06/21/17/33/mouse-816849_1280.jpg');

INSERT INTO author_details(author_firstname, author_lastname, author_image_url) VALUES('JK', 'ROWLING','');
INSERT INTO author_details(author_firstname, author_lastname, author_image_url) VALUES('Geronimo', 'Stilton','');

INSERT INTO book_details(book_title, book_genre, book_author_id, book_price, book_published, book_image_url) VALUES('Harry Potter and the Prizoner of Azkaban', 'Fantasy', 1, 350, TO_DATE('2022-10-10','YYYY-MM-DD'),'https://cdn.pixabay.com/photo/2014/09/05/18/32/old-books-436498_1280.jpg');
INSERT INTO book_details(book_title, book_genre, book_author_id, book_price, book_published, book_image_url) VALUES('Harry Potter and the Chamber of Secrets', 'Fantasy', 1, 450, TO_DATE('2020-11-11','YYYY-MM-DD'),'https://cdn.pixabay.com/photo/2014/09/05/18/32/old-books-436498_1280.jpg');
INSERT INTO book_details(book_title, book_genre, book_author_id, book_price, book_published, book_image_url) VALUES('Harry Potter and the Prizoner of Azkaban', 'Fantasy', 1, 550, TO_DATE('2022-10-10','YYYY-MM-DD'),'https://cdn.pixabay.com/photo/2014/09/05/18/32/old-books-436498_1280.jpg');

INSERT INTO book_character_details(book_id, character_id) VALUES(1, 1);
INSERT INTO book_character_details(book_id, character_id) VALUES(1, 2);
INSERT INTO book_character_details(book_id, character_id) VALUES(1, 3);
INSERT INTO book_character_details(book_id, character_id) VALUES(1, 4);
INSERT INTO book_character_details(book_id, character_id) VALUES(1, 5);
INSERT INTO book_character_details(book_id, character_id) VALUES(2, 1);
INSERT INTO book_character_details(book_id, character_id) VALUES(2, 2);
INSERT INTO book_character_details(book_id, character_id) VALUES(2, 3);
INSERT INTO book_character_details(book_id, character_id) VALUES(2, 4);
INSERT INTO book_character_details(book_id, character_id) VALUES(2, 5);
INSERT INTO book_character_details(book_id, character_id) VALUES(3, 1);
INSERT INTO book_character_details(book_id, character_id) VALUES(3, 2);
INSERT INTO book_character_details(book_id, character_id) VALUES(3, 3);
INSERT INTO book_character_details(book_id, character_id) VALUES(3, 4);
INSERT INTO book_character_details(book_id, character_id) VALUES(3, 5);

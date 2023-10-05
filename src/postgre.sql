CREATE TABLE Users (
                       id serial NOT NULL UNIQUE,
                       email VARCHAR(55) NOT NULL UNIQUE,
                       verified BOOLEAN NOT NULL DEFAULT false,
                       date_created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                       phone_number INTEGER CHECK ( phone_number BETWEEN 100000000 AND 999999999 ),
                       height NUMERIC NOT NULL,
                       PRIMARY KEY (id)
                   );

INSERT into Users (email, phone_number, height)
VALUES ('zakhar.fedorov@tul.cz', 123456789, 1.80),
       ('artem.novak@gmail.com', 608373214, 1.72);

SELECT * FROM Users;

DELETE FROM Users;

DROP TABLE Users CASCADE;
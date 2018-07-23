INSERT INTO competition


INSERT INTO competitor (user_name, first_name, last_name)
VALUES (?, ?, ?);

ALTER TABLE competitor
DROP COLUMN competitor_name;

ALTER TABLE competitor
DROP COLUMN username;

ALTER TABLE competitor
ADD COLUMN first_name varchar(20);

ALTER TABLE competitor
ADD COLUMN last_name varchar(20);

ALTER TABLE competition
ADD COLUMN time_stamp timestamp;

ALTER TABLE competition
ADD COLUMN winner varchar(20);

ALTER TABLE competition
ADD COLUMN loser varchar(20);

ALTER TABLE competition
DROP COLUMN loser;

ALTER TABLE competition
ADD COLUMN competitor_id int;

ALTER TABLE competition
ADD COLUMN player_one int;

ALTER TABLE competition
ADD COLUMN player_two int;

ALTER TABLE competition
DROP COLUMN competitor_id;

ALTER TABLE competition
DROP COLUMN player_two;

ALTER TABLE competition
DROP COLUMN player_one;


ALTER TABLE competition
ADD COLUMN player_one_score int;

ALTER TABLE competition
ADD COLUMN player_two_score int;

select * from competitor;


INSERT INTO competition (game_id, time_stamp, player_one, player_one_score, player_two, player_two_score)
VALUES (1, now(), 1, 21, 2, 18);

INSERT INTO competition (game_id, time_stamp, player_one, player_one_score, player_two, player_two_score)
VALUES (1, now(), 3, 21, 1, 15);

INSERT INTO competition (game_id, time_stamp, player_one, player_one_score, player_two, player_two_score)
VALUES (1, now(), 5, 21, 3, 12);

INSERT INTO competition (game_id, time_stamp, player_one, player_one_score, player_two, player_two_score)
VALUES (1, now(), 4, 21, 2, 18);

INSERT INTO competition (game_id, time_stamp, player_one, player_one_score, player_two, player_two_score)
VALUES (1, now(), 4, 21, 2, 18);


SELECT ("first_name" || ' ' || "last_name") as name

DELETE FROM COMPETITION;

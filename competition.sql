CREATE TABLE competition (
    competition_id serial NOT NULL,
    game_id int NOT NULL,
    time_stamp timestamp NOT NULL,
    player_one_score int NOT NULL,
    player_two_score int NOT NULL,
    player_one int NOT NULL,
    player_two int NOT NULL,
    CONSTRAINT pk_competition_competition_id PRIMARY KEY (competition_id)
);

CREATE TABLE competitor (
    competitor_id serial NOT NULL,
    first_name varchar(30) NOT NULL,
    last_name varchar(30) NOT NULL,
    CONSTRAINT pk_competitor_competitor_id PRIMARY KEY (competitor_id)
);

CREATE TABLE competition_competitors (
    competition_id int,
    competitor_id int ,
    CONSTRAINT pk_competition_competitors_competition_id_competitor_id PRIMARY KEY (competition_id, competitor_id)
);

CREATE TABLE game(
        game_id serial NOT NULL,
        game_name varchar(30) NOT NULL,
        CONSTRAINT pk_game_game_id PRIMARY KEY (game_id)
);


ALTER TABLE competition_competitors
ADD FOREIGN KEY (competition_id)
REFERENCES competition (competition_id);

ALTER TABLE competition
ADD FOREIGN KEY (game_id)
REFERENCES game (game_id);

ALTER TABLE competition_competitors
ADD FOREIGN KEY (competitor_id)
REFERENCES competitor (competitor_id);

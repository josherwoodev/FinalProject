ALTER TABLE turn_state
    ADD drawn_card_index INTEGER;

ALTER TABLE turn_state
    ADD drawn_card_type VARCHAR(255);

ALTER TABLE game
    ADD has_begun BOOLEAN;
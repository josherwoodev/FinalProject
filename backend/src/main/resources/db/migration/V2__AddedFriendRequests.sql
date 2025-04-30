CREATE TABLE profile_friend_requests
(
    profile_id         BIGINT NOT NULL,
    friend_requests_id BIGINT NOT NULL
);

ALTER TABLE profile_friend_requests
    ADD CONSTRAINT fk_profrireq_on_friendrequests FOREIGN KEY (friend_requests_id) REFERENCES profile (id);

ALTER TABLE profile_friend_requests
    ADD CONSTRAINT fk_profrireq_on_profile FOREIGN KEY (profile_id) REFERENCES profile (id);
CREATE EXTENSIONS IF NOT EXISTS "pgcrypto";

CREATE TABLE user (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    hash_password VARCHAR(255) NOT NULL,
    birth_date TIMESTAMP NOT NULL,
    active BOOLEAN NOT NULL
);
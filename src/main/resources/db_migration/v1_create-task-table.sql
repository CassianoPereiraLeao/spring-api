CREATE TABLE task (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    complete BOOLEAN NOT NULL,
    description VARCHAR(255) NOT NULL,
    user_id UUID,
    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
);
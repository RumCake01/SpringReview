INSERT INTO roles (enabled, description)
VALUES (TRUE, 'Root'),
       (TRUE, 'Admin'),
       (TRUE, 'Instructor'),
       (TRUE, 'Developer');
INSERT INTO users (created_by, created_time, is_deleted, updated_by, updated_time, email, enabled, first_name, last_name, password, user_status,  r_id)
VALUES (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'root@cydeo.com', TRUE, 'Root', 'RootSurname', '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK', 'ACTIVE', 1);

-- $2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK
-- Abc1 // real password
INSERT INTO roles (enabled, description, salary)
VALUES (TRUE, 'Root', 100000), -- 1
       (TRUE, 'Admin', 10000), -- 2
       (TRUE, 'Instructor', 50000),-- 3
       (TRUE, 'Developer', 200000); --4

INSERT INTO users (created_by, created_time, is_deleted, updated_by, updated_time, email, enabled, first_name, last_name, password, user_status,  r_id, program_id)
VALUES (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'root@cydeo.com', TRUE, 'Root', 'RootSurname', '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK', 'ACTIVE', 1, 1),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'admin@cydeo.com', TRUE, 'Jack', 'Smith', '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK', 'ACTIVE', 2, 2),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'admin@cydeo.com', TRUE, 'Mike', 'Smith', '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK', 'ACTIVE', 2, 3),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'instructor@cydeo.com', TRUE, 'mathi', 'schlagger', '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK', 'ACTIVE', 3, 4),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'developer1@cydeo.com', TRUE, 'Rumi', 'RumCake', '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK', 'ACTIVE', 4, 5),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'developer2@cydeo.com', TRUE, 'Mehmet', 'Kal', '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK', 'ACTIVE', 4, 6);

INSERT INTO programs (created_by, created_time, is_deleted, updated_by, updated_time, program_name, study_progress, duration)
VALUES (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'Java Developer Core', 0,500),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'Java Developer Spring',0,500),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'JS Developer Core', 0,700),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'CSS Styling', 0,700),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'Angulor', 0, 700),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'React Developer',0,750);




-- $2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK
-- Abc1 // real password
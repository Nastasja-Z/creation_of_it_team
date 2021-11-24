insert into role(name)
values ('ROLE_ADMIN'),
       ('ROLE_PM'),
       ('ROLE_HR'),
       ('ROLE_USER');

insert into users(password, username)
values ('$2a$10$RYofohWktwl5xDkPm9FQQuwjubusMDz9rfO21tUWb1dB.41HRBq3C', 'admin'),
       ('$2a$10$NOfPE/3LRpK/9GkOxn7ls.0GGdqC37GZOxoaFZSZkcNvpzEaxfbTG', 'PM'),
       ('$c@"k`*rNw+*7ZJsYFjVhhjJ?K.%gRr{v?#?tGTL>,k%P4SU:$=m^8`>ug=S', 'HR'),
       ('$EmQ2L2T45gY87YRbjh8akCMk5VagsudGF2kQBzJGJhHJtpWJw5L4gEa4m9M', 'testuser');

insert into users_roles
values ((select user_id from users where username = 'admin'), (select role_id from role where name = 'ROLE_ADMIN')),
       ((select user_id from users where username = 'testuser'), (select role_id from role where name = 'ROLE_USER'));

insert into candidates(name_of_candidate, surname_of_candidate, salary_pro_hour, employment)
values ('test1', 'test1', 11.00, 1),
       ('test2', 'test2', 22.00, 2);

insert into competences(competence_name,level, candidate_id)
values ('test1', 3, (select candidate_id from candidates where name_of_candidate = 'test1')),
       ('test2', 4, (select candidate_id from candidates where name_of_candidate = 'test1'));
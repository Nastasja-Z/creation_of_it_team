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

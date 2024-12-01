create table author(
id varchar(25) not null,
first_name varchar(255),
last_name varchar(255),
email varchar(255),
username varchar(255),
primary key(id)
)engine=InnoDB;

create table author_course(
id varchar(25) not null,
author_id varchar(25),
course_id varchar(25),
constraint Const_AuthorCourse_Author_fk
	foreign key Author_fk (author_id) references author(id)
    ON DELETE CASCADE ON UPDATE CASCADE,
constraint Const_AuthorCourse_Course_fk
	foreign key Course_fk (course_id) references course(id)
    ON DELETE CASCADE ON UPDATE CASCADE,
primary key(id)
)engine=InnoDB;

create table course(
id varchar(25) not null,
title varchar(255) not null,
description text,
primary key(id)
)engine=InnoDB;


create table section(
id varchar(25) not null,
name varchar(255) not null,
orders int,
primary key(id)
)engine=InnoDB;


create table lecture(
id varchar(25) not null,
name varchar(255) not null,
section_id varchar(25) not null,
subjects_id varchar(25) not null,
unique(subjects_id),
foreign key (section_id) references section(id),
constraint const_LectureSubjects_Subjects_fk
	foreign key (subjects_id) references subjects(id),
primary key(id)
)engine=InnoDB;

create table subjects(
id varchar(25) not null,
name enum('FILE','VIDEO','TEXT'),
size long default 0,
url varchar(255),
primary key(id)
)engine=InnoDB;
create table workout
(
    id   INT PRIMARY KEY AUTO_INCREMENT,
    date timestamp
);

create table cardio
(
    id       UUID default UUID() primary key,
    duration nvarchar(255) not null,
    distance nvarchar(255) not null
);

create table weight
(
    id   UUID default UUID() primary key,
    name nvarchar(255) not null,
    reps int           not null,
    sets int           not null
);

create table combined_workout
(
    id         int  not null,
    workout_id UUID not null,
    primary key (id, workout_id)
);

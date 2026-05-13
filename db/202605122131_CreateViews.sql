create or replace view workout_vw as
select *
from workout;
grant select, insert, update, delete
    on workout_db.workout_vw to 'workout_user'@'%';

create or replace view cardio_vw as
select *
from cardio;
grant select, insert, update, delete
    on workout_db.cardio_vw to 'workout_user'@'%';

create or replace view weight_vw as
select *
from weight;
grant select, insert, update, delete
    on workout_db.weight_vw to 'workout_user'@'%';

create or replace view combined_workout_vw as
select *
from combined_workout;
grant select, insert, update, delete
    on workout_db.combined_workout_vw to 'workout_user'@'%';

# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table customer (
  id                        bigserial not null,
  firstname                 varchar(255),
  lastname                  varchar(255),
  city                      varchar(255),
  constraint pk_customer primary key (id))
;




# --- !Downs

drop table if exists customer cascade;


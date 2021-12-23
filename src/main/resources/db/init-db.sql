create database db_s7_demo;
create user db_s7_demo with ENCRYPTED PASSWORD 'db_s7_demo';
grant all privileges on database db_s7_demo to db_s7_demo;
\connect db_s7_demo;
create schema liquibase;
alter schema liquibase OWNER to db_s7_demo;
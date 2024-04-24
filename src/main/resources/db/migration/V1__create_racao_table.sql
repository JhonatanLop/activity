create table rac_racao (
    rac_id serial primary key,
    rac_marca varchar(100) not null unique,
    rac_data_hora_ultima_compra timestamp not null,
    rac_quantidade_estoque numeric,
    rac_nota int not null
);
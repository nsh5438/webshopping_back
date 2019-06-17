use webshopping;

drop table if exists `order`;
drop table if exists `user`;
drop table if exists `product`;
drop table if exists `category`;
drop table if exists `cart`;
drop table if exists `review`;

create table `user`
(
    id      integer primary key auto_increment,
    account varchar(100) not null unique,
    password varchar(100) not null,
    username varchar(100),
    phone varchar(100),
    mobile varchar(100),
    postal_code varchar(15),
    address varchar(100),
    email varchar(50) not null unique ,
    created datetime default current_timestamp,
    updated datetime default current_timestamp on update current_timestamp
) default charset utf8mb4 engine = InnoDB;

create table `category`
(
    id integer primary key auto_increment,
    main_category varchar(100) not null unique,
    sub_category varchar(100)
) default charset utf8mb4 engine = InnoDB;

create table `product`
(
    id  integer primary key auto_increment,
    category integer,
    name varchar(100) not null,
    detail_info varchar(100),
    buy_info varchar(100),
    company varchar(100),
    market_price integer,
    selling_price integer,
    point integer,
    img_path varchar(100),
    created datetime default current_timestamp,
    updated datetime default current_timestamp on update current_timestamp
) default charset utf8mb4 engine = InnoDB;

create table `review`
(
    id integer primary key auto_increment,
    user_id integer not null,
    product_id integer not null,
    title varchar(100),
    content varchar(100),
    created datetime default current_timestamp,
    updated datetime default current_timestamp on update current_timestamp
) default charset utf8mb4 engine = InnoDB;

create table `cart`
(
    id integer primary key auto_increment,
    user_id integer not null,
    product_id integer not null,
    count integer,
    is_order varchar(1)
) default charset utf8mb4 engine = InnoDB;

create table `order`
(
    id integer primary key auto_increment,
    user_id integer not null,
    product_id integer not null,
    count integer,
    all_total integer,
    pay_way varchar(10),
    order_date datetime default current_timestamp
) default charset utf8mb4 engine = InnoDB;


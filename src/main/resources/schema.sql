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
    email varchar(50) not null unique,
    point integer,
    created datetime default current_timestamp,
    updated datetime default current_timestamp on update current_timestamp
) default charset utf8mb4 engine = InnoDB;

create table `category`
(
    id integer primary key auto_increment,
    main_category varchar(100) not null,
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
    img_path varchar(1000),
    img_name varchar(100),
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
    order_date datetime default current_timestamp
) default charset utf8mb4 engine = InnoDB;

insert into user (account, password, username, phone, mobile, postal_code, address, email, point)
values
('test','1234','test','010-1111-1111','010-1111-1111','12345','대구광역시 중구','test@dgsw.hs.kr',1975);

insert into category (main_category, sub_category)
values
('상의(남)','티셔츠'),
('상의(남)','맨투맨/후드티'),
('상의(남)','셔츠'),
('상의(남)','스웨터'),
('상의(남)','가디건'),
('상의(남)','아우터'),
('상의(여)','티셔츠'),
('상의(여)','블라우스/셔츠'),
('상의(여)','니트'),
('상의(여)','맨투맨/후드티'),
('상의(여)','아우터');

insert into product (category, name, detail_info, buy_info, company, market_price, selling_price, point, img_path, img_name)
values
(1,"NY 자수 반팔티","편한 티셔츠 입니다.","상품에 대한 문의나 배송문의는 저에게 바로 연락을 주세요.","꼰스",75000,10500,525,"D:/3102_남가영/IdeaProjects/webshopping/shop_back/upload/a4e9ec85-3e2d-4405-928d-4b4e9ee181d9 t_shirt.png","t-shirt.png"),
(1,"남성용 에어 쿨링 오버핏 티셔츠","오버핏 티셔츠 입니다.","상품에 대한 문의나 배송문의는 저에게 바로 연락을 주세요.","고스트리퍼블릭",19540,16910,525,"D:/3102_남가영/IdeaProjects/webshopping/shop_back/upload/a4e9ec85-3e2d-4405-928d-4b4e9ee181d9 t_shirt.png","t-shirt.png"),
(8,"엔젤 자수레이스블라우스","러블리한 블라우스 입니다.","상품에 대한 문의나 배송문의는 저에게 바로 연락을 주세요.","메이킹유",28900,8700,435,"D:/3102_남가영/IdeaProjects/webshopping/shop_back/upload/7f134b34-5114-4a2d-a9b4-1b708b83c88a shirt.PNG","shirt.png"),
(10,"여성 오버핏 후드집업","오버핏 후드집업 입니다.","상품에 대한 문의나 배송문의는 저에게 바로 연락을 주세요.","토마토팩토리",22900,19900,995,"D:/3102_남가영/IdeaProjects/webshopping/shop_back/upload/e9f5129b-00c7-4262-996d-a98aec2b6c59 jacket.PNG","jacket.png"),
(10,"UN 여자 오버핏 바람막이 집업","오버핏 바람막이 입니다.","상품에 대한 문의나 배송문의는 저에게 바로 연락을 주세요.","통큰마켓",29000,29000,1450,"D:/3102_남가영/IdeaProjects/webshopping/shop_back/upload/d3110f9f-e851-46d2-bbce-79f0cfa7c632 windy.PNG","windy.png");

insert into `order` (user_id, product_id, count, all_total)
values
(1,2,4,67640),
(1,2,2,33820),
(1,5,1,29000);

insert into review (user_id, product_id, title, content)
values
(1,2,'good','편해요'),
(1,2,'soso','그럭저럭'),
(1,5,'good','good');
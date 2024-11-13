create schema onskeskyen;

create table users(
	user_id int primary key AUTO_INCREMENT,
    username varchar(100) not null,
    password varchar(100) not null,
    email varchar(100) not null,
    created_at TIMESTAMP default current_timestamp
    );

create table wishlists(
	wishlist_id int primary key auto_increment,
    wishlist_name varchar(100) not null,
    created_at TIMESTAMP default current_timestamp,
    user_id int not null,
    foreign key(user_id) references users(user_id)
    on delete cascade
    );
    

create table wishlistitems(
	wishitem_ID int primary key auto_increment,
    wishitem_name varchar(100) not null,
    wishlistitem_desc varchar(100) not null,
    wishitem_price int not null,
    wish_item_link varchar(250),
    wishlist_ID int not null,
    foreign key (wishlist_ID) references wishlists(wishlist_id)
    on delete cascade
    );
    
    
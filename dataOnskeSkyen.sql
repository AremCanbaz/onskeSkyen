
insert into users (username, password, email) VALUES
('Arem', 'password123', 'Arem@example.com'),
('Mohammed', 'password456', 'Mohammed@example.com'),
('Hamza', 'password789', 'Hamza@example.com'),
('Abdul', 'password321', 'Abdul@example.com'),
('Christian', 'password654', 'Christian@example.com');


insert into wishlists (wishlist_name, user_id) values
('Arem Fødselsdag', 1),
('Mohammed Christmas List', 2),
('Hamza Travel Wishlist', 3),
('Abdul Books Wishlist', 4),
('Christian Tech Gadgets', 5);


insert into wishlistitems (wishitem_name, wishlistitem_desc, wishitem_price, wish_item_link, wishlist_ID) values
('iPhone 15', 'Latest Apple iPhone', 1200, 'https://example.com/iphone15', 1),
('PlayStation 5', 'Gaming console by Sony', 500, 'https://example.com/ps5', 2),
('Backpack', 'Travel backpack with multiple compartments', 100, 'https://example.com/backpack', 3),
('Kindle', 'E-book reader by Amazon', 150, 'https://example.com/kindle', 4),
('Smartwatch', 'High-end smartwatch with GPS', 300, 'https://example.com/smartwatch', 5);

-- liquibase formatted sql
insert into products (id, short_desc, category_id, name, description, price, quantity, created_at, brand_id)
values (1, 'Apple iPhone 15 Pro Max 256Gb', 1, 'Apple iPhone 15 Pro Max 256Gb', 'Apple iPhone 15 Pro Max 256Gb', 1000, 10, '2021-01-01', 1),
       (2, 'Samsung Galaxy A24 6/128Gb Black', 1, 'Samsung Galaxy A24 6/128Gb Black', 'Samsung Galaxy A24 6/128Gb Black', 1100, 10, '2021-01-01', 2),
       (3, 'Samsung Galaxy S24 Ultra 12/512Gb', 1, 'Samsung Galaxy S24 Ultra 12/512Gb', 'Samsung Galaxy S24 Ultra 12/512Gb', 1400, 10, '2021-01-01', 2),
       (4, 'Apple iPhone 15 Pro 128 Gb Blue Titanium', 1, 'Apple iPhone 15 Pro 128 Gb Blue Titanium', 'Apple iPhone 15 Pro 128 Gb Blue Titanium', 900, 10, '2021-01-01', 1),
       (5, 'Samsung Galaxy S23 FE 5G 256Gb Mint Global', 1, 'Samsung Galaxy S23 FE 5G 256Gb Mint Global', 'Samsung Galaxy S23 FE 5G 256Gb Mint Global', 2000, 10, '2021-01-01', 2),
       (6, 'Apple iPhone 15 128GB Green', 1, 'Apple iPhone 15 128GB Green', 'Apple iPhone 15 128GB Green', 1500, 10, '2021-01-01', 1),
       (7, 'Apple iPhone 15 128GB Pink', 1, 'Apple iPhone 15 128GB Pink', 'Apple iPhone 15 128GB Pink', 2000, 10, '2021-01-01', 1),
       (8, 'Apple iPhone 13 128Gb Starlight', 1, 'Apple iPhone 13 128Gb Starlight', 'Apple iPhone 13 128Gb Starlight', 2500, 10, '2021-01-01', 1),
       (9, 'Lenovo IdeaPad 1 15ALC7', 2, 'Lenovo IdeaPad 1 15ALC7', 'Lenovo IdeaPad 1 15ALC7', 2500, 10, '2021-01-01', 1),
       (10, 'Asus TUF Gaming A15', 2, 'Asus TUF Gaming A15', 'Asus TUF Gaming A15', 2500, 10, '2021-01-01', 1),
       (11, 'Apple MacBook Air 15.3 M3 8GB 256GB', 2, 'Apple MacBook Air 15.3 M3 8GB 256GB', 'Apple MacBook Air 15.3 M3 8GB 256GB', 2500, 10, '2021-01-01', 1),
       (12, 'Nikon Coolpix P950 Black', 3, 'Nikon Coolpix P950 Black', 'Nikon Coolpix P950 Black', 2500, 10, '2021-01-01', 1),
       (13, 'Fujifilm Instax Mini 12 Lilac/Violet', 3, 'Fujifilm Instax Mini 12 Lilac/Violet', 'Fujifilm Instax Mini 12 Lilac/Violet', 2500, 10, '2021-01-01', 1),
       (14, 'Canon EOS 6D Mark II', 3, 'Canon EOS 6D Mark II', 'Canon EOS 6D Mark II', 2500, 10, '2021-01-01', 1);

insert into orders(full_name, email, phone_number, address_id,
    is_paid, delivery_status, delivery_method, comment, created_at)
    VALUES
    ('Alice Smith', 'alice.smith@gmail.com', '0911111111', 1,
    true, 'COMPLETED', 'NOVA', null, '2025-06-01T10:00:00'),
    ('Bob Johnson', 'bob.johnson@gmail.com', '0922222222', 2,
    true, 'COMPLETED', 'COURIER', null, '2025-06-01T15:00:00'),
    ('Carol White', 'carol.white@gmail.com', '0933333333', 3,
    false, 'CANCELED', 'UKRPOSHTA', null, '2025-06-02T08:00:00'),
    ('David Brown', 'david.brown@gmail.com', '0944444444', 4,
    false, 'AWAITING', 'NOVA', 'Please call me to confirm that all products are in stock', '2025-06-04T10:00:00'),
    ('Emily Davis', 'emily.davis@gmail.com', '0955555555', 5,
    true, 'SHIPPED', 'COURIER', null, '2025-06-04T20:00:24'),
    ('Frank Miller', 'frank.miller@gmail.com', '0966666666', 6,
    false, 'SHIPPED', 'NOVA', 'Please send the product in a week, I am currently away', '2025-06-05T12:30:12'),
    ('Grace Wilson', 'grace.wilson@gmail.com', '0977777777', 7,
    true, 'PROCESSED', 'UKRPOSHTA', ' ', '2025-06-07T09:45:52'),
    ('Hannah King', 'hannah.king@gmail.com', '0988888888', 8,
    false, 'PROCESSING', 'COURIER', null, '2025-06-10T20:14:06');
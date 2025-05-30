insert into users(id, email, password, full_name, phone_number, role, created_at, refresh_token_key)
    VALUES
    --Admin test
    (1, 'test_admin@gmail.com', 'ADMIN', 'Admin Admin', '0505005050', 'ROLE_ADMIN', '2025-05-04T00:0:00', 'admin-refresh-token-key'),

    --User test
    (2, 'test_user@gmail.com', 'USER', 'John Doe', '0999999999', 'ROLE_USER', '2025-05-23T14:30:00', 'user-refresh-token-key'),

    -- Additional users
    (3, 'alice.smith@gmail.com', 'hashed_password_3', 'Alice Smith', '0911111111', 'ROLE_USER', '2025-05-22 10:15:00', 'rtk-3'),
    (4, 'bob.johnson@gmail.com', 'hashed_password_4', 'Bob Johnson', '0922222222', 'ROLE_USER', '2025-05-22 11:00:00', 'rtk-4'),
    (5, 'carol.white@gmail.com', 'hashed_password_5', 'Carol White', '0933333333', 'ROLE_USER', '2025-05-22 11:45:00', 'rtk-5'),
    (6, 'david.brown@gmail.com', 'hashed_password_6', 'David Brown', '0944444444', 'ROLE_USER', '2025-05-22 12:30:00', 'rtk-6'),
    (7, 'emily.davis@gmail.com', 'hashed_password_7', 'Emily Davis', '0955555555', 'ROLE_USER', '2025-05-22 13:15:00', 'rtk-7'),
    (8, 'frank.miller@gmail.com', 'hashed_password_8', 'Frank Miller', '0966666666', 'ROLE_USER', '2025-05-22 14:00:00', 'rtk-8'),
    (9, 'grace.wilson@gmail.com', 'hashed_password_9', 'Grace Wilson', '0977777777', 'ROLE_USER', '2025-05-22 14:45:00', 'rtk-9'),
    (10, 'henry.moore@gmail.com', 'hashed_password_10', 'Henry Moore', '0988888888', 'ROLE_USER', '2025-05-22 15:30:00', 'rtk-10');

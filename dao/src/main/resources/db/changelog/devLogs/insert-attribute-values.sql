-- liquibase formatted sql
insert into public.attribute_values (id, attribute_id, value)
values
    -- Memory ROM
    (1, 1, '128 Gb'),   --15 Pro, 15, 13, A24
    (2, 1, '256 Gb'),   --15 Pro Max, S23
    (3, 1, '512 Gb'),   --S24 Ultra
    -- Memory RAM
    (4, 2, '4 Gb'),     --A24
    (5, 2, '6 Gb'),     --15 Pro, 15, 13
    (6, 2, '8 Gb'),     --15 Pro Max, S23
    (7, 2, '12 Gb'),    --S24 Ultra
    (91, 2, '16 Gb'),
    -- Colors
    (8, 3, 'BBB5A9'),   -- Gray
    (9, 3, '354763'),   -- Dark Blue
    (10, 3, '4A4B4D'),  -- Dark Gray
    (11, 3, '71F2A5'),  -- Light Green
    (12, 3, '32C0F0'),  -- Light Blue
    (13, 3, 'FFCCC8'),  -- Powder Pink
    (14, 3, '808080'),  -- Medium Gray
    (15, 3, 'F0E1B9'),  -- Gold
    (16, 3, 'F5F5F5'),  -- White
    (17, 3, 'B484D8'),  -- Dark Purple
    (18, 3, 'FEF2F2'),  -- Creamy
    (19, 3, 'E7CEFD'),  -- Light Purple
    (85, 3, '191970'), -- Midnight (Dark Blue)
    (92, 3, '1C1C1C'), -- Carbon Black
    (96, 3, '4B4B4B'), --Silver
    -- Display diagonal
    (20, 4, '6.69 inches'),     --15 Pro Max
    (21, 4, '6.5 inches'),      --A24
    (22, 4, '6.8 inches'),      --S24 Ultra
    (23, 4, '6.1 inches'),      --S23
    (24, 4, '6.12 inches'),     --15 Pro, 15
    (25, 4, '6.06 inches'),     --13
    (62, 4, '11 inches'),
    (63, 4, '14 inches'),
    (64, 4, '15.6 inches'),
    (86, 4, '13.6 inches'),
    (103, 4, '17.3 inches'),
    -- Screen resolution
    (26, 5, '2796 x 1290 pixels'),  --15 Pro Max
    (27, 5, '1080 x 2340 pixels'),  --A24
    (28, 5, '1440 x 3120 pixels'),  --S24 Ultra
    (29, 5, '1080 x 2350 pixels'),  --S23
    (30, 5, '2556 x 1179 pixels'),  --15 Pro, 15
    (31, 5, '2532 x 1170 pixels'),  --13
    (65, 5, '2388 x 1668 pixels'),
    (66, 5, '2560 x 1600 pixels'),
    (67, 5, '1920 x 1080 pixels'),
    (79, 5, '2880 x 1864 pixels'),
    (87, 5, '2560 x 1664 pixels'),
    -- Screen type
    (32, 6, 'Super Retina XDR OLED'),    --15 Pro Max, --15 Pro, 15
    (33, 6, 'Super AMOLED'),             --A24
    (34, 6, 'Dynamic AMOLED 2X'),   --S24 Ultra, S23
    (68, 6, 'IPS'),
    (69, 6, 'TFT'),
    (70, 6, 'AMOLED'),
    (80, 6, 'Liquid Retina'),
    -- Screen refresh rate
    (35, 7, '120 Hz'),  --15 Pro Max, S24 Ultra, s23
    (36, 7, '60 Hz'),   --15, 13
    (37, 7, '90 Hz'),   --A24
    -- Glass protection technology
    (38, 8, 'Gorilla Glass 7'),    --15 Pro Max
    (39, 8, 'Gorilla Glass Victus'),  --S24 Ultra
    (40, 8, 'Gorilla Glass 5'),    --15 Pro, 15
    (41, 8, 'Gorilla Glass 3'),    --13
    -- Communication standards
    (42, 9, '5G'),  --15 Pro Max, A24, S24 Ultra
    (43, 9, '4G LTE'),  --15 Pro, 15, S23, 13
    -- Number of SIM cards
    (44, 10, '2'),  --S24 Ultra, S23
    (45, 10, '1'),  --15 Pro, 15, 13, A24, 15 Pro Max
    -- SIM card size
    (46, 11, 'Nano-SIM'),    --15 Pro Max, 15, 13
    (47, 11, 'Micro-SIM'),   --A24, S24 Ultra, S23
    -- Operating system
    (48, 12, 'iOS'),     --15 Pro Max, 15, 13
    (49, 12, 'Android'), --A24, S24 Ultra, S23
    (74, 12, 'Windows'),
    (83, 12, 'Linux'),
    (84, 12, 'MacOS'),
    (95, 12, 'FreeDOS'),
    -- Processor frequency
    (50, 13, '3.0 GHz'),
    (51, 13, '2.3 GHz'),
    (72, 13, '2.1 GHz'),
    (78, 13, '4.2 GHz'),
    (82, 13, '3.6 GHz'),
    (94, 13, '4.4 GHz'),
    (98, 13, '2.8 GHz'),
    (101, 13, '4.5 GHz'),
    -- Number of processor cores
    (52, 14, 'Octa-core'),
    (53, 14, 'Quad-core'),
    (73, 14, 'Hexa-core'),
    (99, 14, 'Dual-core'),
    -- Processor model
    (54, 15, 'A14 Bionic'),    --15 Pro Max, 15, 13
    (55, 15, 'Snapdragon 888'),    --A24, S24 Ultra, S23
    (71, 15, 'AMD Ryzen 5 5500U'),
    (77, 15, 'Intel Core i5-1135G7'),
    (81, 15, 'Apple M3'),
    (93, 15, 'Intel Core i5-1235U'),
    (97, 15, 'Intel Celeron N4500'),
    (102, 15, 'Intel Core i5-12500H'),
    (104, 15, 'Intel Core i5-12450H'),
    -- Flesh card
    (56, 16, 'Supports microSD'),  --A24, S24 Ultra, S23
    (57, 16, 'No microSD support'), --15 Pro Max, 15, 13
    -- Sensor resolution
    (58, 17, '108 MP'),    --S24 Ultra
    (59, 17, '12 MP'),     --15 Pro Max, 15, 13, A24, S23
    -- Video card
    (60, 18, 'AMD Radeon RX 6700 XT'),
    (61, 18, 'NVIDIA RTX 3060'),
    (75, 18, 'Intel UHD Graphics 620'),
    (76, 18, 'Integrated'),
    (100, 18, 'NVIDIA GeForce RTX 3050'),
    (105, 18, 'NVIDIA GeForce RTX 2050'),

    --Bluetooth version
    (88, 19, '5.3'),

    --Weight
    (89, 20, '200g'),

    --Max play time
    (90, 21, '76h'),

    --Models
    (106, 22, 'Apple iPhone 15 Pro'),
    (107, 22, 'Apple iPhone 15 Pro Max'),
    (108, 22, 'Apple iPhone 15');

-- liquibase formatted sql
insert into product_attributes (id, product_id, attribute_value_id)
values
    -- Apple iPhone 15 Pro Max
    (1, 1, 2),  -- Memory ROM: 256 Gb
    (2, 1, 6),  -- Memory RAM: 8 Gb
    (3, 1, 8),  -- Color: Gray
    (4, 1, 20), -- Display diagonal: 6.69 inches
    (5, 1, 26), -- Screen resolution: 2796 x 1290 pixels
    (6, 1, 32), -- Screen type: Super Retina XDR OLED
    (7, 1, 35), -- Screen refresh rate: 120 Hz
    (8, 1, 38), -- Glass protection technology: Gorilla Glass 7
    (9, 1, 42), -- Communication standards: 5G
    (10, 1, 45), -- Number of SIM cards: 1
    (11, 1, 46), -- SIM card size: Nano-SIM
    (12, 1, 48), -- Operating system: iOS
    (13, 1, 50), -- Processor frequency: 3.0 GHz
    (14, 1, 52), -- Number of processor cores: Octa-core
    (15, 1, 54), -- Processor model: A14 Bionic
    (16, 1, 57), -- Flesh card: No microSD support
    (17, 1, 59), -- Sensor resolution: 12 MP

    -- Samsung Galaxy A24
    (18, 2, 1),  -- Memory ROM: 128 Gb
    (19, 2, 4),  -- Memory RAM: 4 Gb
    (20, 2, 11), -- Color: Light Green
    (21, 2, 21), -- Display diagonal: 6.5 inches
    (22, 2, 27), -- Screen resolution: 1080 x 2340 pixels
    (23, 2, 33), -- Screen type: Super AMOLED
    (24, 2, 37), -- Screen refresh rate: 90 Hz
    (25, 2, 43), -- Communication standards: 4G LTE
    (26, 2, 45), -- Number of SIM cards: 1
    (27, 2, 47), -- SIM card size: Micro-SIM
    (28, 2, 49), -- Operating system: Android
    (29, 2, 51), -- Processor frequency: 2.3 GHz
    (30, 2, 52), -- Number of processor cores: Octa-core
    (31, 2, 55), -- Processor model: Snapdragon 888
    (32, 2, 56), -- Flesh card: Supports microSD
    (33, 2, 59), -- Sensor resolution: 12 MP

    -- Samsung Galaxy S24 Ultra
    (34, 3, 3),  -- Memory ROM: 512 Gb
    (35, 3, 7),  -- Memory RAM: 12 Gb
    (36, 3, 15), -- Color: Gold
    (37, 3, 22), -- Display diagonal: 6.8 inches
    (38, 3, 28), -- Screen resolution: 1440 x 3120 pixels
    (39, 3, 34), -- Screen type: Dynamic AMOLED 2X
    (40, 3, 35), -- Screen refresh rate: 120 Hz
    (41, 3, 39), -- Glass protection technology: Gorilla Glass Victus
    (42, 3, 42), -- Communication standards: 5G
    (43, 3, 44), -- Number of SIM cards: 2
    (44, 3, 47), -- SIM card size: Micro-SIM
    (45, 3, 49), -- Operating system: Android
    (46, 3, 51), -- Processor frequency: 2.3 GHz
    (47, 3, 52), -- Number of processor cores: Octa-core
    (48, 3, 55), -- Processor model: Snapdragon 888
    (49, 3, 56), -- Flesh card: Supports microSD
    (50, 3, 58), -- Sensor resolution: 108 MP

    -- Apple iPhone 15 Pro 128 Gb Blue Titanium
    (51, 4, 1),   -- Memory ROM: 128 Gb
    (52, 4, 5),   -- Memory RAM: 6 Gb
    (53, 4, 9),   -- Color: Dark Blue
    (54, 4, 24),  -- Display diagonal: 6.12 inches
    (55, 4, 30),  -- Screen resolution: 2556 x 1179 pixels
    (56, 4, 32),  -- Screen type: Super Retina XDR OLED
    (57, 4, 35),  -- Screen refresh rate: 120 Hz
    (58, 4, 40),  -- Glass protection technology: Gorilla Glass 5
    (59, 4, 43),  -- Communication standards: 4G LTE
    (60, 4, 45),  -- Number of SIM cards: 1
    (61, 4, 46),  -- SIM card size: Nano-SIM
    (62, 4, 48),  -- Operating system: iOS
    (63, 4, 50),  -- Processor frequency: 3.0 GHz
    (64, 4, 52),  -- Number of processor cores: Octa-core
    (65, 4, 54),  -- Processor model: A14 Bionic
    (66, 4, 57),  -- Flesh card: No microSD support
    (67, 4, 59),  -- Sensor resolution: 12 MP

    -- Samsung Galaxy S23 FE 5G 256Gb Mint Global
    (68, 5, 2),   -- Memory ROM: 256 Gb
    (69, 5, 6),   -- Memory RAM: 8 Gb
    (70, 5, 12),  -- Color: Light Blue
    (71, 5, 23),  -- Display diagonal: 6.1 inches
    (72, 5, 29),  -- Screen resolution: 1080 x 2350 pixels
    (73, 5, 34),  -- Screen type: Dynamic AMOLED 2X
    (74, 5, 35),  -- Screen refresh rate: 120 Hz
    (75, 5, 43),  -- Communication standards: 4G LTE
    (76, 5, 44),  -- Number of SIM cards: 2
    (77, 5, 47),  -- SIM card size: Micro-SIM
    (78, 5, 49),  -- Operating system: Android
    (79, 5, 51),  -- Processor frequency: 2.3 GHz
    (80, 5, 52),  -- Number of processor cores: Octa-core
    (81, 5, 55),  -- Processor model: Snapdragon 888
    (82, 5, 56),  -- Flesh card: Supports microSD
    (83, 5, 59),  -- Sensor resolution: 12 MP

    -- Apple iPhone 15 128GB Green
    (84, 6, 1),   -- Memory ROM: 128 Gb
    (85, 6, 5),   -- Memory RAM: 6 Gb
    (86, 6, 11),  -- Color: Light Green
    (87, 6, 24),  -- Display diagonal: 6.12 inches
    (88, 6, 30),  -- Screen resolution: 2556 x 1179 pixels
    (89, 6, 32),  -- Screen type: Super Retina XDR OLED
    (90, 6, 36),  -- Screen refresh rate: 60 Hz
    (91, 6, 40),  -- Glass protection technology: Gorilla Glass 5
    (92, 6, 43),  -- Communication standards: 4G LTE
    (93, 6, 45),  -- Number of SIM cards: 1
    (94, 6, 46),  -- SIM card size: Nano-SIM
    (95, 6, 48),  -- Operating system: iOS
    (96, 6, 50),  -- Processor frequency: 3.0 GHz
    (97, 6, 52),  -- Number of processor cores: Octa-core
    (98, 6, 54),  -- Processor model: A14 Bionic
    (99, 6, 57),  -- Flesh card: No microSD support
    (100, 6, 59), -- Sensor resolution: 12 MP

    -- Apple iPhone 15 128GB Pink
    (101, 7, 1),   -- Memory ROM: 128 Gb
    (102, 7, 5),   -- Memory RAM: 6 Gb
    (103, 7, 13),  -- Color: Powder Pink
    (104, 7, 24),  -- Display diagonal: 6.12 inches
    (105, 7, 30),  -- Screen resolution: 2556 x 1179 pixels
    (106, 7, 32),  -- Screen type: Super Retina XDR OLED
    (107, 7, 36),  -- Screen refresh rate: 60 Hz
    (108, 7, 40),  -- Glass protection technology: Gorilla Glass 5
    (109, 7, 43),  -- Communication standards: 4G LTE
    (110, 7, 45),  -- Number of SIM cards: 1
    (111, 7, 46),  -- SIM card size: Nano-SIM
    (112, 7, 48),  -- Operating system: iOS
    (113, 7, 50),  -- Processor frequency: 3.0 GHz
    (114, 7, 52),  -- Number of processor cores: Octa-core
    (115, 7, 54),  -- Processor model: A14 Bionic
    (116, 7, 57),  -- Flesh card: No microSD support
    (117, 7, 59),  -- Sensor resolution: 12 MP

    -- Apple iPhone 13 128Gb Starlight
    (118, 8, 1),   -- Memory ROM: 128 Gb
    (119, 8, 5),   -- Memory RAM: 6 Gb
    (120, 8, 16),  -- Color: White
    (121, 8, 25),  -- Display diagonal: 6.06 inches
    (122, 8, 31),  -- Screen resolution: 2532 x 1170 pixels
    (123, 8, 32),  -- Screen type: Super Retina XDR OLED
    (124, 8, 36),  -- Screen refresh rate: 60 Hz
    (125, 8, 41),  -- Glass protection technology: Gorilla Glass 3
    (126, 8, 43),  -- Communication standards: 4G LTE
    (127, 8, 45),  -- Number of SIM cards: 1
    (128, 8, 46),  -- SIM card size: Nano-SIM
    (129, 8, 48),  -- Operating system: iOS
    (130, 8, 50),  -- Processor frequency: 3.0 GHz
    (131, 8, 52),  -- Number of processor cores: Octa-core
    (132, 8, 54),  -- Processor model: A14 Bionic
    (133, 8, 57),  -- Flesh card: No microSD support
    (134, 8, 59);  -- Sensor resolution: 12 MP

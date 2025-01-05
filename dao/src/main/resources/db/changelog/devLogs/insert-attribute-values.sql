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
    -- Display diagonal
    (20, 4, '6.69 inches'),     --15 Pro Max
    (21, 4, '6.5 inches'),      --A24
    (22, 4, '6.8 inches'),      --S24 Ultra
    (23, 4, '6.1 inches'),      --S23
    (24, 4, '6.12 inches'),     --15 Pro, 15
    (25, 4, '6.06 inches'),     --13
    -- Screen resolution
    (26, 5, '2796 x 1290 pixels'),  --15 Pro Max
    (27, 5, '1080 x 2340 pixels'),  --A24
    (28, 5, '1440 x 3120 pixels'),  --S24 Ultra
    (29, 5, '1080 x 2350 pixels'),  --S23
    (30, 5, '2556 x 1179 pixels'),  --15 Pro, 15
    (31, 5, '2532 x 1170 pixels'),  --13
    -- Screen type
    (32, 6, 'Super Retina XDR OLED'),    --15 Pro Max, --15 Pro, 15
    (33, 6, 'Super AMOLED'),             --A24
    (34, 6, 'Dynamic AMOLED 2X'),   --S24 Ultra, S23
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
    -- Processor frequency
    (50, 13, '3.0 GHz'),
    (51, 13, '2.3 GHz'),
    -- Number of processor cores
    (52, 14, 'Octa-core'),
    (53, 14, 'Quad-core'),
    -- Processor model
    (54, 15, 'A14 Bionic'),    --15 Pro Max, 15, 13
    (55, 15, 'Snapdragon 888'),    --A24, S24 Ultra, S23
    -- Flesh card
    (56, 16, 'Supports microSD'),  --A24, S24 Ultra, S23
    (57, 16, 'No microSD support'), --15 Pro Max, 15, 13
    -- Sensor resolution
    (58, 17, '108 MP'),    --S24 Ultra
    (59, 17, '12 MP'),     --15 Pro Max, 15, 13, A24, S23
    -- Video card
    (60, 18, 'AMD Radeon RX 6700 XT'),
    (61, 18, 'NVIDIA RTX 3060');

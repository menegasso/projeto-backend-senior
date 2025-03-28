-- ===============================
-- 1) City Table
-- ===============================
CREATE TABLE city (
    city_id   SERIAL PRIMARY KEY,
    city_name VARCHAR(200) NOT NULL
);

-- ===============================
-- 2) Address Table
-- ===============================
CREATE TABLE address (
    address_id   SERIAL PRIMARY KEY,
    street       VARCHAR(200) NOT NULL,
    number       VARCHAR(10),
    neighborhood VARCHAR(100),
    -- Relationship with city
    city_id      INT NOT NULL,
    CONSTRAINT fk_address_city
        FOREIGN KEY (city_id)
        REFERENCES city(city_id)
);

-- ===============================
-- 3) Person Table
-- ===============================
CREATE TABLE person (
    person_id       SERIAL PRIMARY KEY,
    person_name     VARCHAR(200) NOT NULL,
    birth_date      DATE,
    mother_name     VARCHAR(200),
    father_name     VARCHAR(200)
);

-- ===============================
-- 4) Person Photo Table
-- ===============================
CREATE TABLE person_photo (
    photo_id       SERIAL PRIMARY KEY,
    photo_path     VARCHAR(300) NOT NULL,
    upload_date    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    -- Relationship with person
    person_id      INT NOT NULL,
    CONSTRAINT fk_person_photo
        FOREIGN KEY (person_id)
        REFERENCES person(person_id)
);

-- ===============================
-- 5) Permanent Employee Table
-- ===============================
CREATE TABLE permanent_employee (
    perm_emp_id         SERIAL PRIMARY KEY,
    appointment_date    DATE,
    service_start_date  DATE,
    -- Relationship with person
    person_id           INT NOT NULL,
    CONSTRAINT fk_perm_employee_person
        FOREIGN KEY (person_id)
        REFERENCES person(person_id)
);

-- ===============================
-- 6) Temporary Employee Table
-- ===============================
CREATE TABLE temporary_employee (
    temp_emp_id         SERIAL PRIMARY KEY,
    admission_date      DATE,
    -- Relationship with person
    person_id           INT NOT NULL,
    CONSTRAINT fk_temp_employee_person
        FOREIGN KEY (person_id)
        REFERENCES person(person_id)
);

-- ===============================
-- 7) Unit Table
-- ===============================
CREATE TABLE unit (
    unit_id     SERIAL PRIMARY KEY,
    unit_name   VARCHAR(200) NOT NULL,
    unit_acronym VARCHAR(50)
);

-- ===============================
-- 8) Assignment Table
-- ===============================
CREATE TABLE assignment (
    assignment_id    SERIAL PRIMARY KEY,
    person_id        INT NOT NULL,
    unit_id          INT NOT NULL,
    assignment_date  DATE,
    removal_date     DATE,
    decree           VARCHAR(100),
    CONSTRAINT fk_assignment_person
        FOREIGN KEY (person_id)
        REFERENCES person(person_id),
    CONSTRAINT fk_assignment_unit
        FOREIGN KEY (unit_id)
        REFERENCES unit(unit_id)
);

-- ===============================
-- 9) Person Address Table
-- (Association table between person and address)
-- ===============================
CREATE TABLE person_address (
    person_id  INT NOT NULL,
    address_id INT NOT NULL,
    PRIMARY KEY (person_id, address_id),
    CONSTRAINT fk_person_address_person
        FOREIGN KEY (person_id)
        REFERENCES person(person_id),
    CONSTRAINT fk_person_address_address
        FOREIGN KEY (address_id)
        REFERENCES address(address_id)
);

-- ===============================
-- 10) Unit Address Table
-- (Association table between unit and address)
-- ===============================
CREATE TABLE unit_address (
    unit_id    INT NOT NULL,
    address_id INT NOT NULL,
    PRIMARY KEY (unit_id, address_id),
    CONSTRAINT fk_unit_address_unit
        FOREIGN KEY (unit_id)
        REFERENCES unit(unit_id),
    CONSTRAINT fk_unit_address_address
        FOREIGN KEY (address_id)
        REFERENCES address(address_id)
);

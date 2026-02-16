CREATE TABLE brand (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE product (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE prices (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    brand_id BIGINT NOT NULL,
    product_id BIGINT NOT NULL,
    price_list INT NOT NULL,
    priority INT NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    curr VARCHAR(3) NOT NULL,
    start_date TIMESTAMP NOT NULL,
    end_date TIMESTAMP NOT NULL,
    CONSTRAINT fk_prices_brand
        FOREIGN KEY (brand_id)
            REFERENCES brand(id)
            ON DELETE RESTRICT
            ON UPDATE CASCADE,

    CONSTRAINT fk_prices_product
        FOREIGN KEY (product_id)
            REFERENCES product(id)
            ON DELETE RESTRICT
            ON UPDATE CASCADE
);
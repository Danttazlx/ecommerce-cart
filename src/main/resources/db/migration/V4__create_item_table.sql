
CREATE TABLE items(

id BIGINT AUTO_INCREMENT PRIMARY KEY ,
quantity INTEGER NOT NULL,
cart_id BIGINT NOT NULL,
product_id BIGINT NOT NULL,

-- cart(FK)

CONSTRAINT fk_item_cart
FOREIGN KEY (cart_id)
REFERENCES carts(id),

-- product(FK)

CONSTRAINT fk_item_product
FOREIGN KEY (product_id)
REFERENCES products(id)


 );

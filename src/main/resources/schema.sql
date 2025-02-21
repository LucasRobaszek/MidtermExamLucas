CREATE TABLE STORE
(
    STORE_ID   LONG PRIMARY KEY AUTO_INCREMENT,
    STORE_NAME VARCHAR(255)
);
CREATE TABLE PRODUCT
(  PRODUCT_ID LONG PRIMARY KEY AUTO_INCREMENT,
   PRODUCT_NAME VARCHAR(255),
    PRODUCT_PRICE DOUBLE PRECISION,
    PRODUCT_QUANTITY INTEGER,
   STORE_ID LONG,
   FOREIGN KEY (STORE_ID) REFERENCES STORE(STORE_ID)
);
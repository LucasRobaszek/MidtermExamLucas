package ca.sheridancollege.robaszel.midtermexamlucas.beans;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PRODUCT_ID")
    private Long id;
    @Column(name = "PRODUCT_PRICE")
    private double price;
    @Column(name = "PRODUCT_QUANTITY")
    private int quantity;
    @JoinColumn(name = "STORE_ID")
    private Long storeId;

}

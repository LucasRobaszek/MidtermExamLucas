package ca.sheridancollege.robaszel.midtermexamlucas.beans;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="STORE_ID")
    private Long id;
    @Column(name="STORE_NAME")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="PRODUCT_STOREID")
    private List<Product> products = new ArrayList<>();
}

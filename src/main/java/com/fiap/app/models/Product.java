package com.fiap.app.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
@AttributeOverride(name = "id", column = @Column(name = "productId"))
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private String productType;
    private Float productPrice;
    private Integer productQuantity;
    private Long supplierId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="supplierId", referencedColumnName="supplierId", insertable = false, updatable = false)
    @JsonIgnore
    private Supplier supplier;


    @Override
    public String toString() {
        return "Nome:" + productName + '\'' +
                ", Tipo:" + productType + '\'' +
                ", Preço:" + productPrice +
                ", Quantidade:" + productQuantity +
                ", Id do Fornecedor" + supplierId +"\n";
    }
}

package com.fiap.app.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fiap.app.models.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name="'order'")
@AttributeOverride(name = "id", column = @Column(name = "orderId"))
public class Order extends BaseEntity {
    private String productNameOrder;
    private int productQuantityOrder;
    private Float orderPrice;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "supplierId")
    @JsonIgnore
    private Supplier supplier;

}

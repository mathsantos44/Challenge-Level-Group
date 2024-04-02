package com.fiap.app.models;

import com.fiap.app.models.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name="request")
@AttributeOverride(name = "id", column = @Column(name = "requestId"))
public class Request extends BaseEntity {

    /*
    este atributo será mais bem elaborado no futuro, a ideia é que se acesse estes requisitos para poder
    escolher os melhores produtos de acordo com as especificações, há um modelo prático usando Scanner
    na classe Main
    */

    private String r_product_name;
    private int quantity;
    private Double price;
    private List<String> requests;

    @OneToMany(mappedBy = "request")
    private List<Product> productList;

    @ManyToOne
    @JoinColumn(name="clientId")
    private Client client;
}

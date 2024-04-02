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
@Table(name="supplier")
@AttributeOverride(name = "id", column = @Column(name = "supplierId"))
public class Supplier extends BaseEntity {

    private String supplierName;
    private String supplierEmail;
    private String supplierAdress;
    private Long supplierContact;
    private String supplierCompany;


    @OneToMany(mappedBy = "supplier")
    private List<Product> productList;
}

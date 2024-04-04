package com.fiap.app.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private String supplierAddress;
    private Long supplierContact;
    private String supplierCompany;


    @OneToMany(mappedBy = "supplier")
    @JsonIgnore
    private List<Product> productList;
}

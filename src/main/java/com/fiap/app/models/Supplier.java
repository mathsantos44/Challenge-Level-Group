package com.fiap.app.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class Supplier{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;
    private String supplierName;
    private String supplierEmail;
    private String supplierAddress;
    private Long supplierContact;
    private String supplierCompany;


    @OneToMany(mappedBy = "supplier")
    @JsonIgnore
    private List<Product> productList;

    @OneToMany(mappedBy = "supplier", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Order> orders;

}

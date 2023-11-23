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
@AttributeOverride(name = "id", column = @Column(name = "supplier_id"))
public class Supplier extends BaseEntity {

    private String supplier_name;
    private String supplier_email;
    private String supplier_adress;
    private Long supplier_contact;
    private String supplier_company;


    @OneToMany(mappedBy = "supplier")
    private List<Product> productList;
}

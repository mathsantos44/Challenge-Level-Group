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
@Table(name="client")
@AttributeOverride(name = "id", column = @Column(name = "clientId"))
public class Client extends BaseEntity {
    private String clientName;
    private String clientEmail;
    private String clientAdress;
    private Long clientContact;
    private String clientCompany;


}

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
@AttributeOverride(name = "id", column = @Column(name = "client_id"))
public class Client extends BaseEntity {
    private String client_name;
    private String client_email;
    private String client_adress;
    private Long client_contact;
    private String client_company;

    @OneToMany(mappedBy = "client")
    private List<Request> requestList;
}

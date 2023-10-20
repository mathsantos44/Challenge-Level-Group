package org.example.models;

import jakarta.persistence.*;
import lombok.*;
import org.example.models.base.BaseEntity;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name="cliente")
@AttributeOverride(name = "id", column = @Column(name = "cliente_id"))
public class Cliente extends BaseEntity {
    private String cliente_nome;
    private String cliente_email;
    private String cliente_endereco;
    private Long cliente_contato;
    private String cliente_empresa;

    @OneToMany(mappedBy = "cliente")
    private List<Requisicao> requisicaoList;
}

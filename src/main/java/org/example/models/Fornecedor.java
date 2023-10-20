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
@Table(name="fornecedor")
@AttributeOverride(name = "id", column = @Column(name = "fornecedor_id"))
public class Fornecedor extends BaseEntity {

    private String fornecedor_nome;
    private String fornecedor_email;
    private String fornecedor_endereco;
    private Long fornecedor_contato;
    private String fornecedor_empresa;


    @OneToMany(mappedBy = "fornecedor")
    private List<Produto> produtoList;
}

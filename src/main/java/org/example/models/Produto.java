package org.example.models;

import jakarta.persistence.*;
import lombok.*;
import org.example.models.base.BaseEntity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name="produto")
@AttributeOverride(name = "id", column = @Column(name = "produto_id"))
public class Produto extends BaseEntity {

    private String produto_nome;
    private String produto_tipo;
    private Float produto_preco;
    private Integer produto_quantidade;

    @ManyToOne
    @JoinColumn(name="fornecedor_id")
    private Fornecedor fornecedor;

    @ManyToOne
    @JoinColumn(name="requisicao_id")
    private Requisicao requisicao;
}

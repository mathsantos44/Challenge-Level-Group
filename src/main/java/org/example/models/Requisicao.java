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
@Table(name="requisicao")
@AttributeOverride(name = "id", column = @Column(name = "requisicao_id"))
public class Requisicao extends BaseEntity {

    /*
    este atributo será mais bem elaborado no futuro, a ideia é que se acesse estes requisitos para poder
    escolher os melhores produtos de acordo com as especificações, há um modelo prático usando Scanner
    na classe Main
    */

    private List<String> requisitos;

    @OneToMany(mappedBy = "requisicao")
    private List<Produto> produtoList;

    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;
}

package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//O Entity transforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
@Data //Lombok criando automaticamente os getters e setters
@NoArgsConstructor //Lombok criando construtor sem argumentos
@AllArgsConstructor //Lombok criando construtor com todos os argumentos
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    @ManyToMany
    @JoinColumn(name = "missoes_id") //Foreign key ou chave estrangeira
    private MissoesModel missoes;
}

package br.com.pedrorenan.design_patters_spring_project.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @ManyToOne
    private Endereco endereco;

}

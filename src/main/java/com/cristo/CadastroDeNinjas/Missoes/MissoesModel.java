package com.cristo.CadastroDeNinjas.Missoes;

import com.cristo.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    private NinjaModel ninja;
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}

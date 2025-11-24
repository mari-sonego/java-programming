package br.ifsp.edu.dsw3.anagrama.model.domain;

import java.io.Serializable;

import lombok.*;  // getters e setters
import jakarta.persistence.*; // o resto dos @

@Getter
@Setter
@Entity(name = "niveis")
public class Nivel implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private Integer tentativa;

    public Nivel() {
    }

    public Nivel(String tipo, Integer tentativa) {
        this.tipo = tipo;
        this.tentativa = tentativa;
    }


}


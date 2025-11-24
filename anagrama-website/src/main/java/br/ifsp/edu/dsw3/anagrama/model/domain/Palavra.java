package br.ifsp.edu.dsw3.anagrama.model.domain;

import java.io.Serializable;

import lombok.*;  // getters e setters
import jakarta.persistence.*; // o resto dos @

@Getter
@Setter
@Entity(name = "palavras")
public class Palavra implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String palavra;

    @Column(nullable = false)
    private Integer pontuacao;

    @Column(nullable = false)
    private Tema tema;

    public Palavra(String palavra, Integer pontuacao, Tema tema) {
        this.palavra = palavra;
        this.pontuacao = pontuacao;
        this.tema = tema;
    }

    public Palavra() {
    }
}

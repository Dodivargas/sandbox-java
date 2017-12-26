package br.com.dodivargas.modelo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Desenvolvedor{

    private String nome;
    private String dataDeNascimento;
    private String nivel;
    private Integer id;

    public Desenvolvedor(String nome, String dataDeNascimento, String nivel, Integer id) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.nivel = nivel;
        this.id = id;
    }

    public Desenvolvedor(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
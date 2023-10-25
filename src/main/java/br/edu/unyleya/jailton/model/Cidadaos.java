package br.edu.unyleya.jailton.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
public class Cidadaos extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long id;

    @Column(name = "cpf", nullable = true)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String cpf;
    @Column(name = "nome", nullable = true)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String nome;
    @Column(name = "endereco", nullable = true)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String endereco;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Column(name = "sexo", nullable = true)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String sexo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cidadaos(Long id, String cpf, String nome, String endereco, String sexo) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
    }

    public Cidadaos() {
    }
}

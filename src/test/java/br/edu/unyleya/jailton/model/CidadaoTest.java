package br.edu.unyleya.jailton.model;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@QuarkusTest
public class CidadaoTest {

    @Test
    void getCpf() {
        Cidadao cidadao = new Cidadao();
        cidadao.setCpf("1234567890");
        cidadao.setEndereco("qwertyuiop");
        cidadao.setNome("asdfghjklç");
        cidadao.setSexo("zxcvbnm");
        assertEquals(cidadao.getCpf(), "1234567890");
    }

    @Test
    void setCpf() {
    }

    @Test
    void getNome() {
        Cidadao cidadao = new Cidadao();
        cidadao.setCpf("1234567890");
        cidadao.setEndereco("qwertyuiop");
        cidadao.setNome("asdfghjklç");
        cidadao.setSexo("zxcvbnm");
        assertEquals(cidadao.getNome(), "asdfghjklç");
    }

    @Test
    void setNome() {
    }

    @Test
    void getEndereco() {
        Cidadao cidadao = new Cidadao();
        cidadao.setCpf("1234567890");
        cidadao.setEndereco("qwertyuiop");
        cidadao.setNome("asdfghjklç");
        cidadao.setSexo("zxcvbnm");
        assertEquals(cidadao.getEndereco(), "qwertyuiop");
    }

    @Test
    void setEndereco() {
    }

    @Test
    void getSexo() {
        Cidadao cidadao = new Cidadao();
        cidadao.setCpf("1234567890");
        cidadao.setEndereco("qwertyuiop");
        cidadao.setNome("asdfghjklç");
        cidadao.setSexo("zxcvbnm");
        assertEquals(cidadao.getSexo(), "zxcvbnm");
    }

    @Test
    void setSexo() {
    }
}
package br.edu.unyleya.jailton.model;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class CidadaosTest {

    @Test
    void setS() {
        Cidadaos cidadaos = new Cidadaos();
        cidadaos.setId(10l);
        cidadaos.setCpf("12345678901");
        cidadaos.setNome("12345678901");
        cidadaos.setEndereco("12345678901");
        cidadaos.setSexo("12345678901");
    }

    @Test
    void setCpf() {
        Cidadaos cidadaos = new Cidadaos();
        cidadaos.setCpf("12345678901");
    }

    @Test
    void setNome() {
    }

    @Test
    void setEndereco() {
    }

    @Test
    void setSexo() {
    }
}
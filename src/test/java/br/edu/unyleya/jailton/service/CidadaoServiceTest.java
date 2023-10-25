package br.edu.unyleya.jailton.service;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
public class CidadaoServiceTest {
    @Test
    public void construt() {
        CidadaoService cidadaoService = new CidadaoService();
    }
}
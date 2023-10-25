package br.edu.unyleya.jailton.resource;

import br.edu.unyleya.jailton.model.Cidadao;
import br.edu.unyleya.jailton.model.Cidadaos;
import com.google.gson.Gson;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.*;
@QuarkusTest
public class CidadaoResourceTest {
    static List<Cidadaos> cidadaos;
    static Cidadaos cidadaos01;
    @BeforeEach
    void beforeAll() {
        cidadaos01 = new Cidadaos(1L, "12345678901", "João da Silva", "Rua A, 123", "Masculino");
        Cidadaos cidadaos02 = new Cidadaos(2L, "98765432109", "Maria Oliveira", "Avenida B, 456", "Feminino");
        Cidadaos cidadaos03 = new Cidadaos(3L, "45678912302", "José Pereira", "Travessa C, 789", "Masculino");
        Cidadaos cidadaos04 = new Cidadaos(4L, "32109876503", "Ana Santos", "Rua D, 567", "Feminino");
        Cidadaos cidadaos05 = new Cidadaos(5L, "65432109804", "Carlos Souza", "Avenida E, 234", "Masculino");

        cidadaos = List.of(cidadaos01, cidadaos02, cidadaos03, cidadaos04, cidadaos05);
    }

    @Test
    public void obterTodosCidadao() {
        given()
                .when().get("/cidadao")
                .then()
                .statusCode(200)
                .body(is(new Gson().toJson(cidadaos)));
    }

    @Test
    public void obterCidadao() {
        given()
                .when().get("/cidadao/1")
                .then()
                .statusCode(200)
                .body(is(new Gson().toJson(cidadaos01)));
    }

    @Test
    public void criarCidadao() {
        given()
                .contentType(ContentType.JSON)
                .body("{\"cpf\": \"98765432100\", \"nome\": \"João da Silva\", \"endereco\": \"Rua A, 123\", \"sexo\": \"M\"}")
                .when().post("/cidadao")
                .then()
                .statusCode(200);
    }

    @Test
    public void atualizarCidadao() {
        given()
                .contentType(ContentType.JSON)
                .body("{\"cpf\": \"12345678901\", \"nome\": \"João da Silva\", \"endereco\": \"Rua A, 123\", \"sexo\": \"Masculino\"}")
                .when().put("/cidadao/{id}", 1)
                .then()
                .statusCode(200);

        given()
                .contentType(ContentType.JSON)
                .body("{\"cpf\": \"12345678901\", \"nome\": \"João da Silva\", \"endereco\": \"Rua A, 123\", \"sexo\": \"Masculino\"}")
                .when().put("/cidadao/{id}", 10)
                .then()
                .statusCode(204);
    }

    @Test
    public void deletarCidadao() {
        given()
                .when().delete("/cidadao/11")
                .then()
                .statusCode(200)
                .body(is(new Gson().toJson(false)));
    }
}
package br.edu.unyleya.jailton.resource;

import br.edu.unyleya.jailton.model.Cidadao;
import br.edu.unyleya.jailton.model.Cidadaos;
import br.edu.unyleya.jailton.repository.CidadaoRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.models.media.Schema;

import java.util.List;

@Path("/cidadao")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class CidadaoResource {
    @Inject
    CidadaoRepository cidadaoRepository;
    @GET
    @Operation(summary = "Listar todos os Cidadões",
            description = "Retorna todos os cidadões cadastrado no banco de dados")
    @APIResponse(
            responseCode = "200",
            description = "Cidadoes")
    public List<Cidadaos> obterTodosCidadao() {
        return cidadaoRepository.obterTodosCidadao();
    }

    @GET
    @Path("/{id}")
    @Operation(summary = "Listar Cidadões Por ID",
            description = "Retorna um cidadão de acordo com id solicitado")
    @APIResponse(
            responseCode = "200",
            description = "Cidadao")
    public Cidadaos obterCidadao(@PathParam("id") Long id) {
        return cidadaoRepository.obterCidadaoPorId(id);
    }

    @POST
    @Operation(summary = "Cadastra um novo Cidadao",
            description = "Retorna o cidadão que foi cadastrado")
    @APIResponse(
            responseCode = "200",
            description = "InsertCidadao")
    public Cidadaos criarCidadao(@Valid Cidadao cidadao) {
        Cidadaos cidadaos = new Cidadaos();
        cidadaos.setCpf(cidadao.getCpf());
        cidadaos.setEndereco(cidadao.getEndereco());
        cidadaos.setNome(cidadao.getNome());
        cidadaos.setSexo(cidadao.getSexo());
        return cidadaoRepository.criarCidadao(cidadaos);
    }

    @PUT
    @Path("/{id}")
    @Operation(summary = "Ataliza o Cidadao selecionado",
            description = "Retorna o cidadão com os novos valores atualizados")
    @APIResponse(
            responseCode = "200",
            description = "UpdateCidadao")
    public Cidadaos atualizarCidadao(@PathParam("id") Long id, @Valid Cidadao cidadao) {
        Cidadaos cidadaos = new Cidadaos();
        cidadaos.setCpf(cidadao.getCpf());
        cidadaos.setEndereco(cidadao.getEndereco());
        cidadaos.setNome(cidadao.getNome());
        cidadaos.setSexo(cidadao.getSexo());
        return cidadaoRepository.atualizarCidadao(id, cidadaos);
    }

    @DELETE
    @Path("/{id}")
    @Operation(summary = "Exclui Cidadões Por ID",
            description = "Retorna verdadeiro caso consiga excluir o cidadao ou falso caso contrario")
    @APIResponse(
            responseCode = "200",
            description = "DeleteCidadao")
    public boolean deletarCidadao(@PathParam("id") Long id) {
        return cidadaoRepository.deletarCidadao(id);
    }
}

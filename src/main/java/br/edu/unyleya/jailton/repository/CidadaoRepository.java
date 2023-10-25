package br.edu.unyleya.jailton.repository;

import br.edu.unyleya.jailton.model.Cidadaos;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class CidadaoRepository implements PanacheRepository<Cidadaos> {

    @Transactional
    public Cidadaos criarCidadao(Cidadaos cidadao) {
        cidadao.persist(cidadao);
        return cidadao;
    }

    public Cidadaos obterCidadaoPorId(Long id) {
        return Cidadaos.findById(id);
    }

    public List<Cidadaos> obterTodosCidadao() {
        return Cidadaos.listAll();
    }

    @Transactional
    public Cidadaos atualizarCidadao(Long id, Cidadaos cidadao) {
        Cidadaos entity = Cidadaos.findById(id);
        if (entity != null) {
            entity.setCpf(cidadao.getCpf());
            entity.setNome(cidadao.getNome());
            entity.setEndereco(cidadao.getEndereco());
            entity.setSexo(cidadao.getSexo());
        }
        return entity;
    }

    @Transactional
    public boolean deletarCidadao(Long id) {
        return Cidadaos.deleteById(id);
    }
}

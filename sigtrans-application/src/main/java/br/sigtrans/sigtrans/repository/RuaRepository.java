package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Rua;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RuaRepository extends GumgaCrudRepository<Rua, String> {
    @Query("from Rua as c where c.nome like:nome")
    List<Rua> buscaRuaPorNome(@Param("nome") String nome);
}
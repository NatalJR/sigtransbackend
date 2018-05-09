package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Estado;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository extends GumgaCrudRepository<Estado, String> {

    @Query("from Estado as c where c.nome like:nome")
    List<Estado> buscaEstadoPorNome(@Param("nome") String nome);

}
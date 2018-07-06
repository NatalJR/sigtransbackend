package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Municipio;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MunicipioRepository extends GumgaCrudRepository<Municipio, String> {
    @Query("from Municipio as c where c.nome like:nome")
    List<Municipio> buscaMunicipioPorNome(@Param("nome") String nome);
}
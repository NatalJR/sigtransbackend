package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Bairro;
import io.gumga.domain.repository.GumgaCrudRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BairroRepository extends GumgaCrudRepository<Bairro, String> {

    //Tras somente os bairros da cidade especificada por MunicipioID
    @Query("from Bairro as c where c.nome like:nome and c.municipio.id like:municipioId")
    List<Bairro> buscaBairroPorNome(@Param("nome") String nome, @Param("municipioId") String municipioId);

}

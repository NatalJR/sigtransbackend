package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Ocorrencia.Bairro;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BairroRepository extends GumgaCrudRepository<Bairro, String> {

    //Tras somente os bairros da cidade especificada por MunicipioID
    @Query("from Bairro as c where c.municipio.id like:municipioId")
    List<Bairro> buscaBairroPorNome(@Param("municipioId") String municipioId);

}

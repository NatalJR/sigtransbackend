package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Obitos.FatorCondutaGravidadeAno;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FatorCondutaGravidadeAnoRepository extends GumgaCrudRepository<FatorCondutaGravidadeAno, String> {
    @Query("from FatorCondutaGravidadeAno as c where c.ano.ano like:ano group by c.id")
    FatorCondutaGravidadeAno buscaFCGPorAno(@Param("ano") String ano);
}

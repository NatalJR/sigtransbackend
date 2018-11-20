package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Ocorrencia.DadosEstatisticos;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosEstatisticosRepository extends GumgaCrudRepository<DadosEstatisticos, String> {
//    @Query("from dadosestatisticos as c where c.id like:id")
//    List<DadosEstatisticos> buscaDadosEstatisticos(@org.springframework.data.repository.query.Param("id") String id);
}

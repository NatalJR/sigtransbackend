package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.DadosEstatisticos;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosEstatisticosRepository extends GumgaCrudRepository<DadosEstatisticos, String> {
}

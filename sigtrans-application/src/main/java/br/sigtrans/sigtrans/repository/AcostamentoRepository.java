package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Acostamento;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcostamentoRepository extends GumgaCrudRepository<Acostamento, String> {
}

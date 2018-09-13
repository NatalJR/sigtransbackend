package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Obitos.CondutaRisco;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondutaRiscoRepository extends GumgaCrudRepository<CondutaRisco, String> {
}

package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Obitos.CondutasRisco;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondutasRiscoRepository extends GumgaCrudRepository<CondutasRisco, String> {
}

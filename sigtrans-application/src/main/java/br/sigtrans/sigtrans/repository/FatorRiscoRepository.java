package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Obitos.FatorRisco;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FatorRiscoRepository extends GumgaCrudRepository<FatorRisco, String> {
}

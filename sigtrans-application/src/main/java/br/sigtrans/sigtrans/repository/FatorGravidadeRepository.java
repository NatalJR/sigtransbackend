package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Obitos.FatorGravidade;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FatorGravidadeRepository extends GumgaCrudRepository<FatorGravidade, String> {
}

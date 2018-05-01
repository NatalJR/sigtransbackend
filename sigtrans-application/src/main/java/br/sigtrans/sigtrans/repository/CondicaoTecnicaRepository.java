package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.CondicaoTecnica;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicaoTecnicaRepository extends GumgaCrudRepository<CondicaoTecnica, String> {
}

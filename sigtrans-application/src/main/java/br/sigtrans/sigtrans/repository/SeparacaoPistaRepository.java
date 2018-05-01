package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.SeparacaoPista;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeparacaoPistaRepository extends GumgaCrudRepository<SeparacaoPista, String> {
}

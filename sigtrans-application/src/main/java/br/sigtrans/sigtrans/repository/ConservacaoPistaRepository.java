package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.ConservacaoPista;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConservacaoPistaRepository extends GumgaCrudRepository<ConservacaoPista, String> {
}

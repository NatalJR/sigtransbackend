package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.ConservacaoVia;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConservacaoViaRepository extends GumgaCrudRepository<ConservacaoVia, String> {
}

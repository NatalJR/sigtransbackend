package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Ocorrencia.CondicaoSeguranca;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicaoSegurancaRepository extends GumgaCrudRepository<CondicaoSeguranca, String> {
}

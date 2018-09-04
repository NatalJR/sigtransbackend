package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Ocorrencia.Vitima;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VitimaRepository extends GumgaCrudRepository<Vitima, String> {
}

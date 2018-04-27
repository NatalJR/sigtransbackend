package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Semaforo;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemaforoRepository extends GumgaCrudRepository<Semaforo, String> {
}

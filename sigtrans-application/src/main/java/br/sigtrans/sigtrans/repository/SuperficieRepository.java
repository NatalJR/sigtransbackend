package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Superficie;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperficieRepository extends GumgaCrudRepository<Superficie, String> {
}

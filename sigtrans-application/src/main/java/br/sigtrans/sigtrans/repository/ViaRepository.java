package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Via;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViaRepository extends GumgaCrudRepository<Via, String> {
}

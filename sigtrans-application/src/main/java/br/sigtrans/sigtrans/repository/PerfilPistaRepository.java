package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.PerfilPista;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilPistaRepository extends GumgaCrudRepository<PerfilPista, String> {
}

package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Parceiro;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParceiroRepository extends GumgaCrudRepository<Parceiro, String> {
}

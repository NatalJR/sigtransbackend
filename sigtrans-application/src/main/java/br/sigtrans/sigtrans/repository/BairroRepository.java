package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Bairro;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BairroRepository extends GumgaCrudRepository<Bairro, String> {
}

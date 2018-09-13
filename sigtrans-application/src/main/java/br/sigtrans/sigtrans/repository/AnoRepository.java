package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Ano;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnoRepository extends GumgaCrudRepository<Ano, String> {
}

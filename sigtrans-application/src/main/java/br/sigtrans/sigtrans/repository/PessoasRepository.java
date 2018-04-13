package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Pessoas;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoasRepository extends GumgaCrudRepository<Pessoas, String> {
}

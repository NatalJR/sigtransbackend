package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Ocorrencia.Lesoes;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LesoesRepository extends GumgaCrudRepository<Lesoes, String> {
}

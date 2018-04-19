package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Sinalizacao;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinalizacaoRepository extends GumgaCrudRepository<Sinalizacao, String> {
}

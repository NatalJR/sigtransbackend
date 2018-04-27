package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Pavimentacao;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PavimentacaoRepository extends GumgaCrudRepository<Pavimentacao, String> {
}

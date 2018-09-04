package br.sigtrans.sigtrans.repository;


import br.sigtrans.sigtrans.domain.Obitos.Especificacao;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecificacaoRepository extends GumgaCrudRepository<Especificacao, String> {
}

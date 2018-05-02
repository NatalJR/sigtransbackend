package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Profissao;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfissaoRepository extends GumgaCrudRepository<Profissao, String> {
}

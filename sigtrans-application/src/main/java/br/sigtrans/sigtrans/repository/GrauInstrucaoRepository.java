package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Ocorrencia.GrauInstrucao;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrauInstrucaoRepository extends GumgaCrudRepository<GrauInstrucao, String> {
}

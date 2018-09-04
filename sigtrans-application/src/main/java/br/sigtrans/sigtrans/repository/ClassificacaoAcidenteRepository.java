package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Ocorrencia.ClassificacaoAcidente;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificacaoAcidenteRepository extends GumgaCrudRepository<ClassificacaoAcidente, String> {
}
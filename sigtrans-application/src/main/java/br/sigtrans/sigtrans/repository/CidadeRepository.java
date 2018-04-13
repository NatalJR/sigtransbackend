package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Cidade;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends GumgaCrudRepository<Cidade, String> {
}
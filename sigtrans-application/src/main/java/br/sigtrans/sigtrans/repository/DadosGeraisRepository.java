package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.DadosGerais;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosGeraisRepository extends GumgaCrudRepository<DadosGerais, String> {
}

package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Obitos.FatoresGravidade;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FatoresGravidadeRepository extends GumgaCrudRepository<FatoresGravidade, String> {
}

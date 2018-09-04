package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Obitos.FatoresRisco;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FatoresRiscoRepository extends GumgaCrudRepository<FatoresRisco, String> {
}

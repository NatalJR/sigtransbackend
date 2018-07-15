package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.CondutasRisco;
import io.gumga.domain.GumgaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondutasRiscoRepository extends GumgaRepository<CondutasRisco, String> {
}

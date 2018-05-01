package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.AcidenteTrabalho;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcidenteTrabalhoRepository extends GumgaCrudRepository<AcidenteTrabalho, String> {
}

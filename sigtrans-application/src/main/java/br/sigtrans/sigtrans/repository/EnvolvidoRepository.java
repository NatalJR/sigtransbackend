package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Envolvido;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvolvidoRepository extends GumgaCrudRepository<Envolvido, String> {
}

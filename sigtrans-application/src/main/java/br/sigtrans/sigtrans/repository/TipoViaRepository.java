package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.TipoVia;
import io.gumga.domain.GumgaRepository;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoViaRepository extends GumgaCrudRepository<TipoVia, String> {
}

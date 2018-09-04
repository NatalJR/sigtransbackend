package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Ocorrencia.TipoAcidente;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoAcidenteRepository extends GumgaCrudRepository<TipoAcidente, String> {
}


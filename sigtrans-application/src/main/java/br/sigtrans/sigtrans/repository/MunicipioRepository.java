package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Municipio;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioRepository extends GumgaCrudRepository<Municipio, String> {
}
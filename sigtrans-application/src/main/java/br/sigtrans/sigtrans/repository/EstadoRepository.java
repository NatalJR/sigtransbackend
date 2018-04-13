package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Estado;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends GumgaCrudRepository<Estado, String> {
}
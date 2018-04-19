package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Veiculos;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculosRepository extends GumgaCrudRepository<Veiculos, String> {
}

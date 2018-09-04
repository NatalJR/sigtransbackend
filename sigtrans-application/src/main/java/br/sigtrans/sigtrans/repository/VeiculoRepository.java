package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Veiculo.Veiculo;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends GumgaCrudRepository<Veiculo, String> {
}

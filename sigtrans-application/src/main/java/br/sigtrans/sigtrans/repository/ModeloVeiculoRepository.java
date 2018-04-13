package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.ModeloVeiculo;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloVeiculoRepository extends GumgaCrudRepository<ModeloVeiculo, String> {
}

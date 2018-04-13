package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.CategoriaVeiculo;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaVeiculoRepository extends GumgaCrudRepository<CategoriaVeiculo, String> {
}

package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.MarcaVeiculo;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaVeiculoRepository extends GumgaCrudRepository<MarcaVeiculo, String> {
}

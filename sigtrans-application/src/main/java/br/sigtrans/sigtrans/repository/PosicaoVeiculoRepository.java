package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Ocorrencia.PosicaoVeiculo;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosicaoVeiculoRepository extends GumgaCrudRepository<PosicaoVeiculo, String> {
}

package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Ocorrencia.EquipamentoControleTrafego;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipamentoControleTrafegoRepository extends GumgaCrudRepository<EquipamentoControleTrafego, String> {
}

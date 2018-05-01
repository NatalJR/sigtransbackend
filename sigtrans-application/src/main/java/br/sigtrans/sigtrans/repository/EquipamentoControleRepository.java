package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.EquipamentoControle;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipamentoControleRepository extends GumgaCrudRepository<EquipamentoControle, String> {
}

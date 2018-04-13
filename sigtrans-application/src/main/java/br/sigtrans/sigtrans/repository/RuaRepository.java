package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Rua;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuaRepository extends GumgaCrudRepository<Rua, String> {
}
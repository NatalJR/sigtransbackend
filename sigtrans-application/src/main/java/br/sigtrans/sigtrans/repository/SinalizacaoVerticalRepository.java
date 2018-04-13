package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.SinalizacaoVertical;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinalizacaoVerticalRepository extends GumgaCrudRepository<SinalizacaoVertical, String> {
}

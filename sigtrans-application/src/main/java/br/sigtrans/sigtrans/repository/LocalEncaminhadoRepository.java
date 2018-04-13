package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.LocalEncaminhado;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalEncaminhadoRepository extends GumgaCrudRepository <LocalEncaminhado, String> {
}

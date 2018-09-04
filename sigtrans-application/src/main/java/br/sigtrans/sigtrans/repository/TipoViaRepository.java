package br.sigtrans.sigtrans.repository;


import br.sigtrans.sigtrans.domain.Via.TipoVia;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoViaRepository extends GumgaCrudRepository<TipoVia, String> {
}

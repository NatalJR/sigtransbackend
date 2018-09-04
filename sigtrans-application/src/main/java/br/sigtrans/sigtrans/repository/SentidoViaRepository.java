package br.sigtrans.sigtrans.repository;


import br.sigtrans.sigtrans.domain.Via.SentidoVia;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SentidoViaRepository extends GumgaCrudRepository<SentidoVia, String> {
}

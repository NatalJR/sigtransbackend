package br.sigtrans.sigtrans.repository;


import br.sigtrans.sigtrans.domain.Via.SinaisPneus;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinaisPneusRepository extends GumgaCrudRepository<SinaisPneus, String> {
}

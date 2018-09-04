package br.sigtrans.sigtrans.repository;


import br.sigtrans.sigtrans.domain.Via.Visibilidade;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisibilidadeRepository extends GumgaCrudRepository<Visibilidade, String> {
}

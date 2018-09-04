package br.sigtrans.sigtrans.repository;


import br.sigtrans.sigtrans.domain.Via.CondicoesClimaticas;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicoesClimaticasRepository extends GumgaCrudRepository<CondicoesClimaticas, String> {
}
package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Obitos.UsuarioContributivo;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioContributivoRepository extends GumgaCrudRepository<UsuarioContributivo, String> {

}

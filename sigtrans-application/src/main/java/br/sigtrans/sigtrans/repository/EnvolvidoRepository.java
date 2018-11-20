package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Ocorrencia.Envolvido;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvolvidoRepository extends GumgaCrudRepository<Envolvido, String> {
//    @Query("from envolvido as c where c.id like:id")
//    List<Envolvido> buscaEnvolvido(@Param("id") String id);
}

package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Ocorrencia.Parceiro;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParceiroRepository extends GumgaCrudRepository<Parceiro, String> {
//    @Query("from parceiro as c where c.id like:id")
//    List<Parceiro> buscaParceiro(@Param("id") String id);
}

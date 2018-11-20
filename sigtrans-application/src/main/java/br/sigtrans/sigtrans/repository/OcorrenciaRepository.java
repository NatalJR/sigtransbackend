package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Ocorrencia.Ocorrencia;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OcorrenciaRepository extends GumgaCrudRepository<Ocorrencia, String> {

    @Query("from Ocorrencia as c where c.dadosEstatisticos.classificacaoAcidente.nome like:nome")
    List<Ocorrencia> buscaObito(@Param("nome") String nome);


}

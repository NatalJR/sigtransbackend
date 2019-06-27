package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Ocorrencia.Ocorrencia;
import br.sigtrans.sigtrans.domain.Ocorrencia.Vitima;
import br.sigtrans.sigtrans.repository.OcorrenciaRepository;
import io.gumga.application.GumgaService;
import io.gumga.core.QueryObject;
import io.gumga.core.gquery.ComparisonOperator;
import io.gumga.core.gquery.Criteria;
import io.gumga.core.gquery.GQuery;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class OcorrenciaService extends GumgaService<Ocorrencia, String> {
    @Autowired
    public OcorrenciaService(GumgaCrudRepository<Ocorrencia, String> repository) {
        super(repository);
    }


    public List<Ocorrencia> buscarObitos(Integer pageSize) {
        String nome = "Óbito";
//        GumgaOi oi = new GumgaOi((GumgaThreadScope.organizationCode.get()+"%"));
        List<Ocorrencia> obitos = ((OcorrenciaRepository) repository).buscaObito(nome + "%");

        GQuery gQuery = new GQuery(new Criteria("obj.dadosEstatisticos.classificacaoAcidente.nome", ComparisonOperator.EQUAL, nome));

        QueryObject queryObject = new QueryObject();
        queryObject.setgQuery(gQuery);
        if (pageSize > 0) {
            queryObject.setPageSize(pageSize);
        } else {
            queryObject.setPageSize(10000);
        }

        return repository.findAll(gQuery);

    }

    public List<Ocorrencia> buscarOcorrencias() {
        return ((OcorrenciaRepository) repository).buscaOcorrencias();
    }

    public Set<Ocorrencia> buscarObitosPorGrauDeLesao() {
        List<Ocorrencia> Ocorrencias = ((OcorrenciaRepository) repository).buscaOcorrencias();
        Set<Ocorrencia> response = new HashSet<>();
        for (Ocorrencia ocorrencia : Ocorrencias) {
            Set<Vitima> Vitimas = ocorrencia.getEnvolvidos();
            for (Vitima vitima : Vitimas) {
                if (vitima.getLesao().getNome().contains("Óbito")) {
                    response.add(ocorrencia);
                    break;
                }
            }
        }
        return response;
    }

}

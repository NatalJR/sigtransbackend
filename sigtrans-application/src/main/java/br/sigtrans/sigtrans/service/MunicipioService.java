package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Ocorrencia.Municipio;
import br.sigtrans.sigtrans.repository.MunicipioRepository;
import io.gumga.application.GumgaService;
import io.gumga.core.QueryObject;
import io.gumga.core.gquery.ComparisonOperator;
import io.gumga.core.gquery.Criteria;
import io.gumga.core.gquery.GQuery;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicipioService extends GumgaService<Municipio, String> {

    @Autowired
    public MunicipioService(GumgaCrudRepository<Municipio, String> repository) {
        super(repository);
    }

    public List<Municipio> buscaMunicipioPorNomeGQuery(String nome) {
//        GumgaOi oi = new GumgaOi((GumgaThreadScope.organizationCode.get()+"%"));
        List<Municipio> municipio = ((MunicipioRepository) repository).buscaMunicipioPorNome(nome + "%");

        GQuery gQuery = new GQuery(new Criteria("obj.nome", ComparisonOperator.CONTAINS, nome));

        QueryObject queryObject = new QueryObject();
        queryObject.setgQuery(gQuery);
        queryObject.setPageSize(10);

        return repository.findAll(gQuery);

    }
}
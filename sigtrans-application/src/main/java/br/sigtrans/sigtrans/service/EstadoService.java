package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Ocorrencia.Estado;
import br.sigtrans.sigtrans.repository.EstadoRepository;
import io.gumga.application.GumgaService;
import io.gumga.core.QueryObject;
import io.gumga.core.gquery.ComparisonOperator;
import io.gumga.core.gquery.Criteria;
import io.gumga.core.gquery.GQuery;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//import io.gumga.domain.domains.GumgaOi;
//import io.gumga.core.GumgaThreadScope;

@Service
public class EstadoService extends GumgaService<Estado, String> {

    @Autowired
    public EstadoService(GumgaCrudRepository<Estado, String> repository) {
        super(repository);
    }

    public List<Estado> buscarEstadoPorNomeGQuery(String nome) {
//        GumgaOi oi = new        GumgaOi((GumgaThreadScope.organizationCode.get()+"%"));
        List<Estado> estado = ((EstadoRepository) repository).buscaEstadoPorNome(nome + "%");

        GQuery gQuery = new GQuery(new Criteria("obj.nome", ComparisonOperator.EQUAL, nome));

        QueryObject queryObject = new QueryObject();
        queryObject.setgQuery(gQuery);
        queryObject.setPageSize(10);

        return repository.findAll(gQuery);

    }
}
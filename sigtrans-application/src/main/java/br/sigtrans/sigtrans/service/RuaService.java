package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Ocorrencia.Rua;
import br.sigtrans.sigtrans.repository.RuaRepository;
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
public class RuaService extends GumgaService<Rua, String> {

    @Autowired
    public RuaService(GumgaCrudRepository<Rua, String> repository) {
        super(repository);
    }

    public List<Rua> buscaRuaPorNomeGQuery(String nome) {
//        GumgaOi oi = new GumgaOi((GumgaThreadScope.organizationCode.get()+"%"));
        List<Rua> ruas = ((RuaRepository) repository).buscaRuaPorNome(nome + "%");

        GQuery gQuery = new GQuery(new Criteria("obj.nome", ComparisonOperator.CONTAINS, nome));

        QueryObject queryObject = new QueryObject();
        queryObject.setgQuery(gQuery);
        queryObject.setPageSize(10);

        return repository.findAll(gQuery);

    }
}
package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Ocorrencia.Parceiro;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParceiroService extends GumgaService<Parceiro, String> {
    @Autowired
    public ParceiroService(GumgaCrudRepository<Parceiro, String> repository) {
        super(repository);
    }

//    public List<Parceiro> buscaParceiroGQuery(String id) {
//
//        List<Parceiro> parceiro = ((ParceiroRepository) repository).buscaParceiro(id + "%");
//
//        GQuery gQuery = new GQuery(new Criteria("obj.id", ComparisonOperator.CONTAINS, id));
//
//        QueryObject queryObject = new QueryObject();
//        queryObject.setgQuery(gQuery);
//        queryObject.setPageSize(10);
//
//        return repository.findAll(gQuery);
//
//    }
}

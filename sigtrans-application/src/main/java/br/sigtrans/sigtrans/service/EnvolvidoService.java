package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Ocorrencia.Envolvido;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnvolvidoService extends GumgaService<Envolvido, String> {
    @Autowired
    public EnvolvidoService(GumgaCrudRepository<Envolvido, String> repository) {
        super(repository);
    }

//    public List<Envolvido> buscaEnvolvidoGQuery(String id) {
//        List<Envolvido> envolvidos = ((EnvolvidoRepository) repository).buscaEnvolvido(id + "%");
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

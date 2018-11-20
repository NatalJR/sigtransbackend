package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Ocorrencia.DadosEstatisticos;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadosEstatisticosService extends GumgaService<DadosEstatisticos, String> {
    @Autowired
    public DadosEstatisticosService(GumgaCrudRepository<DadosEstatisticos, String> repository) {
        super(repository);
    }

}
//
//    public List<DadosEstatisticos> buscaDadosEstatisticos(String id){
//        List<DadosEstatisticos> dadosEstatisticos = ((DadosEstatisticosRepository) repository).buscaDadosEstatisticos(id + "%");
//
//        GQuery gQuery = new GQuery(new Criteria("obj.id", ComparisonOperator.CONTAINS, id));
//
//        QueryObject queryObject = new QueryObject();
//        queryObject.setgQuery(gQuery);
//        queryObject.setPageSize(10);
//
//        return repository.findAll(gQuery);
//    }
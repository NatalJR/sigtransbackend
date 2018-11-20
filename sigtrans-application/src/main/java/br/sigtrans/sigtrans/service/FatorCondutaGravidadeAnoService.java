package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Obitos.FatorCondutaGravidadeAno;
import br.sigtrans.sigtrans.repository.FatorCondutaGravidadeAnoRepository;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FatorCondutaGravidadeAnoService extends GumgaService<FatorCondutaGravidadeAno, String> {

    @Autowired
    public FatorCondutaGravidadeAnoService(GumgaCrudRepository<FatorCondutaGravidadeAno, String> repository) {
        super(repository);
    }

    public FatorCondutaGravidadeAno buscarFCGAPorAnoGQuery(String ano) {
        FatorCondutaGravidadeAno FCGA = ((FatorCondutaGravidadeAnoRepository) repository).buscaFCGPorAno(ano + "%");
//        GumgaOi oi = new GumgaOi((GumgaThreadScope.organizationCode.get()+"%"));


//        GQuery gQuery = new GQuery(new Criteria("obj.ano.ano", ComparisonOperator.EQUAL, ano));
//
//        QueryObject queryObject = new QueryObject();
//        queryObject.setgQuery(gQuery);
//        queryObject.setPageSize(10);

        return FCGA;

    }

}

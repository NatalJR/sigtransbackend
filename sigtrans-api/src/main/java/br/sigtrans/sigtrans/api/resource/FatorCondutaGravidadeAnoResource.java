package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Obitos.FatorCondutaGravidadeAno;
import br.sigtrans.sigtrans.service.FatorCondutaGravidadeAnoService;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fatoresano")
public class FatorCondutaGravidadeAnoResource extends GumgaAPI<FatorCondutaGravidadeAno, String> {

    @Autowired
    public FatorCondutaGravidadeAnoResource(@Qualifier("fatorCondutaGravidadeAnoService") GumgaService<FatorCondutaGravidadeAno, String> service) {
        super(service);
    }

    @RequestMapping("/porano")
    public FatorCondutaGravidadeAno BuscarEstadoGQuery(@RequestParam String ano) {
        return ((FatorCondutaGravidadeAnoService) service).buscarFCGAPorAnoGQuery(ano);
    }

}

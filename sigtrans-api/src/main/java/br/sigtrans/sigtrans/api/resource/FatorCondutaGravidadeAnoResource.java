package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Obitos.FatorCondutaGravidadeAno;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fatorescondutagravidadeano")
public class FatorCondutaGravidadeAnoResource extends GumgaAPI<FatorCondutaGravidadeAno, String> {

    @Autowired
    public FatorCondutaGravidadeAnoResource(@Qualifier("fatorCondutaGravidadeAnoService") GumgaService<FatorCondutaGravidadeAno, String> service) {
        super(service);
    }

}

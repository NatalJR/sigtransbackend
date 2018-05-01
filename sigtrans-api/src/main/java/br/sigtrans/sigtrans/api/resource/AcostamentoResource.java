package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Acostamento;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acostamento")
public class AcostamentoResource extends GumgaAPI<Acostamento, String> {
    @Autowired
    public AcostamentoResource(@Qualifier("acostamentoService") GumgaService<Acostamento, String> service) {
        super(service);
    }
}

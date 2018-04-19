package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Veiculos;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculos")
public class VeiculosResource extends GumgaAPI<Veiculos, String> {
    @Autowired
    public VeiculosResource(@Qualifier("veiculosService") GumgaService<Veiculos, String> service) {
        super(service);
    }
}

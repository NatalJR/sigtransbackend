package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Veiculo;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculo")
public class VeiculoResource extends GumgaAPI<Veiculo, String> {
    @Autowired
    public VeiculoResource(@Qualifier("veiculoService") GumgaService<Veiculo, String> service) {
        super(service);
    }
}

package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Ocorrencia.Vitima;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vitima")
public class VitimaResource extends GumgaAPI<Vitima, String> {
    @Autowired
    public VitimaResource(@Qualifier("vitimaService") GumgaService<Vitima, String> service) {
        super(service);
    }
}

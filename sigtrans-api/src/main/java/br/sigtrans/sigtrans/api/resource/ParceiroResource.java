package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Ocorrencia.Parceiro;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parceiro")
public class ParceiroResource extends GumgaAPI<Parceiro, String> {
    @Autowired
    public ParceiroResource(@Qualifier("parceiroService") GumgaService<Parceiro, String> service) {
        super(service);
    }
}

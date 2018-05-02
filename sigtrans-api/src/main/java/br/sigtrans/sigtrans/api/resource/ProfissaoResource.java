package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Profissao;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profissao")
public class ProfissaoResource extends GumgaAPI<Profissao, String> {
    public ProfissaoResource(@Qualifier("profissaoService") GumgaService<Profissao, String> service) {
        super(service);
    }
}

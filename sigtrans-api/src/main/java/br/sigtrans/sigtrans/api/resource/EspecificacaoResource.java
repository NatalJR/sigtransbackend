package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Obitos.Especificacao;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/especificacao")
public class EspecificacaoResource extends GumgaAPI<Especificacao, String> {
    @Autowired
    public EspecificacaoResource(@Qualifier("especificacaoService") GumgaService<Especificacao, String> service) {
        super(service);
    }
}

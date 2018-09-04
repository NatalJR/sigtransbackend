package br.sigtrans.sigtrans.api.resource;


import br.sigtrans.sigtrans.domain.Via.ConservacaoVia;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conservacaovia")
public class ConservacaoViaResource extends GumgaAPI<ConservacaoVia, String> {
    @Autowired
    public ConservacaoViaResource(@Qualifier("conservacaoViaService") GumgaService<ConservacaoVia, String> service) {
        super(service);
    }

}

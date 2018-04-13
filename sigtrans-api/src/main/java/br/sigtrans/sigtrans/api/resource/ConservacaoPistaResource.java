package br.sigtrans.sigtrans.api.resource;


import br.sigtrans.sigtrans.domain.ConservacaoPista;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conservacaopista")
public class ConservacaoPistaResource extends GumgaAPI<ConservacaoPista, String> {
    @Autowired
    public ConservacaoPistaResource(@Qualifier("conservacaoPistaService") GumgaService<ConservacaoPista, String> service) {
        super(service);
    }

}

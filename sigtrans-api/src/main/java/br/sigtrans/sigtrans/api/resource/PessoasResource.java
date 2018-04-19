package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Pessoas;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
public class PessoasResource extends GumgaAPI<Pessoas, String> {
    @Autowired
    public PessoasResource(@Qualifier("pessoasService") GumgaService<Pessoas, String> service) {
        super(service);
    }
}

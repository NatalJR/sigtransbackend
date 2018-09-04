package br.sigtrans.sigtrans.api.resource;


import br.sigtrans.sigtrans.domain.Via.Pavimentacao;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pavimentacao")
public class PavimentacaoResource extends GumgaAPI<Pavimentacao, String> {
    @Autowired
    public PavimentacaoResource(@Qualifier("pavimentacaoService") GumgaService<Pavimentacao, String> service) {
        super(service);
    }
}

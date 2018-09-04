package br.sigtrans.sigtrans.api.resource;


import br.sigtrans.sigtrans.domain.Via.CondicoesClimaticas;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/condicoesclimaticas")
public class CondicoesClimaticasResource extends GumgaAPI<CondicoesClimaticas, String> {
    @Autowired
    public CondicoesClimaticasResource(@Qualifier("condicoesClimaticasService")GumgaService<CondicoesClimaticas, String> service){
        super(service);
    }
}

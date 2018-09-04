package br.sigtrans.sigtrans.api.resource;


import br.sigtrans.sigtrans.domain.Via.Visibilidade;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visibilidade")
public class VisibilidadeResource extends GumgaAPI<Visibilidade, String> {
    @Autowired
    public VisibilidadeResource(@Qualifier("visibilidadeService")GumgaService<Visibilidade, String> service) {
        super(service);
    }
}

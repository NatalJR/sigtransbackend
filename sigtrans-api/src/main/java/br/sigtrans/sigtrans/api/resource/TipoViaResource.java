package br.sigtrans.sigtrans.api.resource;


import br.sigtrans.sigtrans.domain.Via.TipoVia;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipovia")
public class TipoViaResource extends GumgaAPI<TipoVia, String> {
    @Autowired
    public TipoViaResource(@Qualifier("tipoViaService") GumgaService<TipoVia, String> service) {
        super(service);
    }
}

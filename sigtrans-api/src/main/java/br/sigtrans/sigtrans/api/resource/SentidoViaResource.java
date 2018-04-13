package br.sigtrans.sigtrans.api.resource;


import br.sigtrans.sigtrans.domain.SentidoVia;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sentidovia")
public class SentidoViaResource extends GumgaAPI<SentidoVia, String> {

    @Autowired
    public SentidoViaResource(@Qualifier("sentidoViaService")GumgaService<SentidoVia, String> service){
        super(service);
    }
}

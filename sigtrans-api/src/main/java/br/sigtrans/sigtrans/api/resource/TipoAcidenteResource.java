package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Ocorrencia.TipoAcidente;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipoacidente")
public class TipoAcidenteResource extends GumgaAPI<TipoAcidente, String>{
    @Autowired
    public TipoAcidenteResource(@Qualifier("tipoAcidenteService") GumgaService<TipoAcidente, String> service){
        super(service);
    }
}

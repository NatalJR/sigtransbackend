package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Bairro;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bairro")
public class BairroResource extends GumgaAPI<Bairro, String>{
    @Autowired
    public BairroResource (@Qualifier("bairroService")GumgaService<Bairro, String> service){
        super(service);
    }
}

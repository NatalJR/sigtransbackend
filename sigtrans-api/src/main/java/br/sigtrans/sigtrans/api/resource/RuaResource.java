package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Rua;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rua")
public class RuaResource extends GumgaAPI<Rua, String>{
    @Autowired
    public RuaResource(@Qualifier("ruaService")GumgaService<Rua, String> service){
        super(service);
    }
}

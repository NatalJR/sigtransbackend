package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Cidade;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cidade")
public class CidadeResource extends GumgaAPI<Cidade, String>{
    @Autowired
    public CidadeResource(@Qualifier("cidadeService") GumgaService<Cidade, String> service){
        super(service);
    }
}

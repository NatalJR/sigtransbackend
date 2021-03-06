package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.ClassificacaoAcidente;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classificacaoacidente")
public class ClassificacaoAcidenteResource extends GumgaAPI<ClassificacaoAcidente, String> {
    @Autowired
    public ClassificacaoAcidenteResource(@Qualifier("classificacaoAcidenteService")GumgaService<ClassificacaoAcidente, String> service){
        super(service);
    }
}

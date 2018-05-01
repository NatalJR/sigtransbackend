package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.AcidenteTrabalho;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acidentetrabalho")
public class AcidenteTrabalhoResource extends GumgaAPI<AcidenteTrabalho, String> {
    @Autowired
    public AcidenteTrabalhoResource(@Qualifier("acidenteTrabalhoService") GumgaService<AcidenteTrabalho, String> service) {
        super(service);
    }
}

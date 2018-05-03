package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Ocorrencia;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaResource extends GumgaAPI<Ocorrencia, String> {
    @Autowired
    public OcorrenciaResource(@Qualifier("ocorrenciaService") GumgaService<Ocorrencia, String> service) {
        super(service);
    }
}

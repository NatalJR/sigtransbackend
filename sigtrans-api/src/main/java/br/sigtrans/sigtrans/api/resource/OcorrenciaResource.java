package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Ocorrencia.Ocorrencia;
import br.sigtrans.sigtrans.service.OcorrenciaService;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaResource extends GumgaAPI<Ocorrencia, String> {
    @Autowired
    public OcorrenciaResource(@Qualifier("ocorrenciaService") GumgaService<Ocorrencia, String> service) {
        super(service);
    }

    //buscar por ocorrencias fatais
    @RequestMapping("/obitos")
    public List<Ocorrencia> BuscarObitosGQuery(@RequestParam(required = false) Integer pageSize) {
        if (pageSize == null || pageSize <= 0) {
            pageSize = 0;
        }
        return ((OcorrenciaService) service).buscarObitos(pageSize);
    }

}

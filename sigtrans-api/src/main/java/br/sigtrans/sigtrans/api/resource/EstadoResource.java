package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Estado;
import br.sigtrans.sigtrans.service.EstadoService;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estado")
public class EstadoResource extends GumgaAPI<Estado, String>{

    @Autowired
    public EstadoResource(@Qualifier("estadoService")GumgaService<Estado, String> service){
        super(service);
    }

    @RequestMapping("/novo")
    public List<Estado> BuscarEstadoGQuery(@RequestParam String nome) {
        return ((EstadoService) service).buscarEstadoPorNomeGQuery(nome);
    }
}

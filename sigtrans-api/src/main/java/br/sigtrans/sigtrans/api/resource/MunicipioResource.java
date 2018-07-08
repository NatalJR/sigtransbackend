package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Municipio;
import br.sigtrans.sigtrans.service.MunicipioService;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/municipio")
public class MunicipioResource extends GumgaAPI<Municipio, String> {
    @Autowired
    public MunicipioResource(@Qualifier("municipioService") GumgaService<Municipio, String> service) {
        super(service);
    }

    @RequestMapping("byname")
    public List<Municipio> BuscarMunicipioGQuery(@RequestParam String nome) {
        return ((MunicipioService) service).buscaMunicipioPorNomeGQuery(nome);
    }
}

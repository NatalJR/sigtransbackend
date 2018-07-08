package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Rua;
import br.sigtrans.sigtrans.service.RuaService;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rua")
public class RuaResource extends GumgaAPI<Rua, String>{
    @Autowired
    public RuaResource(@Qualifier("ruaService")GumgaService<Rua, String> service){
        super(service);
    }

    @RequestMapping("byname")
    public List<Rua> BuscarRuaGQuery(@RequestParam String nome) {
        return ((RuaService) service).buscaRuaPorNomeGQuery(nome);
    }
}

package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Bairro;
import br.sigtrans.sigtrans.service.BairroService;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bairro")
public class BairroResource extends GumgaAPI<Bairro, String>{
    @Autowired
    public BairroResource (@Qualifier("bairroService")GumgaService<Bairro, String> service){
        super(service);
    }

    @RequestMapping("byname")
    public List<Bairro> BuscarEstadoGQuery(@RequestParam String nome, @RequestParam String municipioId) {
        return ((BairroService) service).buscarBairroPorNome(nome, municipioId);
    }
}

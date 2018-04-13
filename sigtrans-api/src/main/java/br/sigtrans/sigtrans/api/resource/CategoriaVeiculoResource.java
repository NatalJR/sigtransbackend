package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.CategoriaVeiculo;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/CategoriaVeiculo")
public class CategoriaVeiculoResource extends GumgaAPI<CategoriaVeiculo, String> {
    @Autowired
    public CategoriaVeiculoResource(@Qualifier("categoriaVeiculoService") GumgaService<CategoriaVeiculo, String> service) {
        super(service);
    }
}

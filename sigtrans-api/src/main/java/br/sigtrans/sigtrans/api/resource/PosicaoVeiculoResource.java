package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Ocorrencia.PosicaoVeiculo;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posicaoveiculo")
public class PosicaoVeiculoResource extends GumgaAPI<PosicaoVeiculo, String>{
    @Autowired
    public PosicaoVeiculoResource(@Qualifier("posicaoVeiculoService") GumgaService<PosicaoVeiculo, String> service) {
        super(service);
    }
}

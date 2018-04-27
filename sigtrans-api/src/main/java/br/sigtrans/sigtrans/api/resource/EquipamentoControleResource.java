package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.EquipamentoControle;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipamentocontrole")
public class EquipamentoControleResource extends GumgaAPI<EquipamentoControle, String> {
    @Autowired
    public EquipamentoControleResource(@Qualifier("equipamentoControleService") GumgaService<EquipamentoControle, String> service) {
        super(service);
    }
}

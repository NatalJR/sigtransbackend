package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.SinalizacaoVertical;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sinalizacaovertical")
public class SinalizacaoVerticalResource extends GumgaAPI<SinalizacaoVertical, String> {
    @Autowired
    public SinalizacaoVerticalResource(@Qualifier("sinalizacaoVerticalService") GumgaService<SinalizacaoVertical, String> service) {
        super(service);
    }
}

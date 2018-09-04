package br.sigtrans.sigtrans.api.resource;


import br.sigtrans.sigtrans.domain.Via.Semaforo;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/semaforo")
public class SemaforoResource extends GumgaAPI<Semaforo, String> {
    @Autowired
    public SemaforoResource(@Qualifier("semaforoService") GumgaService<Semaforo, String> service) {
        super(service);
    }
}

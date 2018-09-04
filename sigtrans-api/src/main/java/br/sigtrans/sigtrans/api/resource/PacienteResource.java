package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.AIH.Paciente;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteResource extends GumgaAPI<Paciente, String> {
    @Autowired
    public PacienteResource(@Qualifier("pacienteService") GumgaService<Paciente, String> service) {
        super(service);
    }
}

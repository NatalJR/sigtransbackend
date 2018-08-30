package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Paciente;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PacienteService extends GumgaService<Paciente, String> {
    @Autowired
    public PacienteService(GumgaCrudRepository<Paciente, String> repository) {
        super(repository);
    }
}

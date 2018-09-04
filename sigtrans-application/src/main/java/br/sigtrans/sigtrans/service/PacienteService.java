package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.AIH.Paciente;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService extends GumgaService<Paciente, String> {
    @Autowired
    public PacienteService(GumgaCrudRepository<Paciente, String> repository) {
        super(repository);
    }
}

package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Ocorrencia.AcidenteTrabalho;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcidenteTrabalhoService extends GumgaService<AcidenteTrabalho, String> {
    @Autowired
    public AcidenteTrabalhoService(GumgaCrudRepository<AcidenteTrabalho, String> repository) {
        super(repository);
    }

}

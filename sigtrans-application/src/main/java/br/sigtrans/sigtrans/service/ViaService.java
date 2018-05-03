package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Via;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViaService extends GumgaService<Via, String> {
    @Autowired
    public ViaService(GumgaCrudRepository<Via, String> repository) {
        super(repository);
    }
}

package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Veiculos;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculosService extends GumgaService<Veiculos, String> {
    @Autowired
    public VeiculosService(GumgaCrudRepository<Veiculos, String> repository) {
        super(repository);
    }
}

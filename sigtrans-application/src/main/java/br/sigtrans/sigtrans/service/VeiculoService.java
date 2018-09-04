package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Veiculo.Veiculo;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService extends GumgaService<Veiculo, String> {
    @Autowired
    public VeiculoService(GumgaCrudRepository<Veiculo, String> repository) {
        super(repository);
    }
}

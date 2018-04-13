package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.ModeloVeiculo;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModeloVeiculoService extends GumgaService<ModeloVeiculo, String> {
    @Autowired
    public ModeloVeiculoService(GumgaCrudRepository<ModeloVeiculo, String> repository) {
        super(repository);
    }
}

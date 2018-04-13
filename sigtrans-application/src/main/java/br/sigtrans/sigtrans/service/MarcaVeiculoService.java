package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.MarcaVeiculo;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarcaVeiculoService extends GumgaService<MarcaVeiculo, String> {
    @Autowired
    public MarcaVeiculoService(GumgaCrudRepository<MarcaVeiculo, String> repository) {
        super(repository);
    }
}

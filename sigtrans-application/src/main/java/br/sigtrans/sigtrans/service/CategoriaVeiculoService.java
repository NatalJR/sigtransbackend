package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.CategoriaVeiculo;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaVeiculoService extends GumgaService<CategoriaVeiculo, String> {
    @Autowired
    public CategoriaVeiculoService(GumgaCrudRepository<CategoriaVeiculo, String> repository) {
        super(repository);
    }
}

package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Ocorrencia.PosicaoVeiculo;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PosicaoVeiculoService extends GumgaService<PosicaoVeiculo, String> {
    @Autowired
    public PosicaoVeiculoService(GumgaCrudRepository<PosicaoVeiculo, String> repository) {
        super(repository);
    }
}

package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Ocorrencia.EquipamentoControleTrafego;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipamentoControleTrafegoService extends GumgaService<EquipamentoControleTrafego, String> {
    @Autowired
    public EquipamentoControleTrafegoService(GumgaCrudRepository<EquipamentoControleTrafego, String> repository) {
        super(repository);
    }
}

package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.EquipamentoControle;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipamentoControleService extends GumgaService<EquipamentoControle, String> {
    @Autowired
    public EquipamentoControleService(GumgaCrudRepository<EquipamentoControle, String> repository) {
        super(repository);
    }
}

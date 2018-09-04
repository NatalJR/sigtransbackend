package br.sigtrans.sigtrans.service;


import br.sigtrans.sigtrans.domain.Via.Acostamento;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcostamentoService extends GumgaService<Acostamento, String> {
    @Autowired
    public AcostamentoService(GumgaCrudRepository<Acostamento, String> repository) {
        super(repository);
    }
}

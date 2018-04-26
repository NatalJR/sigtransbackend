package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.DadosEstatisticos;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadosEstatisticosService extends GumgaService<DadosEstatisticos, String> {
    @Autowired
    public DadosEstatisticosService(GumgaCrudRepository<DadosEstatisticos, String> repository) {
        super(repository);
    }
}

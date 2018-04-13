package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.SinalizacaoVertical;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SinalizacaoVerticalService extends GumgaService<SinalizacaoVertical, String> {
    @Autowired
    public SinalizacaoVerticalService(GumgaCrudRepository<SinalizacaoVertical, String> repository) {
        super(repository);
    }
}

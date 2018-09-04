package br.sigtrans.sigtrans.service;


import br.sigtrans.sigtrans.domain.Via.Sinalizacao;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SinalizacaoService extends GumgaService<Sinalizacao, String> {
    @Autowired
    public SinalizacaoService(GumgaCrudRepository<Sinalizacao, String> repository) {
        super(repository);
    }
}

package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Pessoas;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoasService extends GumgaService<Pessoas, String> {
    @Autowired
    public PessoasService(GumgaCrudRepository<Pessoas, String> repository) {
        super(repository);
    }
}

package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Ocorrencia.ClassificacaoAcidente;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassificacaoAcidenteService extends GumgaService<ClassificacaoAcidente, String> {

    @Autowired
    public ClassificacaoAcidenteService(GumgaCrudRepository<ClassificacaoAcidente, String> repository) {
        super(repository);
    }

}
package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Rua;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RuaService extends GumgaService<Rua, String> {

    @Autowired
    public RuaService(GumgaCrudRepository<Rua, String> repository) {
        super(repository);
    }

}
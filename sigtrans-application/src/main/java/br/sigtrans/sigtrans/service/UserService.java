package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.User;
import br.sigtrans.sigtrans.repository.UserRepository;
import io.gumga.application.GumgaService;
import io.gumga.core.gquery.ComparisonOperator;
import io.gumga.core.gquery.Criteria;
import io.gumga.core.gquery.GQuery;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends GumgaService<User, String> {

    @Autowired
    public UserService(GumgaCrudRepository<User, String> repository) {
        super(repository);
    }

    public List<User> buscaUsuarioPorEmailAddressGQuery(String emailAddress) {
        List<User> users = ((UserRepository) repository).buscaUsuarioPorEmailAddress((emailAddress + "%"));

        GQuery gQuery = new GQuery(new Criteria("obj.emailAddress", ComparisonOperator.CONTAINS, emailAddress));

        return users;
    }

}


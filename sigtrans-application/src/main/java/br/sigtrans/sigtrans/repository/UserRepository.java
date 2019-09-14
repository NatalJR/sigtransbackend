package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.User;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends GumgaCrudRepository<User, String> {

    @Query("from User as c where c.emailAddress like:emailAddress")
    List<User> buscaUsuarioPorEmailAddress(@Param("emailAddress") String emailAddress);

}

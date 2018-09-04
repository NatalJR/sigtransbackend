package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.AIH.Paciente;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends GumgaCrudRepository<Paciente, String> {
}

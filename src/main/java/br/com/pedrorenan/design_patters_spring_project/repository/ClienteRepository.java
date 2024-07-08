package br.com.pedrorenan.design_patters_spring_project.repository;

import br.com.pedrorenan.design_patters_spring_project.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente,Long> {
}

package br.com.pedrorenan.design_patters_spring_project.repository;

import br.com.pedrorenan.design_patters_spring_project.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}

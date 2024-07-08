package br.com.pedrorenan.design_patters_spring_project.service;

import br.com.pedrorenan.design_patters_spring_project.model.Cliente;


public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void insert(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}

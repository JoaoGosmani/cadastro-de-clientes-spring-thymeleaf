package br.com.joaogosmani.cadastrodeclientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.cadastrodeclientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}

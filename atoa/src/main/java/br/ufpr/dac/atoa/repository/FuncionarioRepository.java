package br.ufpr.dac.atoa.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.ufpr.dac.atoa.entity.Funcionario;

@RepositoryRestResource(collectionResourceRel = "funcionario", path = "funcionario")
public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Integer> {

}
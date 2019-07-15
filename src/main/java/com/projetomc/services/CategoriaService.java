package com.projetomc.services;

import java.util.Optional;


import com.projetomc.services.exceptions.ObejctNotFoundException2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetomc.domain.Categoria;
import com.projetomc.repositories.CategoriaRepository;


@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObejctNotFoundException2(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));		
	}
}

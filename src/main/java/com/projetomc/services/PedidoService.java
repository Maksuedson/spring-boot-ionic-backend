package com.projetomc.services;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetomc.domain.Pedido;
import com.projetomc.repositories.PedidoRepository;
import com.projetomc.services.exceptions.ObjectNotFoundException;


@Service
public class PedidoService {
	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));		
	}
}

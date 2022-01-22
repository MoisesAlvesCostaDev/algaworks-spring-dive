package com.algaworks.algalog.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.algaworks.algalog.api.model.EntregaModel;
import com.algaworks.algalog.api.model.input.EntregaInput;
import com.algaworks.algalog.domain.model.Entrega;

import lombok.AllArgsConstructor;


import java.util.List;
import java.util.stream.Collectors;



@AllArgsConstructor
@Component
public class EntregaAssembler {
	private ModelMapper modelMapper;
	
	public EntregaModel toModel(Entrega entregaSolicitada) {
		return modelMapper.map(entregaSolicitada, EntregaModel.class);
	}
	
	public List<EntregaModel>  toCollectionModel(List<Entrega> entregas){
		return entregas.stream()
				.map(this::toModel)
				.collect(Collectors.toList());
	}
	
	public Entrega toEntity(EntregaInput entregaInput) {
		
		return modelMapper.map(entregaInput, Entrega.class);
	}

}

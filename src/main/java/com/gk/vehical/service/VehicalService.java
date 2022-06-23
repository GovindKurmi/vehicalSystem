package com.gk.vehical.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gk.vehical.model.Model;
import com.gk.vehical.model.Vehical;
import com.gk.vehical.model.Vender;
import com.gk.vehical.repository.ModelRepository;
import com.gk.vehical.repository.VehicalRepository;
import com.gk.vehical.repository.VenderRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VehicalService {

	private final VehicalRepository repository;
	private final VenderRepository venderRepository;
	private final ModelRepository modelRepository;

	public List<Vehical> getVehical() {
		return repository.findAll();
	}

	public Vehical savevehical(Vehical vehical) {
		return repository.save(vehical);
	}

	public void removeRecord(int id) {
		repository.deleteById(id);
	}

	public List<String> getVehical(String vehicalType) {

		List<Vender> vender = venderRepository.findByVehicalType(vehicalType);
		List<String> list = vender.stream().map(s -> s.getVender()).toList();
		return list;
	}

	public List<Vender> saveVender(List<Vender> vender) {
		return venderRepository.saveAll(vender);
	}

	public List<String> getModel(String vedorType, String vehicaltype) {
		List<Model> vender = modelRepository.findByVenderTypeAndVehicalType(vedorType,vehicaltype);
		List<String> list = vender.stream().map(s -> s.getModel()).toList();
		return list;
	}

	public List<Model> saveModel(List<Model> model) {
		return modelRepository.saveAll(model);
	}

}

package com.gk.vehical.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gk.vehical.model.Model;
import com.gk.vehical.model.Vehical;
import com.gk.vehical.model.Vender;
import com.gk.vehical.service.VehicalService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("vehical")
@AllArgsConstructor
@CrossOrigin(origins="http://localhost:4200")  
public class VehicalController {

	private final VehicalService vehicalService;

	@GetMapping("fetchvehical")
	public List<Vehical> getVehical() {
		return vehicalService.getVehical();
	}

	@PostMapping("savevehical")
	public Vehical savevehical(@RequestBody Vehical vehical) {
		return vehicalService.savevehical(vehical);
	}
	
	@GetMapping("/getvender/{vehicalType}")
	public List<String> getVender(@PathVariable String vehicalType) {
		return vehicalService.getVehical(vehicalType);
	}
	@PostMapping("vender")
	public List<Vender> saveVender(@RequestBody List<Vender> vender) {
		return vehicalService.saveVender(vender);
	}
	@GetMapping("/getmodel/{vendortype}/{vehicaltype}")
	public List<String> getModel(@PathVariable String vendortype,@PathVariable String vehicaltype) {
		return vehicalService.getModel(vendortype,vehicaltype);
	}
	@PostMapping("model")
	public List<Model> saveModel(@RequestBody List<Model> model) {
		return vehicalService.saveModel(model);
	}
	@DeleteMapping("deletedata")
	public void removeRecord(@PathVariable int id) {
		vehicalService.removeRecord(id);
	}
}

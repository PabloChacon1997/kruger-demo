package com.example.demo.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Empleado;
import com.example.demo.repository.IEmpleadoRepository;

@RestController
@RequestMapping("/api/v1")
public class EmpleadoController {
	
	
	@Autowired
	private IEmpleadoRepository empleadoRepository;
	
	@GetMapping("/ver/{emp_id}")
	public Optional<Empleado> verDatos(Long per_id) {
		return empleadoRepository.findById(per_id);
	}
	
	@PutMapping("/actualizar/")
	@ResponseBody
	public Empleado actualizarDatos(@Valid @RequestBody Empleado empleado) {
		if (empleado.isEmp_vacunado()) {
			return empleadoRepository.save(empleado);
		}
	
		empleado.getPersona().setEstadoVacunas(null);
		return empleadoRepository.save(empleado);
	}
}

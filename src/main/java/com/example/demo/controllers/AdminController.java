package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Empleado;
import com.example.demo.models.Persona;
import com.example.demo.models.Usuario;
import com.example.demo.repository.IEmpleadoRepository;
import com.example.demo.repository.IPersonaRepository;
import com.example.demo.repository.IUsuarioRepository;


@RestController
@RequestMapping("/api/v1")
public class AdminController {
	
	@Autowired
	private IEmpleadoRepository empleadoRepository;
	
	@Autowired
	private IPersonaRepository personaRepository;
	
	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	
	@GetMapping("/empleados")
	public List<Empleado> obtenerEmpleados() {
		return empleadoRepository.findAll();
	}
	
	@PostMapping("/empleado/crear")
	@ResponseBody
	@CrossOrigin
	public Usuario crearPersonayUsuario(@Valid @RequestBody Persona persona) {
		Persona personaCreada = personaRepository.save(persona);
		Empleado nuevoEmpleado = new Empleado();
		nuevoEmpleado.setPersona(personaCreada);
		empleadoRepository.save(nuevoEmpleado);
		Usuario nuevoUsuario = new Usuario();
		String upperCaseLetters = RandomStringUtils.random(2, 65, 90, true, true);
	    String lowerCaseLetters = RandomStringUtils.random(2, 97, 122, true, true);
	    nuevoUsuario.setPersona(personaCreada);
		nuevoUsuario.setUsuario_nombre(personaCreada.getPer_nombre().toLowerCase());
		nuevoUsuario.setUsuario_contrasena(upperCaseLetters+lowerCaseLetters);
		nuevoUsuario.setUsuario_admin(false);
		return usuarioRepository.save(nuevoUsuario);
	}
	
	@PutMapping("/empleado/actualizar")
	@ResponseBody
	@CrossOrigin
	public Persona actualizarEmpleado(@Valid @RequestBody Persona persona) {
		return personaRepository.save(persona);
	}
	
	@DeleteMapping("/empleado/eliminar/{emp_id}")
	public void eliminarEmpleado(@PathVariable Long emp_id) {
		empleadoRepository.deleteById(emp_id);
	}
	

	
}

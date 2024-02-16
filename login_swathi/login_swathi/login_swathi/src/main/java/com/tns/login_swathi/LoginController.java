package com.tns.login_suvetha;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@Autowired
	private LoginService service;
	
	@PostMapping("/loginservice")
	public void add(@RequestBody Login login)
	{
		service.save(login);
	}
	
	@GetMapping("/loginservice")
	public List<Login> getAllLogin()
	{
	   return service.getAllLogin();
	}
	
	@GetMapping("/loginservice/{id}")
	public Login getLoginById(@PathVariable Integer id)
	{
		return service.getLoginById(id);
	}
	
	@DeleteMapping("/loginservice/{id}")
	public void deleteLogin(@PathVariable Integer id)
	{
		service.deleteLogin(id);
	}
	
	@PutMapping("/loginservice/{id}")
	public ResponseEntity<String> updateLogin(@PathVariable Integer id, @RequestBody Login updatedLogin)
	{
		service.updateLogin(id, updatedLogin);
		return ResponseEntity.ok("Employer update successfully.");
	}

}

package com.im28minute.rest.webservice.restfulwebservice.user;

import java.lang.module.FindException;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.im28minute.rest.webservice.restfulwebservice.exception.UserNotFoundException;

@RestController
public class UserResource {

	
		@Autowired
		private UserDavService service;
	
		///RetrieveAllUsers
		@GetMapping("/users")
		public List<User> retrieveAllUsers(){
			
			return service.findAll();
		}

		///RetrieveUser(int id)
		@GetMapping("/users/{id}")
		public User retrieveUser(@PathVariable int id) {
			User user=service.findone(id);
			if(user==null)
				throw new UserNotFoundException("id-"+id);
			
			return user;
			
		}
		
		
		//input -datails of user
		//output-CRETED & return the created URI
		@PostMapping("/users")
		public ResponseEntity<Object> createUser(@RequestBody User user)
		{
			User savedUser=service.save(user);
			//Created
			 
		URI location =ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(savedUser.getId()).toUri();
			
			
			return ResponseEntity.created(location).build();
		}
		
		
		
		
		
	
}

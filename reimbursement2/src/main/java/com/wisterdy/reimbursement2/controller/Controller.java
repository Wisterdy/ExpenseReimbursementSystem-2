package com.wisterdy.reimbursement2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.wisterdy.reimbursement2.Exceptions.InvalidParam;
import com.wisterdy.reimbursement2.Exceptions.UserRoleCantBeFound;
import com.wisterdy.reimbursement2.dto.CreateDto;
import com.wisterdy.reimbursement2.models.UserRole;
import com.wisterdy.reimbursement2.service.Services;

@RestController
public class Controller {
     
	@Autowired
	Services service ;
	
	
	@GetMapping( path ="/testing")
	public String testing() {
		return "hello test";
	}
	
	
	@PostMapping("/UserRole")
	public UserRole createUserRole(@RequestBody CreateDto createdto) throws InvalidParam {
          
		return service.creatingUserRole(createdto);
	}
	
	@GetMapping("/UserRole")
	public List<UserRole>  findAllUserRole(){
		
		return this.service.FindAllUserRoles();
		
	}
	
	
	@GetMapping("UserRole/{id}")
	public UserRole findUserRole(@PathVariable("id") String id) throws UserRoleCantBeFound {
		
		UserRole userrole= null;
		try {
		Integer ID = Integer.parseInt(id);
		userrole =service.findUserRole(ID);
		
		}catch( UserRoleCantBeFound e) {
			 throw new  ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}catch(Exception e){
			 throw new  ResponseStatusException(HttpStatus.BAD_REQUEST, "Valid Id not provide for find UserRole");
		}
		///
      return userrole;
		
	}
	
	
	@PutMapping("/UserRole/{id}")
	public UserRole updateUserRole(@RequestBody CreateDto createdto, @PathVariable("id") String inputid) throws InvalidParam  {
		UserRole role= null;
	try {
		Integer id = Integer.parseInt(inputid);
		role=service.updateUserRole(createdto, id);
		}catch( UserRoleCantBeFound e) {
			 throw new  ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}catch(InvalidParam e) {
			 throw new  ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}catch(Exception e){
			 throw new  ResponseStatusException(HttpStatus.BAD_REQUEST, "Valid Id not provide for find UserRole");
		}
	
	    return role;
	}
	
	
	@DeleteMapping("/UserRole/{id}")
	 public Integer deleteUserRole(@PathVariable ("id") String inputid) {
		int result=-1;
		try {
			Integer id = Integer.parseInt(inputid);
				result = service.deleteUserRole(id);
		   }catch(Exception e){
				 throw new  ResponseStatusException(HttpStatus.BAD_REQUEST, "Valid Id not provide for find UserRole");
			}
		
		return result;
		
	}

}

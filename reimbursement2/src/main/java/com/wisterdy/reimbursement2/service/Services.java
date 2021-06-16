package com.wisterdy.reimbursement2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wisterdy.reimbursement2.Exceptions.InvalidParam;
import com.wisterdy.reimbursement2.Exceptions.UserRoleCantBeFound;
import com.wisterdy.reimbursement2.dao.UserRoleDao;
import com.wisterdy.reimbursement2.dto.CreateDto;
import com.wisterdy.reimbursement2.models.UserRole;

@Service
public class Services {

	@Autowired
	UserRoleDao userRoleDao;
	@Transactional
	public UserRole creatingUserRole(CreateDto createdto) throws InvalidParam {
		//if()
		if(createdto.getName() == null || createdto.getName().isBlank())
		{
			throw new InvalidParam("Name for Creating UserRole is Invalid");
		}
		
		UserRole userRole = new UserRole();
		userRole.setTitle(createdto.getName());
		userRole=userRoleDao.save(userRole);
		return userRole;
			
	
	}
	public UserRole findUserRole(Integer iD) throws UserRoleCantBeFound {
		
		if(!userRoleDao.existsById(iD))
		{
			throw new UserRoleCantBeFound("UserRole with can not be found with the provided ID: " + iD);
		}
		
		Optional<UserRole> result =userRoleDao.findById(iD);
	      return result.get();	
	}
	public List<UserRole> FindAllUserRoles() {
		
		return this.userRoleDao.findAll();
		
	}
	public UserRole updateUserRole(CreateDto createDto, Integer id) throws UserRoleCantBeFound, InvalidParam {
		
		if(createDto.getName()== null || createDto.getName().trim().isBlank())
		{
			throw new InvalidParam("Name for Creating UserRole is Invalid");
		}
		if(!userRoleDao.existsById(id))
		{
			throw new UserRoleCantBeFound("UserRole with can not be found with the provided ID: " + id);
		}
		
		Optional<UserRole> result =userRoleDao.findById(id);
	    UserRole role= result.get();	
	    role.setTitle(createDto.getName());
	    role= userRoleDao.save(role);
	    return role;
	    
	}
	public int deleteUserRole(Integer id) throws UserRoleCantBeFound {
		
		int output =-1;
		if(!userRoleDao.existsById(id))
		{
			throw new UserRoleCantBeFound("UserRole with can not be found with the provided ID: " + id);
		}
		
		if(userRoleDao.existsById(id))
		{
			Optional<UserRole> result =userRoleDao.findById(id);
		    UserRole role= result.get();	
		    output = role.getUserRoleID();
		    userRoleDao.deleteById(id);
		}
		return output;
	}

	

}

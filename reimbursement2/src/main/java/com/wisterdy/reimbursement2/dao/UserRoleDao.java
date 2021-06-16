package com.wisterdy.reimbursement2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisterdy.reimbursement2.models.UserRole;

public interface UserRoleDao extends JpaRepository<UserRole,Integer > {

}

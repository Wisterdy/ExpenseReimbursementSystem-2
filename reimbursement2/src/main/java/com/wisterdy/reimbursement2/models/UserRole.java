package com.wisterdy.reimbursement2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name ="UserRole")
@AllArgsConstructor @EqualsAndHashCode @Getter @Setter @ToString @NoArgsConstructor
public class UserRole {


	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column( name = "UserRoleID")
	private Integer userRoleID;
	
     @Column( name = "UserRoleTitle" , length = 100)
	private String title;
}

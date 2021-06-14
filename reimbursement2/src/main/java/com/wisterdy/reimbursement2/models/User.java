package com.wisterdy.reimbursement2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table( name ="User")
@AllArgsConstructor @EqualsAndHashCode @Getter @Setter @ToString @NoArgsConstructor
public class User {
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY)
@Column( name ="UserID")
private Integer user_id;

@Column( name= "Username", length = 50, unique = true)
private String username;

@Column( name= "Password", length = 50 )
private String password;

@Column( name ="Firstname", length = 100)
private String firstname;

@Column( name= "LastName", length = 150, unique = true)
private String lastname;


@Column ( name ="email", length = 150, unique = true)
private String email;


@ManyToOne
@JoinColumn(name ="UserRoleID")
private UserRole user_role;

}

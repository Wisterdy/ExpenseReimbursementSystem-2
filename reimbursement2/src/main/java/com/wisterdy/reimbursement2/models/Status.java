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
@Table( name = "Status")
@AllArgsConstructor @EqualsAndHashCode @Getter @Setter @ToString @NoArgsConstructor
public class Status {

@Id
@GeneratedValue( strategy = GenerationType.IDENTITY)
private Integer status_id;

@Column( name = "Status_Name", length= 150, unique = true)
private String status_name;


}

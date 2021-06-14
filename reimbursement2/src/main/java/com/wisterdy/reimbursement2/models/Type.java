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
@Table(name ="Type")
@AllArgsConstructor @EqualsAndHashCode @Getter @Setter @ToString @NoArgsConstructor
public class Type {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column( name ="ReimbTypeId")
 int reimb_type_id;


 @Column( name = "Reimb_Type", length=150, unique =true)
 private String reimb_type;
	
}

package com.wisterdy.reimbursement2.models;
import java.sql.Blob;
import java.sql.Date;

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
@Table( name ="Reimbursement")
@AllArgsConstructor @EqualsAndHashCode @Getter @Setter @ToString @NoArgsConstructor
public class Reimb {

@Id
@GeneratedValue( strategy = GenerationType.IDENTITY)
@Column(name="ReimbID")
private Integer Reimb_id;

@Column(name="ReimbAmount")
private Double reimb_amount;


@Column(name= "dateSubmit")
private Date date_submit;


@Column(name ="DateRespond")
private Date date_respond;

@ManyToOne()
@JoinColumn( name = "ReimbAuthor")
private User Reimb_Author;


@ManyToOne()
@JoinColumn( name = "ReimbResolver")
private User Reimb_Resolver;


@ManyToOne()
@JoinColumn( name = "ReimbStatus")
private Status status ;



@ManyToOne()
@JoinColumn(name ="ReimbType")
private Type type;

//suprise it work with lombook
@Column(name ="Receipt")
private Blob reciept;





}
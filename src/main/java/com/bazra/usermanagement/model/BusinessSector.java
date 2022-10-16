package com.bazra.usermanagement.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "business_sector")
@EntityListeners(AuditingEntityListener.class)
public class BusinessSector {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@ManyToOne
    @JoinColumn(name = "creatorid")
	private AdminInfo creatorid;
	private LocalDate createdDateTime;
	private String sector;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AdminInfo getCreatorid() {
		return creatorid;
	}
	public void setCreatorid(AdminInfo creatorid) {
		this.creatorid = creatorid;
	}
	public LocalDate getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(LocalDate createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	
	

}

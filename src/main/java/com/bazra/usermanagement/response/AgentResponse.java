package com.bazra.usermanagement.response;

import java.util.List;

import com.bazra.usermanagement.model.AgentAddress;
import com.bazra.usermanagement.model.AgentINF;

public class AgentResponse {
	private int id;
	private String name;
	private String fatherName;
	private String lastName;

	private String roles;
	private String username;
    private String region;
    private String city;
    private String houseNo;
	private String subCity;
	private String woreda;
	private String specificLocation;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getSubCity() {
		return subCity;
	}
	public void setSubCity(String subCity) {
		this.subCity = subCity;
	}
	public String getWoreda() {
		return woreda;
	}
	public void setWoreda(String woreda) {
		this.woreda = woreda;
	}
	public String getSpecificLocation() {
		return specificLocation;
	}
	public void setSpecificLocation(String specificLocation) {
		this.specificLocation = specificLocation;
	}
	 public AgentResponse(AgentINF agentINF,List<AgentAddress> useraddressOptional) {

	    	this.fatherName = agentINF.getFatherName();
	    	this.name = agentINF.getName();
	    	this.lastName=agentINF.getLastName();
	    	this.roles= agentINF.getRoles();
	    	this.username=agentINF.getUsername();
	    	this.id=agentINF.getId();
	    	this.region=agentINF.getRegion();
	    	this.city=agentINF.getCity();
	    	this.subCity=agentINF.getSubCity();
	    	this.woreda=agentINF.getWoreda();
	    	this.specificLocation=agentINF.getSpecificLocation();
	    	this.houseNo=agentINF.getHouseNumber();
	    	
//	    	for (int i = 0; i < useraddressOptional.size(); i++) {
//				if (useraddressOptional.get(i).getAddressElement().getTitle().matches("REGION")) {
//					this.region=useraddressOptional.get(i).getAddress();
//				}
//				else if (useraddressOptional.get(i).getAddressElement().getTitle().matches("CITY")) {
//					this.city=useraddressOptional.get(i).getAddress();
//				}
//				else if (useraddressOptional.get(i).getAddressElement().getTitle().matches("SUB CITY")) {
//					this.subCity=useraddressOptional.get(i).getAddress();
//				}
//				else if (useraddressOptional.get(i).getAddressElement().getTitle().matches("HOUSE NUMBER")) {
//					this.houseNo=useraddressOptional.get(i).getAddress();
//				}
//				else if (useraddressOptional.get(i).getAddressElement().getTitle().matches("WOREDA")) {
//					this.woreda=useraddressOptional.get(i).getAddress();
//				}
//				
//			}
	 }
	
	
	
		
//	public AgentResponse(Optional<AgentInfo> agentInfos) {
//		super();
//		this.id = agentInfos.get().getId();
//		this.username = agentInfos.get().getUsername();
//		this.roles = agentInfos.get().getRoles();
//		this.firstName = agentInfos.get().getFirstName();
//		this.lastName = agentInfos.get().getLastName();
//		this.businessLNum =agentInfos.get().getBusinessLNum();
//		this.companyName=agentInfos.get().getCompanyName();
//		this.licenceNumber=agentInfos.get().getLicenceNumber();
//		
//	}

}

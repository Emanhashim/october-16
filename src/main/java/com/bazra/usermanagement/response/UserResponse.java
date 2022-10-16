package com.bazra.usermanagement.response;

import java.util.ArrayList;
import java.util.List;

import com.bazra.usermanagement.model.UserAddress;
import com.bazra.usermanagement.model.UserINF;
import com.bazra.usermanagement.model.UserInfo;

public class UserResponse {

	private int id;
	private String name;
	private String fatherName;
	private String motherName;
	private String lastname;

	private String email;
	private String birthDay;
	private String username;
	private String level;
	private String roles;
	private Boolean locked;
    private String region;
    private String city;
    private String houseNo;
	private String subCity;
	private String woreda;
	private String userType;
	
    private String photo;
    private String kebeleID;
    private String idType;
    private String idNumber;
    private List<UserInfo> userInfos = new ArrayList<>();
//    private UserInfo userInfo = new UserInfo();
	
	
	public List<UserInfo> getUserInfos() {
		return userInfos;
	}
	
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

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

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public void setUserInfos(List<UserInfo> userInfos) {
		this.userInfos = userInfos;
	}
	
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public Boolean getLocked() {
		return locked;
	}
	public void setLocked(Boolean locked) {
		this.locked = locked;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getSubCity() {
		return subCity;
	}
	public void setSubCity(String subCity) {
		this.subCity = subCity;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getWoreda() {
		return woreda;
	}
	public void setWoreda(String woreda) {
		this.woreda = woreda;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getKebeleID() {
		return kebeleID;
	}
	public void setKebeleID(String kebeleID) {
		this.kebeleID = kebeleID;
	}
    
    public UserResponse(List<UserInfo> userInfoss) {
    	
    	this.userInfos
        = new ArrayList<>(userInfoss);
    	
    }
    
    public UserResponse(UserINF userInfoss,List<UserAddress> useraddressOptional) {
    	this.id=userInfoss.getId();
    	this.birthDay=userInfoss.getBirthDay();
    	this.email=userInfoss.getEmail();
    	this.fatherName=userInfoss.getFatherName();
    	this.name=userInfoss.getName();
    	this.lastname=userInfoss.getLastname();
    	this.username=userInfoss.getUsername();
    	this.city=userInfoss.getCity();
    	this.subCity=userInfoss.getSubCity();
    	this.region=userInfoss.getRegion();
    	this.woreda=userInfoss.getWoreda();
    	this.region=userInfoss.getRegion();
    	this.houseNo=userInfoss.getHouseNumber();
    	this.motherName=userInfoss.getMotherName();
    	this.level=userInfoss.getLevels();
    	this.locked=userInfoss.getLocked();
    	
    	
    	for (int i = 0; i < useraddressOptional.size(); i++) {
			if (useraddressOptional.get(i).getAddressElement().getTitle().matches("REGION")) {
				this.region=useraddressOptional.get(i).getAddress();
			}
			else if (useraddressOptional.get(i).getAddressElement().getTitle().matches("CITY")) {
				this.city=useraddressOptional.get(i).getAddress();
			}
			else if (useraddressOptional.get(i).getAddressElement().getTitle().matches("SUB CITY")) {
				this.subCity=useraddressOptional.get(i).getAddress();
			}
			else if (useraddressOptional.get(i).getAddressElement().getTitle().matches("HOUSE NUMBER")) {
				this.houseNo=useraddressOptional.get(i).getAddress();
			}
			else if (useraddressOptional.get(i).getAddressElement().getTitle().matches("WOREDA")) {
				this.woreda=useraddressOptional.get(i).getAddress();
			}
			
		}
    
    }
   
    
}

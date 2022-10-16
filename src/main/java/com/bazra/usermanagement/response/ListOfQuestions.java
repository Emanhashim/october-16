package com.bazra.usermanagement.response;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.bazra.usermanagement.model.SecurityQuestion;
import com.bazra.usermanagement.model.SecurityQuestionINF;

public class ListOfQuestions {
	List<SecurityQuestionINF> allquestion = new ArrayList<>();
	List<SecurityQuestionINF> questions2 = new ArrayList<>();
	List<SecurityQuestionINF> questions3 = new ArrayList<>();
	private Optional<SecurityQuestion> security;

	public ListOfQuestions(List<SecurityQuestion> questions3) {
		super();
		List<SecurityQuestionINF> questions4 = new ArrayList<>();
		for (int i = 0; i < questions3.size(); i++) {

			SecurityQuestionINF securityQuestionINF = new SecurityQuestionINF();
			securityQuestionINF.setCount(questions3.get(i).getCount());
			securityQuestionINF.setCreateDate(questions3.get(i).getCreateDate());
			securityQuestionINF.setId(questions3.get(i).getId());
			securityQuestionINF.setLanguage(questions3.get(i).getLanguage().getName());
			securityQuestionINF.setQuestionName(questions3.get(i).getQuestionName());
			securityQuestionINF.setStatus(questions3.get(i).getStatus());
			securityQuestionINF.setAdminId(questions3.get(i).getAdmin().getId());
			questions4.add(securityQuestionINF);
		}
		this.allquestion = questions4;
	}

	public List<SecurityQuestionINF> getAllquestion() {
		return allquestion;
	}

	public void setAllquestion(List<SecurityQuestionINF> allquestion) {
		this.allquestion = allquestion;
	}

	public List<SecurityQuestionINF> getQuestions2() {
		return questions2;
	}

	public void setQuestions2(List<SecurityQuestionINF> questions2) {
		this.questions2 = questions2;
	}

	public List<SecurityQuestionINF> getQuestions3() {
		return questions3;
	}

	public void setQuestions3(List<SecurityQuestionINF> questions3) {
		this.questions3 = questions3;
	}

	public Optional<SecurityQuestion> getSecurity() {
		return security;
	}

	public void setSecurity(Optional<SecurityQuestion> security) {
		this.security = security;
	}

	public ListOfQuestions(Optional<SecurityQuestion> secOptional) {

		this.security = secOptional;
	}

	public ListOfQuestions(List<SecurityQuestion> questions, List<SecurityQuestion> questions1) {

		List<SecurityQuestionINF> questions4 = new ArrayList<>();
		for (int i = 0; i < questions.size(); i++) {

			SecurityQuestionINF securityQuestionINF = new SecurityQuestionINF();
//			securityQuestionINF.setCount(questions.get(i).getCount());
//			securityQuestionINF.setCreateDate(questions.get(i).getCreateDate());
//			securityQuestionINF.setId(questions.get(i).getId());
//			securityQuestionINF.setLanguage(questions.get(i).getLanguage());
			securityQuestionINF.setQuestionName(questions.get(i).getQuestionName());
//			securityQuestionINF.setStatus(questions.get(i).getStatus());
//			securityQuestionINF.setAdminId(questions.get(i).getAdmin().getId());
			questions4.add(securityQuestionINF);
		}
		List<SecurityQuestionINF> questions5 = new ArrayList<>();
		for (int i = 0; i < questions1.size(); i++) {

			SecurityQuestionINF securityQuestionINF = new SecurityQuestionINF();
//			securityQuestionINF.setCount(questions1.get(i).getCount());
//			securityQuestionINF.setCreateDate(questions1.get(i).getCreateDate());
//			securityQuestionINF.setId(questions1.get(i).getId());
//			securityQuestionINF.setLanguage(questions1.get(i).getLanguage());
			securityQuestionINF.setQuestionName(questions1.get(i).getQuestionName());
//			securityQuestionINF.setStatus(questions1.get(i).getStatus());
//			securityQuestionINF.setAdminId(questions1.get(i).getAdmin().getId());
			questions5.add(securityQuestionINF);
		}
		this.questions2 = questions4;
		this.questions3 = questions5;
	}

}

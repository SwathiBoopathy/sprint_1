package com.tns.login_suvetha;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login {

		@Id
		@Column(name="loginID")
		private int loginID;
		
		@Column(name="userName")
		private String userName;
		
		@Column(name="password")
		private String password;
		
		@Column(name="confirm_password")
		private String confirm_password;

		public int getLoginID() {
			return loginID;
		}

		public void setLoginID(int loginID) {
			this.loginID = loginID;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getConfirm_password() {
			return confirm_password;
		}

		public void setConfirm_password(String confirm_password) {
			this.confirm_password = confirm_password;
		}

		@Override
		public String toString() {
			return "Login [loginID=" + loginID + ", userName=" + userName + ", password=" + password
					+ ", confirm_password=" + confirm_password + "]";
		}
		

}
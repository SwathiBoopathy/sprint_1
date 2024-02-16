package com.tns.login_suvetha;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginService {
	
		@Autowired
		private LoginRepository repo;
		
		public void save(Login login)
		{
			repo.save(login);
		}
		
		public List<Login> getAllLogin()
		{
			return repo.findAll();
		}
		
		public Login getLoginById(Integer id) 
		{
			return repo.findById(id).orElse(null);
		}
		
		public void deleteLogin(Integer id)
		{
			repo.deleteById(id);
		}

		public void updateLogin(Integer id , Login updatedLogin)
		{
			Login existingLogin = repo.findById(id).orElse(null);
			if (existingLogin != null)
			{
				existingLogin.setUserName(updatedLogin.getUserName());
				existingLogin.setPassword(updatedLogin.getPassword());
				existingLogin.setConfirm_password(updatedLogin.getConfirm_password());
			
				repo.save(existingLogin);
			}
		}
}

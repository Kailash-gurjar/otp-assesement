package com.otp.otpassesment;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author shrisowdhaman
 * Dec 14, 2017
 */
public interface UserRepository extends JpaRepository<User, Long>{
	
	 User findByUsername(String username);

}

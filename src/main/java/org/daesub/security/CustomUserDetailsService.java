package org.daesub.security;

import org.daesub.domain.MemberVO;
import org.daesub.mapper.MemberMapper;
import org.daesub.security.domain.CustomUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
public class CustomUserDetailsService implements UserDetailsService {

	@Setter(onMethod = @__({@Autowired}))
	private MemberMapper mamberMapper;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		log.warn("Load User By UserName : " + userName);
		
		MemberVO vo=mamberMapper.read(userName);
		
		log.warn("queried by member mapper :" + vo);
				
		return vo==null?null : new CustomUser(vo);
	}
	
	
	
}

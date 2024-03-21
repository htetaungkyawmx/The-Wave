package com.solt.thewave.service.Impl;

import com.solt.thewave.entities.Users;
import com.solt.thewave.repository.UserRepository;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService  {
	private final UserRepository repository;

	public UserDetailServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {   
    	Users curruser = repository.findByUsername(username);
    	UserDetails user = new org.springframework.security.core.userdetails.User(username, curruser.getPassword(), true,
        		true, true, true, AuthorityUtils.createAuthorityList(curruser.getRole()));
    	return user;
    }
    
}
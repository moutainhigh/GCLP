package com.grape.security.bean;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {
	/**
	 * 
	 */
	private static final long serialVersionUID = -575530973939159037L;
	// 正常这些值应该要赋值，测试用就不写先
	private String name;
	private String password;
	private Collection<Authority> authorties;
	
	public CustomUserDetails(String name, String password,Collection<Authority> authorties){
		this.name = name;
		this.password = password;
		this.authorties = authorties;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorties;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return name;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}

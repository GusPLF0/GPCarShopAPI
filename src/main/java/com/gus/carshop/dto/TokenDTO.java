package com.gus.carshop.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class TokenDTO implements Serializable {
	private String username;
	private Boolean authenticated;
	private Date created;
	private Date expiration;
	private String acessToken;
	private String refreshToken;

	public TokenDTO() {
	}

	public TokenDTO(String username, Boolean authenticated, Date created, Date expiration, String acessToken, String refreshToken) {
		this.username = username;
		this.authenticated = authenticated;
		this.created = created;
		this.expiration = expiration;
		this.acessToken = acessToken;
		this.refreshToken = refreshToken;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TokenDTO tokenVO = (TokenDTO) o;
		return Objects.equals(username, tokenVO.username) && Objects.equals(authenticated, tokenVO.authenticated) && Objects.equals(created, tokenVO.created) && Objects.equals(expiration, tokenVO.expiration) && Objects.equals(acessToken, tokenVO.acessToken) && Objects.equals(refreshToken, tokenVO.refreshToken);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, authenticated, created, expiration, acessToken, refreshToken);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Boolean getAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(Boolean authenticated) {
		this.authenticated = authenticated;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	public String getAcessToken() {
		return acessToken;
	}

	public void setAcessToken(String acessToken) {
		this.acessToken = acessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
}

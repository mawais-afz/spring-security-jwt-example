package com.javatechie.jwt.api.entity;

import java.io.Serializable;

public class AuthResponse implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String jwt;

    public AuthResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}

package com.security.ss.auth.resource.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecuritySession15ResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecuritySession15ResourceServerApplication.class, args);
	}

}

/*

JWT tokens contains 3 parts
1.	Header
2.	Payload
3.	Signature

IN this session we will take opaque token and will make autorize sever to validate our token using introspection endpoint.

GET: localhost:9090/demo
Authorization as Bearer token with value as Opaque token.


*/
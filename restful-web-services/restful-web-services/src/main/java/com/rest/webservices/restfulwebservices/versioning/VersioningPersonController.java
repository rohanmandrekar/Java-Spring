package com.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class VersioningPersonController {
	@GetMapping("v1/person")
	public PersonV1 getFirstVersionofPerson() {
		return new PersonV1("Rohan Mandrekar");
	}
	
	@GetMapping("v2/person")
	public PersonV2 getSecondVersionofPerson() {
		return new PersonV2(new Name("Rohan", "Mandrekar"));
	
	}
	
	@GetMapping(path="person", params="version=1")
	public PersonV1 getFirstVersionofPersonRequestParam() {
		return new PersonV1("Rohan Mandrekar");
	}
	
	@GetMapping(path="person", params="version=2")
	public PersonV2 getSecondtVersionofPersonRequestParam() {
		return new PersonV2(new Name("Rohan", "Mandrekar"));
	}
	
	@GetMapping(path="person/header", headers="X-API-VERSION=1")
	public PersonV1 getFirstVersionofPersonRequestHeader() {
		return new PersonV1("Rohan Mandrekar");
	}
	
	@GetMapping(path="person/header", headers="X-API-VERSION=2")
	public PersonV2 getSecondtVersionofPersonRequestHeader() {
		return new PersonV2(new Name("Rohan", "Mandrekar"));
	}
	
	@GetMapping(path="person/accept", produces="application/vnd.company.app-v1+json")
	public PersonV1 getFirstVersionofPersonAcceptHeader() {
		return new PersonV1("Rohan Mandrekar");
	}
	
	@GetMapping(path="person/accept", produces="application/vnd.company.app-v2+json")
	public PersonV2 getSecondtVersionofPersonAcceptHeader() {
		return new PersonV2(new Name("Rohan", "Mandrekar"));
	}
}

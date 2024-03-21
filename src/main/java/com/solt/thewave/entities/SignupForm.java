package com.solt.thewave.entities;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupForm {
	@NotEmpty
	@Size(min = 4, max = 20)
	private String username;

	@NotEmpty
	@Size(min = 4, max = 30, message = "Password must at least 4* character long.")
	private String password;

	@NotEmpty
	@Size(min = 4, max = 30, message = "Password must at least 4 character long.")
	private String passwordCheck;

	@NotEmpty
	private String role = "USER";

}
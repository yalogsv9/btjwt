package vn.edu.ltweb.jwtmvc.user; import jakarta.validation.constraints.*;
public record RegisterRequest(@NotBlank String fullName,@NotBlank @Email String email,@NotBlank @Size(min=8) String password){}

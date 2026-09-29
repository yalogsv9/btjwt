package vn.edu.ltweb.jwtmvc.auth; import jakarta.validation.constraints.*; public record LoginRequest(@NotBlank @Email String email,@NotBlank String password){}

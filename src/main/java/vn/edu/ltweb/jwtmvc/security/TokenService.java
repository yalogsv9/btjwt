package vn.edu.ltweb.jwtmvc.security; public interface TokenService { String issue(String subject); String extractSubject(String token); void validate(String token); }

package vn.edu.ltweb.jwtmvc.user; import java.time.Instant;
public record UserResponse(Long id,String fullName,String email,Instant createdAt,Instant updatedAt){}

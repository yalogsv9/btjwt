package vn.edu.ltweb.jwtmvc.user;
import jakarta.persistence.*; import java.time.Instant;
@Entity @Table(name="app_users") public class AppUser {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(nullable=false) private String fullName; @Column(nullable=false,unique=true) private String email; @Column(nullable=false) private String password;
 @Column(nullable=false,updatable=false) private Instant createdAt; @Column(nullable=false) private Instant updatedAt;
 protected AppUser(){} public AppUser(String n,String e,String p){fullName=n;email=e;password=p;}
 @PrePersist void created(){createdAt=updatedAt=Instant.now();} @PreUpdate void updated(){updatedAt=Instant.now();}
 public Long getId(){return id;} public String getFullName(){return fullName;} public String getEmail(){return email;} public String getPassword(){return password;} public Instant getCreatedAt(){return createdAt;} public Instant getUpdatedAt(){return updatedAt;}
}

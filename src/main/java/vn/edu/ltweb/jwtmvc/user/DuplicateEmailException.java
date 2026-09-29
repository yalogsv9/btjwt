package vn.edu.ltweb.jwtmvc.user; public class DuplicateEmailException extends RuntimeException { public DuplicateEmailException(){super("Email already registered");} }

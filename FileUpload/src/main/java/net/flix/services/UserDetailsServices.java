package net.flix.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import net.flix.model.UserDetails;

public interface UserDetailsServices {
public abstract ResponseEntity<UserDetails> saveUser(String data, MultipartFile file);
}

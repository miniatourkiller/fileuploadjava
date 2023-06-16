package net.flix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import net.flix.model.UserDetails;
import net.flix.services.UserDetailsImp;

@RestController
public class MyController {
	@Autowired
	UserDetailsImp implementation;
@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
public ResponseEntity<UserDetails> saveUser(@RequestPart("data") String data, @RequestPart("file") MultipartFile file){
	return implementation.saveUser(data, file);
}
}

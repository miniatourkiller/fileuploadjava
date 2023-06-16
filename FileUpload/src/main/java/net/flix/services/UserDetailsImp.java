package net.flix.services;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.json.JsonMapper;

import net.flix.model.UserDetails;
import net.flix.repo.UserDetailsRepo;

@Service
public class UserDetailsImp implements UserDetailsServices{
UserDetails userDetails = new UserDetails();
@Autowired

UserDetailsRepo userDetailsRepo;
@Value("${file.path}")
String filePath;

	@Override
	public ResponseEntity<UserDetails> saveUser(String data, MultipartFile file){
		JsonMapper map = new JsonMapper();
	try {
		userDetails= map.readValue(data, UserDetails.class);
		file.transferTo(new File("C:\\Users\\User\\Documents\\workspace-spring-tool-suite-4-4.14.0.RELEASE\\FileUpload\\src\\main\\resources\\profilePics\\"+file.getOriginalFilename()));
		userDetails.setFileName(file.getOriginalFilename());
		userDetailsRepo.save(userDetails);
	}catch(Exception e) {
		System.out.println(e);
	}

		return ResponseEntity.ok().body(userDetails);
	}


}

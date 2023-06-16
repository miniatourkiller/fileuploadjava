package net.flix.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import net.flix.model.UserDetails;

public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer>{

}

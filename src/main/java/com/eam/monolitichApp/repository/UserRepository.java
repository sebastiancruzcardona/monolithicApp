package com.eam.monolitichApp.repository;

import com.eam.monolitichApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserNameOrEmail(String userName, String email);
}

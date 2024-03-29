package com.safer.safer.user.domain.repository;

import com.safer.safer.auth.domain.ProviderType;
import com.safer.safer.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findById(Long id);
    Optional<User> findByEmailAndProviderType(String email, ProviderType providerType);
}

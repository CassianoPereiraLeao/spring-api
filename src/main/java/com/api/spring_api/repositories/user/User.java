package com.api.spring_api.repositories.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface User extends JpaRepository<User, UUID> {
}

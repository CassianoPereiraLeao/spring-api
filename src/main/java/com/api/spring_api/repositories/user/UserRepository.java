package com.api.spring_api.repositories.user;

import com.api.spring_api.domain.entities.user.User;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID>{

}
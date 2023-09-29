package com.op.user.service.repositories;

import com.op.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    
    // if you wnant implement any custom method or quesry
    // write


}

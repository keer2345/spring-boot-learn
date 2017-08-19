package com.keer.JPA.repository;

import com.keer.JPA.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by qinjh on 17-8-19.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameLike(String name);
}

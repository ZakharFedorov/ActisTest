package com.example.actistest.app.Repository;

import com.example.actistest.app.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query (value = "SELECT * FROM Users", nativeQuery = true)
    List<User> findAll();

    @Query (value = "SELECT * FROM Users WHERE id = ?1", nativeQuery = true)
    User findById(int id);

    @Query(value = "SELECT COUNT(u) > 0 FROM Users u WHERE u.email = ?1", nativeQuery = true)
    boolean existsByEmail(String email);
}

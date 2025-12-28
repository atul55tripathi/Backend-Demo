package com.Atul.demo.Repository;

import com.Atul.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,long> {

}

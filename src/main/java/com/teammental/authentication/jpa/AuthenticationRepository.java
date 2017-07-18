package com.teammental.authentication.jpa;

import com.teammental.authentication.entity.Authentication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Authentication jpa repository.
 * Created by coskun on 17.07.2017.
 */
@Repository
public interface AuthenticationRepository extends JpaRepository<Authentication, Integer> {

}

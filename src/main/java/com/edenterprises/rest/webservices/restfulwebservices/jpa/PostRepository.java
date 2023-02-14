package com.edenterprises.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edenterprises.rest.webservices.restfulwebservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}

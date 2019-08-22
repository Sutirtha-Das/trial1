package com.MongoDB.RestaurantDetails.RestaurantDetails.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.MongoDB.RestaurantDetails.RestaurantDetails.jpa.entity.GuestUser;


public interface UserRepository extends PagingAndSortingRepository<GuestUser, Integer>{
	
	List<GuestUser> findAll();
	GuestUser findByid (int id);
}

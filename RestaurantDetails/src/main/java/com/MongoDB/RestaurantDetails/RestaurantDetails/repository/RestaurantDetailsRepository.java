package com.MongoDB.RestaurantDetails.RestaurantDetails.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.MongoDB.RestaurantDetails.RestaurantDetails.entity.Restaurant_Details;
@Repository
public interface RestaurantDetailsRepository extends MongoRepository<Restaurant_Details, String>{
  
 }

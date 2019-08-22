package com.MongoDB.RestaurantDetails.RestaurantDetails.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MongoDB.RestaurantDetails.RestaurantDetails.entity.Restaurant_Details;
import com.MongoDB.RestaurantDetails.RestaurantDetails.repository.RestaurantDetailsRepository;



@RestController
@RequestMapping(value="/restaurantDetails")
public class RestaurantDetailsController {
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	@Autowired
	RestaurantDetailsRepository repository;
	
	@RequestMapping(value="/getAllRestaurants", method=RequestMethod.GET)
	public List<Restaurant_Details> findAllRestaurants(){
		LOG.info("Getting all restaurants");
		return repository.findAll();
	}
	
}

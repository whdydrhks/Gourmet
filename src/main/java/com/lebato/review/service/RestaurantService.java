package com.lebato.review.service;

import com.lebato.review.api.request.CreateAndEditRestaurantRequest;
import com.lebato.review.model.RestaurantEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RestaurantService {

    @Transactional
    public RestaurantEntity createRestaurant(CreateAndEditRestaurantRequest request) {
        RestaurantEntity restaurant = RestaurantEntity.builder()
                .name(request.getName())
                .address(request.getAddress())
                .build();
        return restaurant;
    }

    public void editRestaurant() {

    }

    public void deleteRestaurant() {

    }
}

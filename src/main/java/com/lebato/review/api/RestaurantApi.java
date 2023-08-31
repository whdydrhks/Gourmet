package com.lebato.review.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestaurantApi {

    @GetMapping("/restaurants")
    public String getRestaurants() {
        return "This is getRestaurans";
    }

    @GetMapping("/restaurant/{restaurantId}")
    public String getRestaurant(@PathVariable Long restaurantId) {
        return "This is getRestaurant, "+restaurantId;
    }

    @PostMapping("/restaurant")
    public String createRestaurant() {
        return "This is createRestaurant";
    }

    @PutMapping("/restaurant/{restaurantId}")
    public String editRestaurant(@PathVariable Long restaurantId) {
        return "This is editRestaurant, "+restaurantId;
    }

    @DeleteMapping("/restaurant/{restaurantId}")
    public String deleteRestaurant(@PathVariable Long restaurantId) {
        return "This is deleteRestaurant, "+restaurantId;
    }
}

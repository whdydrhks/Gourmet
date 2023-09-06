package com.lebato.review.api;

import com.lebato.review.api.request.CreateAndEditRestaurantRequest;
import com.lebato.review.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestaurantApi {
//    private final RestaurantService restaurantService;
    @GetMapping("/restaurants")
    public String getRestaurants() {
        return "This is getRestaurans";
    }

    @GetMapping("/restaurant/{restaurantId}")
    public String getRestaurant(@PathVariable Long restaurantId) {
        return "This is getRestaurant, "+restaurantId;
    }

    @PostMapping("/restaurant")
    public String createRestaurant(@RequestBody CreateAndEditRestaurantRequest request) {
        return "This is createRestaurant, Name= "+request.getName() + "address : "+request.getAddress()
                + ", menu[0].name= "+request.getMenus().get(0).getName()+" , price: "+request.getMenus().get(0).getPrice();
    }

    @PutMapping("/restaurant/{restaurantId}")
    public String editRestaurant(@PathVariable Long restaurantId,
                                 @RequestBody CreateAndEditRestaurantRequest request) {
        return "This is editRestaurant, "+restaurantId +"name= "+request.getName()+" address: "+request.getAddress();
    }

    @DeleteMapping("/restaurant/{restaurantId}")
    public String deleteRestaurant(@PathVariable Long restaurantId) {
        return "This is deleteRestaurant, "+restaurantId;
    }
}

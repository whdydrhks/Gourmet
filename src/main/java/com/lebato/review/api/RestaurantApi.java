package com.lebato.review.api;

import com.lebato.review.api.request.CreateAndEditRestaurantRequest;
import com.lebato.review.api.response.RestaurantDetailView;
import com.lebato.review.api.response.RestaurantView;
import com.lebato.review.model.RestaurantEntity;
import com.lebato.review.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class RestaurantApi {
    private final RestaurantService restaurantService;
    @GetMapping("/restaurants")
    public List<RestaurantView> getRestaurants() {

        return List.of(RestaurantView.builder()
                .id(0L)
                .name("test name")
                .address("test address")
                .createdAt(ZonedDateTime.now())
                .updatedAt(ZonedDateTime.now())
                .build());
    }

    @GetMapping("/restaurant/{restaurantId}")
    public RestaurantDetailView getRestaurant(@PathVariable Long restaurantId) {
        return RestaurantDetailView.builder()
                .id(0L)
                .name("test name")
                .address("test address")
                .createdAt(ZonedDateTime.now())
                .updatedAt(ZonedDateTime.now())
                .menus(List.of(
                        RestaurantDetailView.Menu.builder()
                                .id(0L)
                                .name("test menu name")
                                .price(500)
                                .creadtedAt(ZonedDateTime.now())
                                .updatedAt(ZonedDateTime.now())
                                .build()

                ))
                .build();
    }

    @PostMapping("/restaurant")
    public void createRestaurant(@RequestBody CreateAndEditRestaurantRequest request) {
        restaurantService.createRestaurant(request);
    }

    @PutMapping("/restaurant/{restaurantId}")
    public void editRestaurant(@PathVariable Long restaurantId,
                                 @RequestBody CreateAndEditRestaurantRequest request) {
        restaurantService.editRestaurant(restaurantId, request);
    }

    @DeleteMapping("/restaurant/{restaurantId}")
    public void deleteRestaurant(@PathVariable Long restaurantId) {
        restaurantService.deleteRestaurant(restaurantId);
    }
}

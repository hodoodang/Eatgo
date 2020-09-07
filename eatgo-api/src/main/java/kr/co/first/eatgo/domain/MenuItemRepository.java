package kr.co.first.eatgo.domain;


import java.util.List;

public interface MenuItemRepository {
    List<MenuItem> findAllByRestaurantId(Long restaurantId);

}

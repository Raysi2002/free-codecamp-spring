package com.raysi.springrestfulapi.enitity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Orders {
    Integer productId;
    String productName;
    String orderName;
    Integer quantity;
}

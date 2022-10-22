package com.example.addToMyCart.Entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="cart")
public class Cart {
  @Id
  @GeneratedValue
  private long id;

  private UUID userId;
  private UUID productId;

  public Cart() {
    super();
    // TODO Auto-generated constructor stub
  }
  public Cart(long id, UUID userId, UUID productId) {
    super();
    this.id = id;
    this.userId = userId;
    this.productId = productId;
  }
  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public UUID getUserId() {
    return userId;
  }
  public void setUserId(UUID userId) {
    this.userId = userId;
  }
  public UUID getProductId() {
    return productId;
  }
  public void setProductId(UUID productId) {
    this.productId = productId;
  }
}

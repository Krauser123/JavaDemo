package springboot.api.demo;

public class Product {
public Product() {}

public int Id;
public String Title;
public float Price;


public Product(int id, String title, float price) {
    this.Id = id;
    this.Title = title;
    this.Price = price;
  }
}
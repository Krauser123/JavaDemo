package springboot.api.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
@RequestMapping("/api")
public class ProductController {
 
 @GetMapping("/products")
 public List<Product> getAllProducts() {
  final List<Product> productList = new ArrayList<Product>();

  //Create instance of Random class
  Random rand = new Random();
  
  //Add product to list
  productList.add(new Product(1, "Computer", rand.nextInt(1000)));
  productList.add(new Product(1, "Computer Screen", rand.nextInt(300)));
  productList.add(new Product(1, "Keyboard", rand.nextInt(200)));
  productList.add(new Product(1, "Power Supply", rand.nextInt(150)));

  return productList;
 } 
}
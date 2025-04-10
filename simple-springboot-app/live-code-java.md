Question 1:

Write a Java function that returns the first non-repeating character in a string. (e.g. input: "swiss" → output: "w")

Question 2: 

Given a list of User objects, return the list of emails of users who are older than 18 using Java Stream.

[
  {
    "name": "Alice",
    "email": "alice@example.com",
    "age": 22
  },
  {
    "name": "Bob",
    "email": "bob@example.com",
    "age": 17
  },
  {
    "name": "Charlie",
    "email": "charlie@example.com",
    "age": 30
  }
]


Question 3: 

- Write a REST API (/products) that returns list of products
- Write a REST API (/product/{id}) that return detail of a product by id

https://fakestoreapi.com/products
https://fakestoreapi.com/products/1

Question 4: 

Write all unit test cases for DiscountService.calculateDiscount method.

public class DiscountService {
    public double calculateDiscount(double totalAmount, String customerType) {
        if (totalAmount < 0) {
            throw new IllegalArgumentException(""Amount must be positive"");
        }

        if (""VIP"".equals(customerType)) {
            return totalAmount * 0.2;
        } else if (""REGULAR"".equals(customerType)) {
            return totalAmount * 0.1;
        } else {
            return 0;
        }
    }
}

Question 1: Using https://sqliteonline.com/

Write a SQL query to get the list of all users and the total amount they’ve spent. If a user doesn’t have any orders, the default total amount is 0.

users(id, name, email)
orders(id, user_id, order_date, total_amount)

Question 2: Using https://sqliteonline.com/

Write a SQL query to get the top 5 products with the highest total sales amount.

products(id, name)
order_items(id, product_id, quantity, price)

Question 3:

Assume you have a collection of users in MongoDB:

{
  "_id": ObjectId("..."),
  "name": "Alice",
  "age": 25,
  "email": "alice@example.com",
  "active": true
}

Write the MongoDB queries to find all users older than 18 who are active and count how many users are active.

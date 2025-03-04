Movie Review API

A RESTful API built with Java, Spring Boot, and PostgreSQL that allows users to create, read, update, and delete movie reviews.

Live API
Base URL:
https://moviereview-api-t396.onrender.com/reviews

Features
Full CRUD (Create, Read, Update, Delete) operations

Integration with PostgreSQL database

Tech Stack
Backend: Java, Spring Boot
Database: PostgreSQL
Containerization: Docker
Deployment: Render (Backend), Railway (Database)

You can test the API using either cURL commands (as shown below) or Postman.

Testing with Postman
Open Postman.
For each endpoint, follow the instructions below:
Set the HTTP method (GET, POST, PUT, DELETE).
Enter the URL (https://moviereview-api-t396.onrender.com/reviews).
For POST and PUT requests, include the request body in JSON format.

1. Get All Reviews
Request (cURL):

curl -X GET https://moviereview-api-t396.onrender.com/reviews

Request (Postman):

Set the method to GET.
URL: https://moviereview-api-t396.onrender.com/reviews.

Response:
A list of all movie reviews in JSON format.

2. Add a New Review

Request (cURL):

curl -X POST BaseURL/reviews \
     -H "Content-Type: application/json" \
     -d '{
           "movieTitle": "Put movie title here",
           "reviewText": "Put review text here",
           "rating": 9
         }'

Request (Postman):

Set the method to POST.
URL: https://moviereview-api-t396.onrender.com/reviews.
Set the body to raw and JSON format:

{
  "movieTitle": "Put movie title here",
  "reviewText": "Put review text here",
  "rating": 9
}

Response:


{
  "id": 1,
  "movieTitle": "Put movie title here",
  "reviewText": "Put review text here!",
  "rating": 9
}
3. Get a Review by ID

Request (cURL):

curl -X GET BaseURL/{enter id number here without curly braces}

Request (Postman):
Set the method to GET.

Response:
The review with the specified ID in JSON format.

4. Update a Review
Request (cURL):


curl -X PUT BaseURL/{enter id number here without curly braces} \
     -H "Content-Type: application/json" \
     -d '{
           "movieTitle": "Put movie title here",
           "reviewText": "Put review text here",
           "rating": 10
         }'
Request (Postman):

Set the method to PUT.
URL: BaseURL/reviews/1.
Set the body to raw and JSON format:

{
  "movieTitle": "Put movie title here",
  "reviewText": "Put review text here",
  "rating": 10
}
Response:
Updated review in JSON format.

5. Delete a Review
Request (cURL):

curl -X DELETE BaseURL/{enter id number here without curly braces}

Request (Postman):

Set the method to DELETE.
URL: BaseURL/{enter id number here without curly braces}.
Response:
Confirmation that the review was deleted successfully.

How to Run Locally
Clone the repository.
Make sure you have Java and PostgreSQL installed.
Set up your PostgreSQL database and configure the connection in application.properties.
Run the application using your IDE or by executing:

./mvnw spring-boot:run
The API will be available at http://localhost:8080.

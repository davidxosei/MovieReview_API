Movie Review API
A RESTful API built with Java, Spring Boot, and PostgreSQL that allows users to create, read, update, and delete movie reviews.

Live API
Base URL:
https://moviereview-api-t396.onrender.com

Features
Full CRUD (Create, Read, Update, Delete) operations
Integration with PostgreSQL database
Deployed and accessible online
Built with Java and Spring Boot
Tech Stack
Backend: Java, Spring Boot
Database: PostgreSQL
Containerization: Docker
Deployment: Render (Backend), Railway (Database)
Quick Start (Test the API)
You can test the API using either cURL commands (as shown below) or Postman.

Testing with Postman
Open Postman.
For each endpoint, follow the instructions below:
Set the HTTP method (GET, POST, PUT, DELETE).
Enter the URL (e.g., https://moviereview-api-t396.onrender.com/reviews).
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


curl -X POST https://moviereview-api-t396.onrender.com/reviews \
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
json
Copy
{
  "movieTitle": "Put movie title here",
  "reviewText": "Put review text here",
  "rating": 9
}
Response:

json
Copy
{
  "id": 1,
  "movieTitle": "Put movie title here",
  "reviewText": "Put review text here!",
  "rating": 9
}
3. Get a Review by ID
Request (cURL):


curl -X GET https://moviereview-api-t396.onrender.com/reviews/1
Request (Postman):

Set the method to GET.
URL: https://moviereview-api-t396.onrender.com/reviews/1.
Response:
The review with the specified ID in JSON format.

4. Update a Review
Request (cURL):


curl -X PUT https://moviereview-api-t396.onrender.com/reviews/1 \
     -H "Content-Type: application/json" \
     -d '{
           "movieTitle": "Put movie title here",
           "reviewText": "Put review text here",
           "rating": 10
         }'
Request (Postman):

Set the method to PUT.
URL: https://moviereview-api-t396.onrender.com/reviews/1.
Set the body to raw and JSON format:
json
Copy
{
  "movieTitle": "Put movie title here",
  "reviewText": "Put review text here",
  "rating": 10
}
Response:
Updated review in JSON format.

5. Delete a Review
Request (cURL):


curl -X DELETE https://moviereview-api-t396.onrender.com/reviews/1
Request (Postman):

Set the method to DELETE.
URL: https://moviereview-api-t396.onrender.com/reviews/1.
Response:
Confirmation that the review was deleted successfully.

How to Run Locally
Clone the repository.
Make sure you have Java and PostgreSQL installed.
Set up your PostgreSQL database and configure the connection in application.properties.
Run the application using your IDE or by executing:

./mvnw spring-boot:run
The API will be available at http://localhost:8080.

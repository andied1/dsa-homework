HW 5

Project Description: Using SpringBoot to create a REST API to interact with different HTTP requests and having the proper methods to interact with them. Creating and using different endpoints of Get, Get ID, Post, Put ID, Delete ID. In this case, we are focusing on tasks related on the campus, this can be homework or just any related tasks on campus, and users can input their tasks like a task manager that shows up on the webpage.

How to run application: Right click CampusTaskboardApplication.java, or in the terminal copy and paste
cd campus-taskboard
./mvnw spring-boot:run

Endpoint Documentation
GET        /api/tasks               Returns all tasks
GET{id}    /api/tasks/{"id"}        Returns task by ID
POST       /api/tasks               Create a task
PUT{id}    /api/tasks/{"id"}        Update a task by ID
DELETE{id} /api/tasks/{"id"}        Delete a task by ID

Video Link: https://www.youtube.com/watch?v=lScJvim_jNI
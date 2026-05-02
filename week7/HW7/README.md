HW 7

Project Description: Using SpringBoot in java, using our previous Spring, we can create delete, edit tasks. Now we have better structuring with additional files to handle inputs, implementing global exception handling, creating custom exceptions, DTOs, soft delete, request logging, error codes

How to run application: Right click CampusTaskboardApplication.java, or in the terminal copy and paste
cd campus-taskboard
mvn spring-boot:run

Endpoint Documentation
GET        /api/tasks                       Returns all tasks
GET{id}    /api/tasks/{"id"}                Returns task by ID
POST       /api/tasks                       Create a task
PUT{id}    /api/tasks/{"id"}                Update a task by ID
DELETE{id} /api/tasks/{"id"}                Delete a task by ID


GET        /api/tasks/completed             Returns completed tasks
GET        /api/tasks/incomplete            Returns incomplete tasks
GET        /api/tasks/priority/{priority}   Returns priority section with specificed priority
GET        /api/tasks/search                Returns tasks searched by specificed keywords in the title
GET        /api/tasks/paginated             Returns paginated, sorted tasks with default pagination data or custom

POST 


Video Link: https://www.youtube.com/watch?v=M0C7SYUuol8
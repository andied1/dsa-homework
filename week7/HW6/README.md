HW 6

Project Description: Using SpringBoot to create a REST API to interact with different HTTP requests and having the proper methods to interact with them. Creating tasks, and displaying them well with JPA and H2 database provided by Spring. We also get support with method naming, entity, data table, data organizaiton, pagination, filtering, and custom queries. Different operations also supported which reduces our need for complex SQL coding which the data base tools are already provided in Spring like method naming, creating custom queries without SQL complexity.

How to run application: Right click CampusTaskboardApplication.java, or in the terminal copy and paste
cd campus-taskboard
./mvnw spring-boot:run

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

Video Link: https://www.youtube.com/watch?v=SPg_1N3_q1M
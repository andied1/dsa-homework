HW 8

Project Description: Using SpringBoot in java, using our previous Spring, we have created a task manager. For this, we have implemented security for our backend, and CORS, authenicating and checking requests first through security before reaching backend, where the severity and vulnerability of our build is, with all our project, endpoints, APIs are located. CORs allows us to connect to our frontend with a different port, so our backend can still allow request, just with a layer of protection. We also implemented api versioning which we can easily switch between different versions to tests, and implement even more to the backend in the future without more issues occuring for the users.

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


Video Link: 
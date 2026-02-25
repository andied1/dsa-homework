Student - Object on what a Student is
StudentManager - Manages student lists, adding, removing, filtering by gpa
StudentManagementSystemMain - Whole execution of code, demonstrating all classes
ReportGenerator - For student, course, major, honor roll reporting a list

Course - Object on what a course is, especially what students will be going into
CourseManager - Manages courses lists, adding, removing, filtering

Enrollment - Object on what enrollment is
EnrollmentManager - Manages enrollment list, enrolling students into courses along with some requirements

ArrayListOperationsDemo - Showcases Array and ArrayList along with their methods, what you can do with one
ArrayListVsArrayDemo - Showcases Array and ArrayList and their performance in adding 10000 objects, accessing 1000 objects
ArrayListUtils - Class with generic methods, utilities used with any type

GenericList - Wraps ArrayLists, adding on generics with ArrayList for type safety
GenericStack - Data structure in generics, adding methods which can add to top, remove top and return, and return top of an ArrayList
GenericQueue - Queue structure in generics, adding methods which adds to back, remove and return front, and returns front of an ArrayList
Pair - Creates a pair of any two data types, and can be implemented easily

To compile and run: Go into the StudentManagementSystemMain to see the full results of code, for other classes like the demos which
might contain another main in them, go to the java class for them and compile those codes. Some parts are comments and some you can remove
which I already put the input in, but you can remove comment to test out some different parts

Design Decisions: For get's, set's, I made them into one line, or anything that just requires one line like a return or setting. 
For printing all, I printed students in a format of ID, student, year, major, gpa, printed each courses, and enrollments out too.

Challenges Encountered: getAvailableCourses was difficult for me, I did not know how prerequisite and all worked that much. Wildcard too was
little confusing but I somewhat understand it now. Some parts of manager methods was little difficult too, like for enrolling students I made it
so I got a constant ID generating which I had online help with too since I did not know what ID to put for them. Some parts of generic data
structure too but I understand a bit now after.

ArrayList vs Generics: For ArrayList and Generics, I would say they work well with each other, and that ArrayList is pretty much apart of
generics in terms of data structures, formulating methods, the data types. Generics helps with ArrayList in the different objects and types
along with the methods behind it.

ArrayList vs Array: For array, it is just a fixed size so whatever you declared before you will need to work with it the rest of the code.
Adding students in arraylist takes longer than an array, but accessing students within an arraylist is faster than an array. ArrayList is also
good for a flexible size of elements and better with handling more versitatile data types outside of primitive data types


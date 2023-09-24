# TechJobs, OO Edition Autograded Rubric for Java 17

For [this assignment](https://education.launchcode.org/java-web-development/assignments/tech-jobs-oo.html), the students were asked to refactor a version of the TechJobs Console assignment to make the code object-oriented and to add some unit testing.

Students will complete the assignment by:
* finishing portions of a few classes
* writing unit tests in a TDD fashion
* using abstraction and inheritance strategically by refactoring the classes.


## Unit Tests
 
The starter code contains 6 unit test classes.  Each class contains tests for each main task of the assignment.  This allows students to run tests upon completion of a task before moving on to the next one.
 
`TestTaskTwo` verifies that students completed the `Location`, `CoreCompetency`, and `PositionType` classes.

`TestTaskThree` verifies that students created the `jobClass` and that it uses the other classes correctly to create `job` objects.  

`TestTaskFour` verifies students' unit tests exist within the application.  

`TestTaskFive` tests the unit tests the students created for their custom `ToString` method.  

`TestTaskSix` verifies that students used proper inheritance between `Location`, `Employer`, `CoreCompetency`, `PositionType` and `JobField`.  For example, `Employer` should extend `JobField`.  These tests focus on the existance of the extension rather than the behavior of the extension. 

`AbstractTest` verifies the behavior of the DRY code.  

Submission cannot be graded on unit tests alone.  The tests will provide answers to the code checks below, but should not replace a live demo.  Use the section below as a guide for what to look for in a student's submission and how to provide feedback.

### Troubleshooting Autograded Assignments

#### Student Output Matches the Example, But the Code Failed the Tests

* What does the test actually output say?
* Check for any extra or missing characters such as spaces, new lines, etc.
* Do all variable/method/etc names match what was presented in the textbook?
* Did they run all the tests or the ones for the section in question?
* Did they change a file that the instructions did not direct them to change?
* Do they need a break?

#### The Tests Passed, But Shouldn’t Have

* Does the code actually pass the test(s)?
* If the code is bad, have a student explain their code to you
* Ask for a demo and provide a new test case


## Score your students' work based on the following criteria:
 
### Code check: 

The autograding tests will verify the answers to these checks.  If you ask a student to demo their assignment in real-time, these checks could be useful areas to verify overall functionality.  Have them create a new `job` object and make sure it behaves as expected.  
 
1. Has the student made an abstract `JobField` class?
   1. Does the class programmatically assign a new ID for each instance?
   1. Do `CoreCompetency`, `Employer`, `Location`, and `PositionType` extend from `JobField`?
   1. Does `JobField` contain getters and setters for the value field?
   1. Does `JobField` contain only a getter for the `id` field? If the student has included a setter for this field, ask them why, or remind them why this is not a good practice.
   1. Does `JobField` contain a custom `toString()` method that returns an object's `value` field?
   1. Does `JobField` contain custom `equals()` and `hashCode()` methods?

1. Has the student written the constructors for the `Job` class?
   1. Does the default constructor programmatically assign a new ID to each instance?
   1. Is there another constructor that calls the default and initializes a new object with the `JobField` subclasses as its parameters?
   1. Does it contain appropriate getters and setters? `nextID` and `id` should not have setters. `nextID` should also not have a getter.
   1. Does it contain custom `toString()`, `equals()`, and `hashCode()` methods?

1. Has the student written appropriate unit tests?
   1.  Do they test the default `Job` constructor? The parameterized constructor?
   1.  Do they test the custom `equals()` method of `Job`? `toString()`?
  
## Feedback and Grades:
  
As always, offer feedback to the students if they have not completed all of the code
check items. If the output matches what is expected, make sure it is the result of
printing the `Job` object. Give the student a 1/1 score if they have met the requirements,
or leave comments on areas that need to be re-addressed.
 
The goal of the assignment is to reinforce object-oriented coding and best practices.
Ask them about their experience extending `JobField`, for example. Do they have
an understanding of why this is a good idea or what benefits this offers?

### Appearance and Output:
 
Expected output from hardcoded job data:
 
```
ID: 1
Name: Product tester
Employer: ACME
Location: Desert
Position Type: Quality control
Core Competency: Persistence
 
 
ID: 2
Name: Web Developer
Employer: LaunchCode
Location: St. Louis
Position Type: Front-end developer
Core Competency: JavaScript
 
 
ID: 3
Name: Ice cream tester
Employer: Data not available
Location: Home
Position Type: UX
Core Competency: Tasting ability
```
 
Does the hardcoded job data in `Main` print when the application is run?
 
Will an additional job be printed with a unique ID? Ask the student to create a new
`Job` object in Main. Verify that it gets printed with a unique ID.

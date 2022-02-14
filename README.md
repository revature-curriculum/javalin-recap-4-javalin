## Javalin Recap 4
---
### Description
In this exercise, you will create a Javalin web application that will list Exam objects and display statements based on their scores.

---
### Steps

1. In `src -> main -> java -> objects -> Exam.java` 
   1. Create the required fields (see sample output to think of the fields required).
   2. Create the required methods (setters and getters).
   3. Create a constructor.
2. In `src -> main -> java -> Main.java` create an ArrayList of Exams. 
3. Create the required routes and handlers.
   1. Route and handler for exam.jte.
4. In `src -> main -> jte -> index.jte` create a link to the route leading to exam.jte
5. In `src -> main -> jte -> exam. jte`, create a for loop with an if statement checking the score of each exam and an associated print out.
6. Remember to write the code the receive the arraylist parameter.

---

### Sample Output in HTML

```html
<p>Ashoka's score is 85, grade is B</p>

<p>Brittany's score is 79, grade is C</p>

<p>Nancy's score is 97, grade is A</p>

<p>Ed's score is 50, grade is F</p>
```


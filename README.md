# <center> Software Quality Assurance Final CA </center>

## <center> Scrum Sprint Backlog and Task Estimation </center>

---

<br />

For this assignment I used Fibonacci Sequence for Story Point Estimation. The Fibonacci sequence is a number sequence where every number is the sum of the previous two numbers, i.e. 0, 1, 2, 3, 5 etc. 

<br />

|Item | Task | Owner | Point Estimation |
| --- | ---  |  ---  |     ---      |
|  1  | Create Controller | Eugene McCormack | 1 |
|  2  | Create Class Models (Rubric, Subject, Student) | Eugene McCormack | 1 |
|  3  | Setup Menu System to Allow Navigation | Eugene McCormack | 1 |
|  4  | Implement Method to Create New Rubric | Eugene McCormack | 2 |
|  5  | Create Test for Method to Create New Rubric | Eugene McCormack | 3 |
|  6  | Implement Method to Create New Student| Eugene McCormack | 2 |
|  7  | Create Test for Method to Create New Student | Eugene McCormack | 3 |
|  8  | Implement Method to Create New Subject and Add to a Grade| Eugene McCormack | 2 |
|  9  | Create Test for Method to Create New Subject | Eugene McCormack | 3 |
|  10  | Create Method to View All Rubric's | Eugene McCormack | 1 |
|  11  | Create Method to View a  Specified Rubric Via Name | Eugene McCormack | 1 |
|  12  | Implement Method to Retrieve All Student's Grades and Display Average Grade| Eugene McCormack | 3 |
|  13  | Implement Method to Retrieve All Student's Grades and Display Standard Deviation of Grades| Eugene McCormack | 3 |
|  14  | Implement Method to Retrieve All Student's Grades and Display Max / Min Grade| Eugene McCormack | 1 |
|  15  | Create Test for Students Grades, Average, Standard Deviation and Max / Min | Eugene McCormack | 5 |
|  16  | Implement Method to Retrieve Specified Criterion of a Rubric and Display the Average, Standard Deviation and Max / Min Grade| Eugene McCormack | 2 |

<br />

---
## <center> Velocity </center>
---

<br/>

Velocity is a measurement of the work that can be completed during a Sprint and is a key metric in Scrum. Velocity is calculated at the end of a Sprint and is summed up by adding up the Points of the User Stories. In the above Sprint, the Velocity of this Sprint = 34. Story Points are created to measure the size, complexity, and length it will take to complete the User Story. 

<br/>

Velocity is a team metric and should only consider the team???s performance and not an individual???s basis. Bug Fixes should also not be account for when calculating Velocity.


<br/>

---
## <center> Story Point Reasoning </center>
---

<br/>

As this assignment is not too complex and I have previously implemented some of the above features in past projects this allowed me to provide these estimations. I estimated "Item 5" above "Create Test for Method to Create New Rubric" with a Point Estimation of "3" as I have only conducted a few JUnit tests previously. I expect ???Item 5??? to take longer than "Item 4 - "Implement Method to Create New Rubric" with a Point Estimation of "2" as I have previously implanted this feature before and am confident this should not take as long. I suspect the main tasks that will take the longest are the tasks that I am somewhat unfamiliar with e.g. Testing.

<br/>

Also I estimated  ???Item 13 - Implement Method to Retrieve All Student's Grades and Display Standard Deviation of Grades??? with a Point Estimation of ???3??? as I am unsure how this will pan out. In contrast ???Item 14 - Implement Method to Retrieve All Student's Grades and Display Max / Min Grade??? with a Point Estimation of ???1??? should not take too long as this should be a simple call of Max/Min to the ArrayList items / Collections. 

<br/>

---
## <center> Unit Testing and Test-Driven Development </center>
---

<br/>

A number of tests were completed over the course of this assignment relating to the creation of classes and tests for these classes to ensure they were functioning correctly. I also conducted tests for all the calculations for the Students Grading Summary. These tests proved useful as they allowed me to fully test the methods implemented for the calculations. 

<br/>

The following is a [Link](https://github.com/eugenemccormack/Software_Quality_Assurance_Final_CA/pull/19/files) to an example of a test conducted on Student Standard Deviation using Junit.

<br/>

A downside to the Standard Deviation Test Case was the fact that the user is required to input the "assertEquals" value e.g. what the result should be for the Test Case. This could be incorrectly inputted skewing the output for the Test Case. To combat this I used multiple online Standard Deviation Calculators to ensure the general consensus was correct. I noticed a lot of online Standard Deviation calculators only got the Variance, which is partially correct, but this is required to be Squared to get the Standard Deviation.

<br/>

The JUnit Test Case was useful as it helped me to identify errors within my code whilst calculating the Standard Deviation of which I made the correction after the Test Case Failed. After the correction the test Passed.

<br/>

---
## <center> Test Coverage Metric </center>
---

<br/>

EclEmma Coverage Tool is a built in Plugin for Eclipse IDE which demonstrates the code been utilised when engaging test sequences via JUnit Test Cases. EclEmma Coverage Tool allows the user to identify redundant / errors within their deployment. EclEmma Coverage Tool is an extermimally powerful tool that can enable a coder to be more efficient with the deployment of Software.

<br/>

The following are links to examples of how I utilised EclEmma before Commits to ensure my code was functioning correctly and efficiently:

<br/>

* [Classes Coverage](https://github.com/eugenemccormack/Software_Quality_Assurance_Final_CA/pull/11)

* [Average Grade Calculation Coverage](https://github.com/eugenemccormack/Software_Quality_Assurance_Final_CA/pull/15)

* [Min / Max Grade Calculation Coverage](https://github.com/eugenemccormack/Software_Quality_Assurance_Final_CA/pull/16)

* [Total Grade Calculation Coverage](https://github.com/eugenemccormack/Software_Quality_Assurance_Final_CA/pull/17)

* [Standard Deviation Grade Calculation Coverage](https://github.com/eugenemccormack/Software_Quality_Assurance_Final_CA/pull/19)


<br/>

---
## <center> Team Version-Control  </center>
---

<br/>

As part of the Version-Control process I created a Branch for every new feature for the assignment. Before working on a new feature I would checkout the Develop Branch, Pull from the Develop Branch to ensure I have the most up-to-date code / enhancements and then create a new Branch off the Develop Branch for my feature. This ensured I was working on a newly created Branch that would not affect the Develop Branch when Pushing and helped to organise the project setup.

<br/>

After completion of the new feature I would Test, Save, Stage, Commit with an explanation of my work and then Push via Eclipse. 

<br/>

This would then create a Pull Request via GitHub of which I would assign it to be Merged into the Develop Branch upon review. 

<br/>

The following is a link to all the Branches I created:

<br/>

* [GitHub Branches](https://github.com/eugenemccormack/Software_Quality_Assurance_Final_CA/branches/all)

<br/>

---
## <center> Code-Review Checklist  </center>
---

<br/>

For every Pull Request I played Devil???s Advocate and commented on all the Pull Request Reviews stating changes that should be made before Merging into the Develop Branch.

<br/>

The following are example of this:

* [23 Pull Requests](https://github.com/eugenemccormack/Software_Quality_Assurance_Final_CA/pulls?q=is%3Apr+is%3Aclosed)

On Pull Request #6 I accidentally Merged into the Develop Branch instead of Menu Branch. This happen because I was working on the Develop Branch and forgot to Checkout to the newly created Branch "Menu".

<br/>

This caused major issues as I tried to "Revert" the Pull Request however because this Pull Request was not fully Staged it knocked the Branches out of Sync.

<br/>

To fix this issue I had to Reset -> Hard then Fetch & Rebase the Branch which corrected this issue and allowed me to Commit again successfully. 


<br/>

---






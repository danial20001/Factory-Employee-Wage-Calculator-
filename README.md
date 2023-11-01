# Factory-Employee-Wage-Calculator-

**Introduction**
 The Cake Factory Employee Wage Calculator is a Java program designed to calculate the wages of employees in a cake factory. The program considers the number of cakes covered, the number of cakes added, and the number of wrong cakes. The program also distinguishes between regular employees and Quality Controllers (QCs) and calculates their wages accordingly.
Objective
The main objective of this project is to accurately calculate the wages of employees, considering their roles and performances. The program also aims to display the employees' information in a sorted manner based on the number of cakes covered and their names.

**Classes**
 The project is divided into four main classes: Employee, Quality Controller, Team, and Main.
Employee: This class represents a regular employee with attributes like name, cakes covered, and wage. It contains methods to validate input, calculate wages, and override the toString method for custom output formatting.
QualityController: This class inherits from the Employee class and represents a Quality Controller employee. It overrides the calculateWage method to apply a 12% raise to the base wage for QCs.
Team: This class manages a list of employees and provides methods to add employees, calculate total wages, calculate total cakes, sort employees, and display employee information.
Main: The main class contains the main method that creates a Team object, adds employees to the team, and calls the method to sort and display employees.

**Testing:**
A comprehensive testing strategy was employed for this project, with JUnit tests covering the main class constructs focusing on wage calculations, input validation, and sorting functionality. The testing is divided into 3 test files, each testing a different class with the main constructors on its own while using employees added for the specific scenario to test properly. The following table summarizes the test cases for the project:
Test Case Description	Expected Result	Actual Result
Wage calculation for cakes covered < 50	4.90	4.90
Negative addedCakes exception	IllegalArgumentException	IllegalArgumentException
Wage calculation for a valid input	29.60	29.60
QualityController wage calculation	21.00	21.00
Adding an employee to the team	Total cakes = 49	Total cakes = 49
Calculating total wages	Total wages = 74.55	Total wages = 74.55
Calculate total cakes	Total cakes = 547	Total cakes = 547
During the testing phase, there was 1 unexpected result:
 
The original sorting formula had an error because it used .reversed() after thenComparing(Employee::getName), causing the names to be sorted in reverse alphabetical order when the cake counts were the same. By removing the .reversed() from this part of the formula, the names are now sorted in the correct alphabetical order while still maintaining the descending order of the cakes covered.
public void sortEmployees() {
    employees.sort(Comparator.comparingInt(Employee::getCakesCovered).reversed()
            .thenComparing(Employee::getName));
}

Please open the testing files inside the /src repository to view all the tested constructors.


**Reflection and Critique:**
Although the code is highly optimized, it lacks additional features that the client might find useful.
•	GUI: Instead of having to open every single java file, which may be difficult for a regular user, a user interface should have been introduced to make it easier for the user to add and view new employees. The app requires UI improvement and is not user appealing.
•	To test some more uncommon occurrences, such as what happens if the wrong cakes are greater than the cakes covered, will the employee owe money to the company? More thorough testing may be necessary. There are an endless number of potential events when the test scenario is pushing the software to its limit.
•	More thorough input validation: Although the current input validation makes sure that names aren't empty and that numerical inputs aren't negative, more validation could be added to make sure that names are within a certain character limit or that they only contain specific characters (like letters and spaces).

Despite not being user-friendly, the code generally follows the rules and checks all client requirements without introducing any new features. The codebase also follows the main principles of Object-Oriented Programming (OOP) encapsulation, inheritance, and polymorphism. Improvement can be done by adding JavaFX functionality to improve the program.

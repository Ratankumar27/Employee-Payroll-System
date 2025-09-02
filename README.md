<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>Employee Payroll System (EPRS)</h1>

   <p>
        A simple Java-based <strong>Employee Payroll System</strong> that demonstrates 
        <strong>Object-Oriented Programming (OOP)</strong> concepts such as 
        <em>abstraction, inheritance, polymorphism,</em> and <em>encapsulation</em>.
    </p>

  <p>
        This project manages both full-time and part-time employees, allowing you to calculate 
        salaries, add/remove employees, and display employee details.
    </p>
    <h2>📌 Features</h2>
    <ul>
        <li>Add new employees (Full-Time / Part-Time).</li>
        <li>Remove employees by their unique ID.</li>
        <li>
            Calculate salary based on:
            <ul>
                <li><strong>Full-Time Employees</strong> → Fixed monthly salary.</li>
                <li><strong>Part-Time Employees</strong> → Based on hours worked × hourly rate.</li>
            </ul>
        </li>
        <li>Display all employees with details (ID, Name, Salary).</li>
        <li>Demonstrates usage of:
            <ul>
                <li>Abstract classes</li>
                <li>Method overriding</li>
                <li>Collections (<code>ArrayList</code>)</li>
            </ul>
        </li>
    </ul>

    EPRS/
│── Main.java               # Entry point of the program
│── Employee.java           # Abstract base class for all employees
│── FullTimeEmployee.java   # Class for full-time employees
│── PartTimeEmployee.java   # Class for part-time employees
│── PayRollSystem.java      # Manages employee list (add/remove/display)

</body>
</html>

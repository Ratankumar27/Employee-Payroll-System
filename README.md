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

 <pre>
EPRS/
│── Main.java               # Entry point of the program
│── Employee.java           # Abstract base class for all employees
│── FullTimeEmployee.java   # Class for full-time employees
│── PartTimeEmployee.java   # Class for part-time employees
│── PayRollSystem.java      # Manages employee list (add/remove/display)
  </pre>

 <h2>⚙️ How It Works</h2>
  <p>Employees are created and added to the payroll system.</p>
  <p>Salaries are calculated using the <code>calculateSalary()</code> method (overridden in subclasses).</p>
  <p>The payroll system allows:</p>
  <ul>
    <li>Adding employees</li>
    <li>Removing employees by ID</li>
    <li>Displaying the current employee list</li>
  </ul>
<h2>📖 Concepts Covered</h2>
  <ul>
    <li><strong>Abstraction</strong> → Using an abstract <code>Employee</code> class.</li>
    <li><strong>Inheritance</strong> → <code>FullTimeEmployee</code> and <code>PartTimeEmployee</code> extend <code>Employee</code>.</li>
    <li><strong>Polymorphism</strong> → Overriding <code>calculateSalary()</code> in subclasses.</li>
    <li><strong>Encapsulation</strong> → Private fields with public getters.</li>
    <li><strong>Collections</strong> → Managing employees with <code>ArrayList</code>.</li>
  </ul>
</body>
</html>

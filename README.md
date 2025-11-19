# Student Database Management System in Java

### Project Description:

This project is a Student Database Management System implemented in Java using Object-Oriented Programming (OOP) concepts. It allows users to manage student records efficiently by adding, viewing, updating, and deleting student details.

---

## Features
- Add new student records with details like ID, Name, Age, Course, and Marks.
- View all students' information in a structured format.
- Update existing student records by Student ID.
- Delete student records by Student ID.
- Demonstrates OOP concepts like:
  
  **1. Encapsulation:** Secure storage of student details using private fields and getters/setters.

  **2. Inheritance:** Person class is extended by Student and Teacher classes.

  **3. Polymorphism:** Method overloading and overriding for displaying student information.

  **4. Abstraction:** DatabaseOperations interface defines common database operations.

 ---

 ## Classes & Structure

 - **Person** –  Base class containing common attributes like name and age.

- **Student** –  Extends **Person**; includes student ID, course, marks, and methods to display info.

- **Teacher** –  Extends **Person**; includes subject and overrides displayInfo().

- **StudentDatabase** –  Implements DatabaseOperations; manages a list of students.

- **DatabaseOperations** –  Interface defining CRUD operations for student records.

- **StudentManagementSystem** –  Main class with a console menu to interact with the system.

---

## Folder Structure

```bash
StudentDBMS/
│
├── src/
│   ├── Person.java
│   ├── Student.java
│   ├── Teacher.java
│   ├── StudentDatabase.java
│   ├── DatabaseOperations.java
│   └── StudentManagementSystem.java
│
├── README.md
└── .gitignore
```

---

## ▶️ How to Run

#### 1️⃣ Clone the repository:
   ```bash
   git clone https://github.com/Shilpask123/StudentDBMS.git
```

#### 2️⃣ Open in your IDE:
Open the cloned folder in IntelliJ IDEA or Eclipse.

#### 3️⃣ Run the program:
Run the **StudentManagementSystem.java** file. Follow the console instructions to Add, View, Update, or Delete student records.

---

## 🧾 Sample Output

```bash
===== Student Database Management System =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter choice: 1
Enter Student ID: 41
Enter Name: Shilpa
Enter Age: 16
Enter Course: CS
Enter Marks: 87
Student added successfully!

===== Student Database Management System =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter choice: 1
Enter Student ID: 45
Enter Name: Ajay
Enter Age: 17
Enter Course: E and C
Enter Marks: 90
Student added successfully!

===== Student Database Management System =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter choice: 2
---------------
Student ID : 41
Name       : Shilpa
Age        : 16
Course     : CS
Marks      : 87.0
---------------
---------------
Student ID : 45
Name       : Ajay
Age        : 17
Course     : E and C
Marks      : 90.0
---------------

===== Student Database Management System =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter choice: 3
Enter Student ID to Update: 46
Enter New Name: Roopa
Enter New Age: 18
Enter New Course: IT
Enter New Marks: 87
Student ID not found!

===== Student Database Management System =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter choice: 3
Enter Student ID to Update: 41
Enter New Name: Roopa Kambale
Enter New Age: 18
Enter New Course: IT
Enter New Marks: 89
Student updated successfully!

===== Student Database Management System =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter choice: 2
---------------
Student ID : 41
Name       : Roopa Kambale
Age        : 18
Course     : IT
Marks      : 89.0
---------------
---------------
Student ID : 45
Name       : Ajay
Age        : 17
Course     : E and C
Marks      : 90.0
---------------

===== Student Database Management System =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter choice:1
Enter Student ID: 67
Enter Name: Shilpa K
Enter Age: 16
Enter Course: CS
Enter Marks: 87
Student added successfully!

===== Student Database Management System =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter choice: 2
---------------
Student ID : 41
Name       : Roopa Kambale
Age        : 18
Course     : IT
Marks      : 89.0
---------------
---------------
Student ID : 45
Name       : Ajay
Age        : 17
Course     : E and C
Marks      : 90.0
---------------
---------------
Student ID : 67
Name       : Shilpa K
Age        : 16
Course     : CS
Marks      : 87.0
---------------

===== Student Database Management System =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter choice: 4
Enter Student ID to Delete: 67
Student deleted successfully!

===== Student Database Management System =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter choice: 2
---------------
Student ID : 41
Name       : Roopa kambale
Age        : 18
Course     : UT
Marks      : 89.0
---------------
---------------
Student ID : 45
Name       : Ajay
Age        : 17
Course     : E and C
Marks      : 90.0
---------------

===== Student Database Management System =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter choice: 5
Exiting program...
```

---

## Technologies Used

- Java 8+
- Object-Oriented Programming (OOP) concepts
- Console-based user interface

---

## Learning Outcomes

- Implement CRUD operations using Java Collections (ArrayList).
- Apply OOP principles: Encapsulation, Inheritance, Polymorphism, Abstraction.
- Design a modular and maintainable Java application.
- Understand how to manage student data efficiently.

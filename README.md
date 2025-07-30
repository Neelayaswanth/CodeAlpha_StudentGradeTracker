# CodeAlpha_StudentGradeTracker

## 🎓 Student Grade Tracker - Java Console Application

A comprehensive Java console application for managing student grades with statistical analysis capabilities.

## 📋 Project Overview

This project is part of the **CodeAlpha Internship Program**. The Student Grade Tracker is a robust console-based application that allows users to:

- Add and manage student records
- Input and track individual student grades
- Calculate statistical metrics (average, highest, lowest scores)
- Generate comprehensive summary reports
- Handle data validation and error scenarios

## ✨ Features

### Core Functionality
- **Student Management**: Add new students with unique names
- **Grade Tracking**: Add multiple grades per student (0-100 range)
- **Statistical Analysis**: Calculate average, highest, and lowest grades
- **Summary Reports**: View comprehensive reports for all students
- **Data Validation**: Robust input validation and error handling

### Technical Features
- **Object-Oriented Design**: Clean separation of concerns with Student and Main classes
- **Data Structures**: Uses ArrayLists for efficient data management
- **Error Handling**: Try-catch blocks for InputMismatchException
- **User-Friendly Interface**: Intuitive console menu system
- **Data Protection**: Encapsulation and defensive programming practices

## 🛠️ Technologies Used

- **Java** (Core Java)
- **ArrayList** for data management
- **Scanner** for user input
- **Console-based Interface**

## 📁 Project Structure

```
CodeAlpha_StudentGradeTracker/
├── src/
│   ├── Student.java          # Student class with grade management
│   ├── Main.java             # Main application logic
│   ├── Student.class         # Compiled Student class
│   └── Main.class           # Compiled Main class
├── README.md                 # Project documentation
├── .gitignore               # Git ignore file
└── LICENSE                  # MIT License
```

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Git (for cloning the repository)

### Installation & Execution

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/CodeAlpha_StudentGradeTracker.git
   cd CodeAlpha_StudentGradeTracker
   ```

2. **Compile the Java files**
   ```bash
   cd src
   javac Student.java Main.java
   ```

3. **Run the application**
   ```bash
   java Main
   ```

## 🎮 Usage Guide

### Main Menu Options

1. **Add a new student**
   - Enter student name
   - System validates uniqueness

2. **Add a grade to an existing student**
   - Find student by name (case-insensitive)
   - Enter grade (0-100 range)

3. **Display statistics for a specific student**
   - View individual student's grades and statistics
   - Shows average, highest, and lowest grades

4. **Display summary report of all students**
   - Comprehensive overview of all students
   - Total student count and individual statistics

5. **Exit**
   - Graceful application termination

### Example Session

```
=== Student Grade Tracker ===

Please select an option:
1. Add a new student
2. Add a grade to an existing student
3. Display statistics for a specific student
4. Display summary report of all students
5. Exit
Enter your choice (1-5): 1
Enter student name: John Doe
Student 'John Doe' added successfully!

Enter your choice (1-5): 2
Enter student name: John Doe
Enter grade (0-100): 85
Grade 85 added to student 'John Doe' successfully!
```

## 🔧 Code Architecture

### Student.java
- **Private fields**: `studentName` (String), `grades` (ArrayList<Integer>)
- **Constructor**: Initializes student with name and empty grade list
- **Public methods**: 
  - `getName()`: Returns student name
  - `getGrades()`: Returns copy of grades list
  - `addGrade(int grade)`: Adds new grade
  - `getAverageGrade()`: Calculates average (handles empty lists)
  - `getHighestGrade()`: Finds highest grade
  - `getLowestGrade()`: Finds lowest grade

### Main.java
- **Static data**: `ArrayList<Student>` for student collection
- **Main loop**: Continuous menu-driven interface
- **Helper methods**: Input validation, student search, report generation
- **Error handling**: Try-catch blocks for robust user experience

## 🧪 Testing

The application includes comprehensive error handling for:
- Invalid menu choices
- Non-numeric grade inputs
- Empty student names
- Duplicate student names
- Non-existent student searches
- Out-of-range grades

## 📊 Sample Output

```
=== Summary Report ===
Total Students: 2

Student: John Doe
Grades: [85, 92, 78]
Average: 85.00 | Highest: 92 | Lowest: 78

Student: Jane Smith
Grades: [95, 88, 91]
Average: 91.33 | Highest: 95 | Lowest: 88
```

## 🤝 Contributing

This project was developed as part of the CodeAlpha Internship Program. For contributions or questions, please refer to the internship guidelines.

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Developer

**Name**: [Your Name]  
**Internship**: CodeAlpha Internship Program  
**Project**: Student Grade Tracker  
**Domain**: Java Development  

## 🔗 Links

- **GitHub Repository**: [CodeAlpha_StudentGradeTracker](https://github.com/yourusername/CodeAlpha_StudentGradeTracker)
- **LinkedIn**: [Your LinkedIn Profile]
- **CodeAlpha**: [@CodeAlpha](https://www.linkedin.com/company/codealpha)

---

**Note**: This project demonstrates proficiency in Java programming, object-oriented design, data structures, and console application development as part of the CodeAlpha Internship Program. 
import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> grades;
    
    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<Integer>();
    }
    
    public String getName() {
        return studentName;
    }
    
    public ArrayList<Integer> getGrades() {
        return new ArrayList<Integer>(grades); // Return a copy to prevent external modification
    }
    
    public void addGrade(int grade) {
        grades.add(grade);
    }
    
    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    
    public int getHighestGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        
        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }
    
    public int getLowestGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
} 
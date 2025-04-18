import java.util.*;
class StudentOperations {
 ArrayList<Student> students; // array list of data type Student (object) which is a combination of String and
                              // int
public StudentOperations() {
  this.students = new ArrayList<>();
 }

 // addStudents with exception
public void addStudents(Student student) throws DuplicatePRNException, InvalidCGPAException {
    if (searchByPRN(student.getPRN()) != null) {
        throw new DuplicatePRNException("PRN already exists!");
    }
    if (student.getCGPA() < 0.0 || student.getCGPA() > 10.0) {
        throw new InvalidCGPAException("Invalid CGPA entered! Must be between 0.0 and 10.0.");
    }
    students.add(student);
    System.out.println("Student added successfully.");
}

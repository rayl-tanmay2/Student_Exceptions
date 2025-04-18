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

// Method to Display Student Details
 public void displayStudents() {
  for (Student student : students) {
   student.display();
  }
 }
//  searchByPRN to throw exception
public Student searchByPRN(long prn) throws StudentNotFoundException {
    for (Student student : students) {
        if (student.getPRN() == prn) {
            return student;
        }
    }
    throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
}


 // Search Student by Name
 public Student searchByName(String name) {
  for (Student student : students) {
   if (student.getName().equalsIgnoreCase(name)) {
    return student;
   }
  }
  return null;
 }

 // Modified searchByPosition
public Student searchByPosition(int position) throws InvalidPositionException {
    if (position < 0 || position >= students.size()) {
        throw new InvalidPositionException("Position out of range.");
    }
    return students.get(position);
}


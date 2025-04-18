// Student.java

class Student {
 private String name;
 private long prn;
 private String branch;
 private String batch;
 private double cgpa;

 public Student(String name, long prn, String branch, String batch, double cgpa) {
  this.name = name;
  this.prn = prn;
  this.branch = branch;
  this.batch = batch;
  this.cgpa = cgpa;
 }
// Getter-Setter Methods for private members
 public String getName() {
  return name;
 }
public void setName(String name) {
  this.name = name;
 }

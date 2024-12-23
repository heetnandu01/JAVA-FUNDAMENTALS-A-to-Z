    /*
    design a course class

    1. instance variables : courseName,enrolledStudents
    2. static variables : maxCapacity,the maximum number of students for any course
    3. instance methods : enrollStudent(String studentName),unenrollStudent(String studentName)
    4. static methods : setMaxCapacity(int Capacity), to set the maximum 
    capacity for courses
     */

class course{

    // static variable 

    static int maxCapacity = 100;

    // instance variables 

   String courseName;

   int enrollments;

   course(){
    this.courseName = courseName;
    this.enrollments = 0;
    this.enrolledStudents = new String[maxCapacity];
   }


   String[] enrolledStudents = new String[maxCapacity];


   // static method

   static void setMaxCapacity(int maxCapacity){
    course.maxCapacity = maxCapacity;
   }
   
   
   void enrolledStudents(String studentName){
    enrolledStudents[enrollments] = studentName;
    enrollments++; 
   }

   void unenrollStudent(String studentName){
    System.out.println("student removed");
    enrollments--;
   }
    


}








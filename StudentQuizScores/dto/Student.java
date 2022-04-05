package classroster.dto;

public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    // Programming Language + cohort month/year
    private String cohort;
    private int[] grades;
    private int gradeAverage;

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }
    public void setGrades(int[] grades) {
    	this.grades = grades;
    }
    public int[] getGrades() {
    	return this.grades;
    }
    public void setGradeAverage() {
    	int count = 0;
    	int total = 0;
    	for(int i = 0; i<grades.length;i++) {
    		total = total + grades[i];
    		count++;
    	}
    	this.gradeAverage = total/count;
    }
    public int getGradeAverage() {
    	return this.gradeAverage;
    }
}

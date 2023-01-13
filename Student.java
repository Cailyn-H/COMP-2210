package COMP2210;
/**
 * Student.java
 * A class to represent student data, for the
 * purpose of illustrating order by Comparable
 * and Comparator.
 */
public class Student implements Comparable<Student> {

	private String first;
    private String last;
    private int sec;

    /** Creates a new student. */
    public Student(String last, String first, int sec) {
        this.last = last;
        this.first = first;
        this.sec = sec;
    }

    /** Returns this student's first name. */
    public String getFirstName() {
        return first;
    }

    /** Returns this student's last name. */
    public String getLastName() {
        return last;
    }

    /** Returns this student's section. */
    public int getSection() {
        return sec;
    }

    /**
     * Implement compareTo so that students are ordered in the
     * following way: in ascending order of last name, then in
     * ascending order of first name, and then in ascending order
     * of section.
     */
   @Override
    public int compareTo(Student s) {
       try{ 
           if(s.equals(null) || this.equals(null));
       } catch(NullPointerException e) { 
           throw e;}
        int L = this.getLastName().compareTo(s.getLastName());
        if(L != 0) { 
            return L;}
        
        int F = this.getFirstName().compareTo(s.getFirstName());
        if(F != 0) { 
            return F;}
        
        int S = 0;
        if(this.getSection() > s.getSection()) { 
        S = 1;}
        
         if(this.getSection() < s.getSection()) { 
        S = -1;}
        
        return S;
        
        
    }

    /** Returns a string representation of this student. */
    @Override
    public String toString() {
        return sec + ", " + this.last + ", " + this.first;
    }
}



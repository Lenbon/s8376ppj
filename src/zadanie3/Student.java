package zadanie3;

/**
 * Student
 * 
 * @version $Id$
 */
public class Student implements Comparable<Student>
{
    private String name;
    private String surname;
    private Integer index;
    private Float average;

    public Student(String params)
    {
        try {
            String input[] = params.split("([ ]+)");
            setName(input[0]);
            setSurname(input[1]);
            setIndex(Integer.parseInt(input[2]));
            setAverage(Float.parseFloat(input[3]));
        } catch (Exception e) {
            System.out.println("Niepoprawne dane, pomijam");
        }
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public Integer getIndex()
    {
        return index;
    }

    public Float getAverage()
    {
        return average;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setIndex(Integer index)
    {
        this.index = index;
    }

    public void setAverage(Float average)
    {
        this.average = average;
    }

    public String toString()
    {
        return getName() + " " + getSurname() + " " + getIndex() + " "
                + getAverage();
    }

    public int compareTo(Student student)
    {
//        Student student = (Student) o;
        
        int comparePoints = 0;
        
        if (getIndex() < student.getIndex()) {
            comparePoints += 100;
        }
        
        comparePoints += getSurname().compareTo(student.getSurname());
        comparePoints += getName().compareTo(student.getName());
        
        if (getAverage() < student.getAverage()) {
            comparePoints++;
        }
        
        return comparePoints;
    }

}

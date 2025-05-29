//Question_01

//1
public class Student{
	private int studentID;
	private String name;
	private int daysAttended;
	
	//2
	//constructor for class Student
	public Student(int studentID,String name,int daysAttended){
		this.studentID = studentID;
		this.name = name;
		this.daysAttended = daysAttended;
	}
	
	//3
	//getters
	public int getstudentId()
	{
		return studentID;
	}
	public String getName()
	{
		return name;
	}
	public int getDaysAttended()
	{
		return daysAttended;
	}
	//setters
	public void setDaysAttended(int daysAttended)
	{
		this.daysAttended = daysAttended;
	}
	
	public void displayStudentDetails()
	{
        System.out.println("ID: " + studentID + ", Name: " + name + ", Days Attended: " + daysAttended);
    }
}


//4
class Classroom
{
    private Student[] students;
    private int studentCount=0;

    public Classroom()
	{
		students = new Student[10];
    }

	//5
    public void addStudent(Student student)
	{
        if (studentCount < students.length)
		{
            students[studentCount++] = student;
        }
		else
		{
            System.out.println("Classroom is full!");
        }
    }

    public void updateAttendance(int studentId, int newDaysAttended)
	{
        for (int i = 0; i < studentCount; i++)
		{
            if (students[i].getstudentId() == studentId)
			{
                students[i].setDaysAttended(newDaysAttended);
                return;
            }
        }
        System.out.println("Student ID " + studentId + " not found.");
    }

    public void displayAllStudents()
	{
        for (int i = 0; i < studentCount; i++) {
            students[i].displayStudentDetails();
        }
    }
}

//6
class Run
{
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        
        classroom.addStudent(new Student(101, "Alice Smith", 12));
        classroom.addStudent(new Student(102, "Bob Jones", 15));
        classroom.addStudent(new Student(103, "Carol Lee", 10));

        classroom.updateAttendance(102, 16);
        classroom.updateAttendance(104, 5); 

        classroom.displayAllStudents();
    }
}

//Question_04

//1
class Student { 
    private String name; 
    private int exam1; 
    private int exam2; 
    private int exam3; 

	//2
	//constructor
    public Student(String name, int exam1, int exam2, int exam3)
	{ 
        this.name = name; 
        setExam1(exam1); 
        setExam2(exam2); 
        setExam3(exam3); 
    } 

	//setters
    public void setExam1(int exam1)
	{ 
        validateScore(exam1); 
        this.exam1 = exam1; 
    } 
    public void setExam2(int exam2)
	{ 
        validateScore(exam2); 
        this.exam2 = exam2; 
    } 
    public void setExam3(int exam3)
	{ 
        validateScore(exam3); 
        this.exam3 = exam3; 
    } 
	//4 - getters
    public String getName()
	{ 
        return name; 
    } 
    public int getExam1()
	{ 
        return exam1; 
    } 
    public int getExam2()
	{ 
        return exam2; 
    } 
    public int getExam3()
	{ 
        return exam3; 
    } 
	
	
	//3
    private void validateScore(int score)
	{ 
        if (score < 0 || score > 100)
		{ 
            throw new IllegalArgumentException("Marks must be between 0 and 100!"); 
        } 
    }
	
	//5
    public double calculateAverage()
	{ 
        return (exam1 + exam2 + exam3) / 3.0;
    } 
} 

//6
class Run
{
    public static void main(String[] args)
	{ 
        try //student object1
		{ 
            Student student1 = new Student("John", 75, 110, 90); 
			
            System.out.println("");	
            System.out.println("Name = " + student1.getName()); 
            System.out.println("Exam 1 marks = " + student1.getExam1()); 
            System.out.println("Exam 2 marks = " + student1.getExam2()); 
            System.out.println("Exam 3 marks = " + student1.getExam3()); 
            System.out.println("Average is = " + student1.calculateAverage()); 
        }
		catch (Exception e)
		{ 
            System.out.println("Error! " + e.getMessage()); 
        } 
		
		try //student object2
		{ 
			Student student2 = new Student("Steve", 55, 80, 96); 

			System.out.println("");	
			System.out.println("Name = " + student2.getName()); 
            System.out.println("Exam 1 marks = " + student2.getExam1()); 
            System.out.println("Exam 2 marks = " + student2.getExam2()); 
            System.out.println("Exam 3 marks = " + student2.getExam3()); 
            System.out.println("Average is = " + student2.calculateAverage()); 
        }
		catch (Exception e)
		{ 
            System.out.println("Error! " + e.getMessage()); 
        } 
    }
} 

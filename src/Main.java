import java.util.GregorianCalendar;
public class Main {

	public static void main(String[] args) {
	
		Student[] stud = new Student[3];
        stud[0] = new Student(1, "Tanya", "Ivanovna", "Petrakovskaya", new GregorianCalendar(1996, 9, 9), "Minsk", "44444444", "economics", 5, 2);
        stud[1] = new Student(2, "Petya", "Sergeevich", "Sergeev", new GregorianCalendar(1994, 5, 6), "Minsk", "5555555", "economics", 5, 2);
        stud[2] = new Student(3, "Sergey", "Petrovich", "Borisovich", new GregorianCalendar(1985, 9, 1), "Minsk", "666666", "economics", 5, 2);
        
        Dekanat l = new Dekanat();
        
        for (Student k : stud) {
            l.addStudent(k);
        }
		
      
        System.out.println("Список введенных студентов");
        l.listOut(stud);
      
   
    
        System.out.println("Списки студентов для каждого факультета и курса");
        l.listOutByFacultyAndCourse("economics",5);
     
        System.out.println("Список студентов, родившихся после заданного года");
        l.listOutByYear(new GregorianCalendar(1995, 9, 9));
      
        System.out.println("Список учебной группы");
        l.listOutByGroup(2);

	} } 

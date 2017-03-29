

	import java.util.GregorianCalendar;




	public class Student {

	    private int id;
	    private String name;
	    private String middlename;
	    private String surname;
	    private GregorianCalendar birthdate;
	    private String adress;
	    private String phone;
	    private String faculty;
	    private int courseNumber;
	    private int groupNumber;
	    
	    public Student(int id, String name, String middlename, String surname, GregorianCalendar birthdate, String adress,
	                   String phone, String faculty, int courseNumber, int groupNumber) {
	        this.id = id;
	        this.name = name;
	        this.middlename = middlename;
	        this.surname = surname;
	        this.birthdate = birthdate;
	        this.adress = adress;
	        this.phone = phone;
	        this.faculty = faculty;
	        this.courseNumber = courseNumber;
	        this.groupNumber = groupNumber;
	    }
	
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getMiddlename() {
	        return middlename;
	    }

	    public void setMiddlename(String middlename) {
	        this.middlename = middlename;
	    }

	    public String getSurname() {
	        return surname;
	    }

	    public void setSurname(String surname) {
	        this.surname = surname;
	    }

	    public GregorianCalendar getBirthdate() {
	        return birthdate;
	    }

	    public void setBirthdate(GregorianCalendar birthdate) {
	        this.birthdate = birthdate;
	    }

	    public String getAdress() {
	        return adress;
	    }

	    public void setAdress(String adress) {
	        this.adress = adress;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getFaculty() {
	        return faculty;
	    }

	    public void setFaculty(String faculty) {
	        this.faculty = faculty;
	    }

	    public int getCourseNumber() {
	        return courseNumber;
	    }

	    public void setCourseNumber(int courseNumber) {
	        this.courseNumber = courseNumber;
	    }

	    public int getGroupNumber() {
	        return groupNumber;
	    }

	    public void setGroupNumber(int groupNumber) {
	        this.groupNumber = groupNumber;
	    } }

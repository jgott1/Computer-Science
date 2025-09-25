public class Student {
    private String name;
    private int grade;
    private String id;

    public int getGrade() {
        
        return grade;
    }

    public String getId() {
        this.id = getId();
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public String generateId() {
        String id = ""; 
        int y = getRandom(1, 9); 
        id = id + y;
        y = getRandom(1, 9); 
        id = id + y;
        y = getRandom(1, 9); 
        id = id + y;
        id = id + "-";
        y = getRandom(0, 10); 
        id = id + y;
        y = getRandom(0, 10); 
        id = id + y;
        y = getRandom(0, 10); 
        id = id + y;
        y = getRandom(0, 10); 
        id = id + y;
        return id;
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;

    }

    public Student(String name) {
        this.name = name;
        this.grade = 10;
    }

    public void setGrade(int generateGrade) {
        this.grade = generateGrade;
    }

    public void setId(String generateId) {
        this.id = generateId;
    }

    public void setName(String generateName) {
        this.name = generateName;
    }

    public String toString() {
        return name + " is a " + grade
            + "th grade student. Their id is " + id + ".";
    }

    public boolean equals(Student otherStudent) {
        if (this.grade == otherStudent.grade 
            && this.name.equals(otherStudent.name)) {
            return true;
        } else {
            return false;
        }
    }


}
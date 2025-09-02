public class Student {
    String name;
    float uts;
    float uas;
    float task;

    public Student(String name, float uts, float uas, float task){
        this.name = name;
        this.uts = uts;
        this.uas = uas;
        this.task = task;
    }

    public float getUts(){
        return uts;
    }

    public float getUas(){
        return uas;
    }

    public float getTask(){
        return task;
    }

    public String getName(){
        return name;
    }
}

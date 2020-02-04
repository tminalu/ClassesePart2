import java.util.ArrayList;

public class CollegeDB {
    private ArrayList<College> colleges;
    //default constructor
    public CollegeDB() {}
    //overloaeded  constructor
    public CollegeDB(ArrayList<College> colleges){
        this.colleges=colleges;
        //getterrs and setters
    }
    public ArrayList<College> getColleges(){
        return this.colleges;
    }
    public void setColleges(ArrayList<College> colleges){
        this.colleges=colleges;
    }
}

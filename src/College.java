public class College {
    private String collegName;
    private String location;
    private String phoneNumber;
    private final int STUDENTCAP = 1000;

    public College(){}
    public College(String collegName,String locations, String phoneNumber){
        this.collegName=collegName;
        this.location=location;
        this.phoneNumber=phoneNumber;
    }
    public String getCollegName(){
        return this.collegName;
    }
    public void setCollegName(String collegName){
        this.collegName=collegName;
    }
    public void cheer(){
        System.out.println("Cherrring for the college...");
    }

    public int getSTUDENTCAP() {
        return STUDENTCAP;
    }
}

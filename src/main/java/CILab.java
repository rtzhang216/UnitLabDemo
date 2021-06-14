
public class CILab implements CILabInterface {
    private String myString;


    public String getString() {
        return myString;
    }


    public void setString(String string) {
        myString = string;
    }


    public boolean detectCapitalUse() {
        return false;
    }

}


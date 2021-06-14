
public class CILab implements CILabInterface {
    private String myString;


    public String getString() {
        return myString;
    }


    public void setString(String string) {
        myString = string;
    }


    public boolean detectCapitalUse() {
        if(myString == "" || myString == null)
            return false;

        char[] charArray = myString.toCharArray();

        if(Character.isLowerCase(charArray[0])){
            for(int i = 1; i < charArray.length; i++){
                if(!Character.isLowerCase(charArray[i]))
                    return false;
            }
        }else{
            int countLowerCase = 0;
            for(int i = 1; i < charArray.length; i++){
                if(Character.isLowerCase(charArray[i]))
                    countLowerCase++;
            }

            if(countLowerCase > 0 && countLowerCase < charArray.length - 1)
                return false;
        }

        return true;
    }

}


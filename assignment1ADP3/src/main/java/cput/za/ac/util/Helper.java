package cput.za.ac.util;
/*   Helper.java
     Helper file for validation
     Author:Rodrigue Ndzana Ngonga Beaubane (219384096)
     Date: 07 April 2022
*/



import java.util.UUID;

public class Helper {
    // checking parameter string
    public static boolean isNullOrEmpty(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        return false;
    }

    //generating user Id
    public static String generatedId() {
        return UUID.randomUUID().toString();
    }



}

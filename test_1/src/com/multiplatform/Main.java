package com.multiplatform;

public class Main {

    public static void main(String[] args){
        bark(true,1);
    }

    public static boolean bark(boolean barking, int hourOfDay){
        boolean result = false;
        if (hourOfDay < 0 || hourOfDay > 23){
            System.out.println("karena parameter jam libur harus dalam kisaran 0-23");
            return false;
        }
        else if (hourOfDay >= 8 && hourOfDay <= 22){
            System.out.println("mengembalikan sebelum bukan sebelum 8");
            result = false;
        }

        else if (hourOfDay >= 1 || hourOfDay <=7 || hourOfDay >=23){
            if(barking == true){
                System.out.println("menunjukan nilai");
                result = true;
            }
            else {
                System.out.println("tidak bekerja sama skali");
                result = false;
            }
        }
        return result;
    }
}

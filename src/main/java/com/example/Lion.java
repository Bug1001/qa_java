package com.example;

import java.util.List;
import com.example.AsexualException;

public class Lion {
    private boolean hasMane;
    String sex;

    public Lion(String sex, Feline feline) throws Exception {

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else if ("Бесполый".equals(sex)) {
            throw new AsexualException("Это только для людей");
        }

        else
        {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
    public Lion(String sex) throws Exception{
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else if ("Бесполый".equals(sex)) {
            throw new AsexualException("Это только для людей");
        }

        else
        {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }



    public int getKittens() {
       return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

  /* public List<String> getFood() throws Exception
   {
        return feline.getFood("Хищник");
   }*/
}

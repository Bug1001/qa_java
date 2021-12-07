package com.example;

import java.util.List;
import com.example.Feline;

public class Alex extends Lion{
        Feline feline;
        public Alex(Feline feline) throws Exception{
            super("Самец");
        }

        public List<String> getFriends(){
            return List.of("Марти", "Глория", "Мелман");
        }

        public String getPlaceOfLiving(){
            return "Нью-Йоркский зоопарк";
        }
        @Override
    public int getKittens(){
            return 0;
        }
}

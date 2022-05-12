package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /**Class деген класс тузунуз
         //ал класстын номер деген бутун сан сактаган, соз деген соз сактаган жана массив деген сан сактаган массив бар
         конструктор жазыныз
         //мейн методтон Classтын объектисин тузунуз
         //объекттин полелерине конструктор аркылуу маани бериниз
         //ошол объекттин полелерин консольго чыгарыныз.*/
     Class clas = new Class(2,"say",new int[] {32,89,65});
        System.out.println(clas.getSan()+" "+clas.getSoz()+" "+ Arrays.toString(clas.getMasiv()));

    }


}
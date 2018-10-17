package com.kl.training;

/**
 * @author Tomas
 *
 * This is basic documentation for Variables class
 * 09.10.2018
 *
 */
public class Variables {

    /**
     * This is main method which servers as start of program
     *
     * @param args - input arguments
     */
    public static void main(String[] args) {

        // Line comment

        /*
        * Line comment 1
        * Line comment 2
        * Line comment 3
        */

        /*
            Byte
                - cele cislo
                - velikost 8 bitu (1 byte)
                - minimalni hodnota = -128
                - maximalni hodnota = 127
        */
        byte myByte = 1;
        //byte myByte2 = 150; // nelze pouzit z duvodu prekroceni maximalni hodnoty

        /*
            Short
                - cele cislo
                - velikost 16 bitu (2 byty)
                - minimalni hodnota = -32 768
                - maximalni hodnota = 32 767
        */
        short myShort = 10000;

        /*
            Integer
                - cele cislo
                - velikost 32 bitu (4 byty)
                - minimalni hodnota = -2 147 483 648
                - maximalni hodnota = 2 147 483 647
         */
        int myInt = 2000000000;

        /*
            Long
                - cele cislo
                - velikost 64 bitu (8 bytu)
                - minimalni velikost = -9 223 372 036 854 775 808
                - maximalni velikost = 9 223 372 036 854 775 807
         */
        long myLong = 0; long myLong2 = 1; // vice prikazu na jeden radek nepouzivat

        /*
            Float
                - realne cislo
                - velikost 32 bitu (4 byty)
                - minimalni hodnota = -3.40282e+38
                - maximalni hodnota = 3.40282e+38
         */
        float myFloat = 10.001F; // float potrebuje na konci cifry identifikator F

        /*
            Double
                - realne cislo
                - velikost 64 bitu (8 bytu)
                - minimalni hodnota = -1.79769e+308
                - maximalni hodnota = 1.79769e+308
         */
        double myDouble = 10.001D; // identifikator D je u doublu nepovinny
        double myDouble2 = 10.001;

        /*
            Char
                - znak UNICODE
                - velikost 16 bitu (2 byty)
                - minimalni hodnota /u0000
                - maximalni hodnota /uFFFF
         */
        char myChar = 'A'; // pouze jeden znak

        /*
            Boolean
                - logicka hodnota
                - velikost 1 bit
                - nabyva hodnot true nebo false (1 nebo 0)
         */
        boolean myBoolean = true;
        // boolean myBoolean2 = 1; // pouze slovne

        /*
            Retezec (String)
         */
        String myString = "Hello World";

        /*
            Pole (Array)
         */
        int[] myIntArray = {1, 2};
        int[] myIntArray2 = new int[2];
            myIntArray2[0] = 10;
            myIntArray2[1] = 20;
        // int[] myIntArray = {10, 20};
        double[] myDoubleArray = {10.2, 0.00};

        float[] myFloatArray = new float[0];
        float[] myFloatArray2 = {};
        float[] myFloatArray3 = new float[5];
            myFloatArray3[0] = 12.1F;
            myFloatArray3[1] = 14F;
            myFloatArray3[2] = 22F;
            myFloatArray3[3] = 34F;
            myFloatArray3[4] = 99F;

        /* Vypsani prvku pole myFloatArray3 do konzole */
        System.out.println("Hodnota prvku pole myFloatArray3 je: " + myFloatArray3[0] + ", " + myFloatArray3[1] + ", " + myFloatArray3[2] + ", " + myFloatArray3[3] + ", " + myFloatArray3[4]);

        /* Vylet duchodcu z Albertova na Prazsky hrad */
        String[] autobus1 = {"Vera", "Kveta", "Franta", "Josef"};
        String[] autobus2 = new String[3];
            autobus2[0] = "Spytihnev";
            //autobus2[1] = "";
            autobus2[2] = "Mojmir";

        System.out.println("Kdo sedi na druhem miste? " + autobus2[1] + ".");

        System.out.println("Hodnota prvniho prvku pole myDoubleArray: " + myDoubleArray[1]);

        String[] myStringArray = {"Prvek1", "Prvek2", "Prvek3"};
        String[] myStringArray2 = new String[3];
            myStringArray2[0] = "Prvek1";
            myStringArray2[1] = "Prvek2";
            myStringArray2[2] = "Prvek3";

        /*
            Objekty
                - reprezentuji prvky realneho sveta
                - maji vlastnosti
                - mohou mit nejake metody
        */
            /* Tvorba objektu */
            Dog pes1 = new Dog("Hafik", "Hneda", "Doga", 130.1);

            /* Zmena instantni promenne */
            pes1.jmeno = "Fik";
            System.out.println(pes1.jmeno);

            /* Pocet nohou - staticka promenna*/
            System.out.println("Pocet nohou: " + pes1.pocetKoncetin);

            /* Volani metody objektu */
            pes1.bark();

    }
}
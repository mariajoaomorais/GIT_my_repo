package academy.mindswap;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /*
        //Array de Strings
        String[] arrayStrings = {"Hello", "zxzz", "hhh"};
        String[] arrayStringsEmpty = new String[3]; //{null, null, null}
        //A seguinte é idêntica à anterior:
        //String[] arrayStringsEmpty2 = {null, null,null};

        //Como escrever amarelo na posição zero,...:
        //Considerando: String[] arrayStringsEmpty = new String[3]; //{null, null, null}
        arrayStringsEmpty[0] = "Amarelo"; // {Amarelo, null, null}
        arrayStringsEmpty[2] = "Vermelho"; // {amarelo, null, vermelho}


        String color = arrayStringsEmpty[0].toLowerCase(); //"Amarelo".toLowerCase()
        //System.out.println(color);
        //System.out.println("Amarelo".toLowerCase());

        String color1 = arrayStringsEmpty[1]; //null.toString()
        // System.out.println(color1);

        for (int i = 0; i < arrayStringsEmpty.length; i++) {
            // System.out.println(arrayStringsEmpty[i]);
        }

        //ARRAY de números
        int[] arrayInts = {1, 2, 3};
        int[] arrayInts1 = new int[3]; //{0,0,0}
        arrayInts1[2] = 10;
        arrayInts1[arrayInts1.length - 1] = 10; //{0,0,10}
        //System.out.println(arrayInts1[arrayInts1.length-1]);

        //ARRAY de boolean
        //int a = arrayInts[-1]; ou int a = arrayInts[100];
        // o programa para por completo porque a posição sai fora da leghth
        boolean[] arrayBooleans = new boolean[3]; //{false, false, false}
        boolean[] arrayBooleans1 = {true, false, true};

        //System.out.println();


        Pig mafarrico = new Pig(2, 200);

        System.out.println(mafarrico.getAge());
        System.out.println(mafarrico.getWeight());
        Pig pepper = new Pig(5, 400);

        Pig[] arrayPigs = new Pig[3]; //{null, null, null}
        arrayPigs[0] = mafarrico; //{mafarrico, null, null}
        arrayPigs[1] = pepper; //{mafarrico, pepper, null}

        System.out.println(mafarrico.toString());
        System.out.println(arrayPigs[0]);

*/
/*
        int[] array = {};
        //System.out.println(matrix.length); //0

        int[][] matrix = {{1}, {2,3},{4,5,6}};
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(matrix[1].length);
        System.out.println(matrix[1][1]);
        //matrix[0][0] -> 0
        //matrix[2][0] -> 4
        for (int i = 0; i < matrix[i]; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        int[][][] matrix1 = {{{1}, {2},{3},{4},{5},{6}}};
        for (int i = 0; i < matrix1[i]; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                for (int k = 0; k < matrix1[i][j].length; j++) {
                System.out.println(matrix1[i][j][k]);
            }
        }
     */

     /*
        //Pig[][] doublePig = new Pig[3][2];
        Pig[][] doublePig = {{new Pig(1, 100)}, {new Pig(2, 200)}, {new Pig(3, 300)}};

        for (int i = 0; i<doublePig.length; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j < doublePig[i].length; j++) {
                System.out.println("j: " + j);
                System.out.println(doublePig[i][j]);
                System.out.println("Pigs age: " + doublePig[i][j].getAge() + " and weight: " + doublePig[i][j].getWeight());
            }
        }

      */
/*
    //-------------------Exercicio ---------------------

        //Cat [][] yourCats = new Cat[2][2];
        Cat[][] yourCats = {
                {
                 new Cat(1,2, new String[]{"Siamês", "xxx"}),
                 new Cat(2,3, new String[]{"zzz","ccc","sss"})},
                 {new Cat(1,2, new String[]{"yyyy", "xxx"})
                }
        };
                Cat cat00 = yourCats[0][0];
                cat00.getAge();
                System.out.println(yourCats[1][0].getCatBreed()[0]);

        for (int i = 0; i<yourCats.length; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j < yourCats[i].length; j++) {
                System.out.println("j: " + j);
                Cat cat = yourCats[i][j];

                String[] arrayBreeds = cat.getCatBreed();
                for (int k = 0; k < arrayBreeds.length; k++) {
                    System.out.println("k: " + k);
                    System.out.println(arrayBreeds[k]);
                }
                //System.out.println(yourCats[i][j]);
                //System.out.println("Cats age: " + yourCats[i][j].getAge() + " and weight: " + yourCats[i][j].getWeight());
            }


        }

 */
        System.out.println("Welcome to the Restaurant!");
        System.out.println("Menu 1:");

        Food[][] menu1 = {
                {new Food("Cheeseburguer",1,new String[]{"Bread","Meat"})},
                {new Food("Fries",2,new String[]{"Potatoes"})},
                {new Food("Coke",1,new String[]{"Water","Sugar"})}};

        for (int i = 0; i < menu1.length; i++) {
            for (int j = 0; j < menu1[i].length; j++){
                System.out.print("Option " + (i+1) + ": " + menu1[i][j].getQuantity() + "x " + menu1[i][j].getName() + ") ");

                for (int k = 0; k < menu1[i][j].getRecipe().length; k++) {
                    if(menu1[i][j].getRecipe().length-1 == k){
                        System.out.println(menu1[i][j].getRecipe()[k]);
                        continue;
                    }
                    System.out.println(menu1[i][j].getRecipe()[k] + ", ");
                }
                System.out.println(")");
            }

        }

    }
}

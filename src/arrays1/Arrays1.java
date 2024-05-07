package arrays1;
//Exercise 6 is not executed well, redo it later.
import java.util.Arrays;
import java.util.Scanner;


public class Arrays1 {

    public static void main(String[] args) {
    /*
    1. Create an array of 3 positions, fill it in by giving the numbers to the
    user and scroll trough it to show it.
    */
        Scanner sc = new Scanner (System.in);
        
        int [] numeros = new int [3]; //arrays empiezan en 0 (0 1 2)
        
        int numero;
        System.out.println("Inserting numbers");
        for (int i = 0; i < numeros.length; i++) {
            //este for pide datos
            
            System.out.println("Insert a number in the position " + i);
            numero = sc.nextInt();
            numeros [i] = numero;
        }
        System.out.println("Show array");
        for (int i = 0; i < numeros.length; i++) {
            //este for muestra datos
            System.out.println(numeros [i]);
        }
        System.out.println("--------------------------------------------");

    /*
    2. Create an array of 10 positions and fill it with random numbers. Show
        them at the end. Create a function to fil it and another to show it.
    */
        System.out.println("I'm going to show you a series of random numbers"
                + " between 0 and 10");
        int [] randomNumbers = new int[10];
        fillRandomArray(randomNumbers, 5, 10);
        showArray(randomNumbers);
        System.out.println("--------------------------------------------");

    /*
    3. Create an array of numbers (give the values yourself) and indicate what
        the sum and the average status of that array are.
    */
        int[] nums = {3, 5, 6, 7, 10};
        int sum = 0;
        double average;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums [i];
        }
        System.out.println("The sum is = " + sum);       
        
        average = (double)sum /nums.length;
        
        System.out.println("The average value is = " + average);
        System.out.println("--------------------------------------------");

    /*
    4. Create two arrays and indicates if they are equal.(They are equal when
        their elements are axactly the same).
    */
        int [] a1 = {1, 2, 3, 4, 5};
        int [] a2 = {1, 2, 3, 4, 5, 6};
        
        if (Arrays.equals(a1, a2)) {
            System.out.println("The arrays are equals");
        }else{
            System.out.println("The arrays are not the same");
        }
        System.out.println("--------------------------------------------");

    /*
    5. Show the smallest and largest of an arrangement of numbers created by
    yourself.
    */
        int [] array = { 4, 70, 3, 90, 102, 5};
        mayorMenorArray (array);
        System.out.println("--------------------------------------------");
    /*
    6. Create a function that, given a natural number, return its digits in an
    array.
    */    
        int numero1 = validaNumero(0, Integer.MAX_VALUE);
        int []digitos1= digitosNumeroArray(numero1);
      
        mostrarArray(digitos1);
        
    }
    
    
    
    
    //2.
    public static int generateRandomNumber(int minimo, int maximo) {
        return (int) ((Math.random() * (maximo - minimo + 1)) + (minimo));
    }
    public static void fillRandomArray (int[] array,int minimo, int maximo) {
        
        for (int i = 0; i < array.length; i++) {
            array [i] = generateRandomNumber (minimo, maximo);
        }
    }
    public static void showArray(int [] array) {
       for (int i = 0; i < array.length; i++) {
           System.out.println(array [i]);
       }
    }
    //3.
    public static void mayorMenorArray (int[] array){
        
        int mayor = array[0];
        int menor = array[0];
        //ponemos que es el mayor y el menor para que recorra solo el largo del arreglo.
        for (int i = 0; i <array.length; i++) {
            
            if (array [i] > mayor) {
                mayor = array[i];
            }
            if (array[i] < menor){
                menor = array[i];
            }
        }
        
        System.out.println("Largest: " +mayor);
        System.out.println("Smallest: " +menor);
    }
    //6.
    public static int validaNumero (int minimo1, int maximo1){
        Scanner kb = new Scanner (System.in);
        
        if (minimo1 > maximo1) {
            int aux = minimo1;
            minimo1 = maximo1;
            maximo1 = aux;
        }
        int numero1;
        do {
            
            System.out.println("Write a number, I will return it as an arrangement");
            numero1 = kb.nextInt();
            
            if (!(numero1>= minimo1 && numero1 <= maximo1)) {
                System.out.println("You must write a number between " + minimo1 + " y " + maximo1);
            }
        } while (!(numero1 >= minimo1 && numero1 <= maximo1));
        
        return numero1;
       
    }
    public static int [] digitosNumeroArray (int numero) {
        int numCifras = 0;
        final int DIVISOR = 10;
        
        for (int i = numero; i > 0; i/=10) {
            numCifras++;
            
        }
        int [] digitos = new int [numCifras];
        for (int i = numero, j= 0; i > 0; i/=10) {
            digitos[j] = i % 10; 
        }
        return digitos;
    }
    public static void mostrarArray (int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }
    }
    
    
}
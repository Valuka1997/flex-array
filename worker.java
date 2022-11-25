package javaapplication7;

import java.util.Scanner;


public class TestFlexArray {
        public static void main(String[] args){
        
        System.out.println("Flexible array");
        System.out.println("________________");
        System.out.println("\n");
        System.out.println("Enter the length of the array : ");
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();

        //Create a temporary array for add elements to a new array
        int[] anArrayTemp = new int[len];

        //Get elements of array
        for(int i=0; i<5; i++){
            System.out.println("Enter a number for index : " + i );
            Scanner scan = new Scanner(System.in);
            anArrayTemp[i] = scan.nextInt();
        }

        System.out.println("\n");

        //Assign the elements of temporary array into new array
        FlexArray anArray01 = new FlexArray(anArrayTemp);

        boolean trigger = true;
        while(trigger){
            System.out.println("Choose what you want from following options");
            System.out.println("Display array : 1");
            System.out.println("Insert a new value to the array : 2");
            System.out.println("View array in ascending order : 3");
            System.out.println("View array in descending order : 4");
            System.out.println("Delete value by index : 5");
            System.out.println("Delete value by value : 6");
            System.out.println("Search index by value :7");
            System.out.println("Update value by index :8");

        }
       
        anArray01.display();
        System.out.println("\n");

        //Calling the insert method from flexArray class
        System.out.println("Enter a insertValue:" );
        Scanner scan = new Scanner(System.in);
        int insertValue = scan.nextInt();
        anArray01.insert(insertValue);
        anArray01.display();
        System.out.println("\n");

        
        System.out.println("Asending order of the array\n");
        anArray01.sortAsc();
        anArray01.display();
        System.out.println("\n");
        
        System.out.println("Decending order of the array\n");
        anArray01.sortDes();
        anArray01.display();
        System.out.println("\n");
        
        
        //Calling the deleteByIndex method from flexArray class
        System.out.println("Enter a deleteIndex:" );
        int deleteIndex = scan.nextInt();
        anArray01.deletByIndex(deleteIndex);
        anArray01.display();
        System.out.println("\n");

        //Calling the deleteByValue method from flexArray class
        System.out.println("Enter a deleteValue:" );
        int deleteValue = scan.nextInt();
        anArray01.deletByValue(deleteValue);
        anArray01.display();
        System.out.println("\n");

        //Calling the searchKey method from flexArray class
        System.out.println("Enter a searchKey:" );
        int searchKey = scan.nextInt();
        anArray01.search(searchKey);
        System.out.println("\n");

        //Calling the update method from flexArray class
        System.out.println("Enter a updateValue:" );
        int updateValue = scan.nextInt();
        System.out.println("Enter a updateIndex:" );
        int updateIndex = scan.nextInt();
        anArray01.update(updateIndex, updateValue);
        anArray01.display();
        System.out.println("\n");



    }
}

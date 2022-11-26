package FLEXARRAY;

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
        int[] arrTmp = new int[len];

        //Get elements of array
        for(int i=0; i<5; i++){
            System.out.println("Enter a number for index : " + i );
            arrTmp[i] = scan.nextInt();
        }

        System.out.println("\n");

        //Assign the elements of temporary array into new array
        FlexArray arr1 = new FlexArray(arrTmp);

        // boolean trigger = true;
        // while(trigger){
            System.out.println("Choose what you want from following options\n");
            System.out.println("Display array : 1\n");
            System.out.println("Insert a new value to the array : 2\n");
            System.out.println("View array in ascending order : 3\n");
            System.out.println("View array in descending order : 4\n");
            System.out.println("Delete value by index : 5\n");
            System.out.println("Delete value by value : 6\n");
            System.out.println("Search index by value :7\n");
            System.out.println("Update value by index :8\n");
            System.out.println("To Exit press any other key \n");

        // }
       
        arr1.display();
        System.out.println("\n");

        //Calling the insert method from flexArray class
        System.out.println("Enter a insertValue:" );
        Scanner scan = new Scanner(System.in);
        int insertValue = scan.nextInt();
        arr1.insert(insertValue);
        arr1.display();
        System.out.println("\n");

        
        System.out.println("Asending order of the array\n");
        arr1.sortAsc();
        arr1.display();
        System.out.println("\n");
        
        System.out.println("Decending order of the array\n");
        arr1.sortDes();
        arr1.display();
        System.out.println("\n");
        
        
        //Calling the deleteByIndex method from flexArray class
        System.out.println("Enter a deleteIndex:" );
        int deleteIndex = scan.nextInt();
        arr1.deletByIndex(deleteIndex);
        arr1.display();
        System.out.println("\n");

        //Calling the deleteByValue method from flexArray class
        System.out.println("Enter a deleteValue:" );
        int deleteValue = scan.nextInt();
        arr1.deletByValue(deleteValue);
        arr1.display();
        System.out.println("\n");

        //Calling the searchKey method from flexArray class
        System.out.println("Enter a searchKey:" );
        int searchKey = scan.nextInt();
        arr1.search(searchKey);
        System.out.println("\n");

        //Calling the update method from flexArray class
        System.out.println("Enter a updateValue:" );
        int updateValue = scan.nextInt();
        System.out.println("Enter a updateIndex:" );
        int updateIndex = scan.nextInt();
        arr1.update(updateIndex, updateValue);
        arr1.display();
        System.out.println("\n");



    }
}
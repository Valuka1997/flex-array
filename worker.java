import java.util.Scanner;

public class worker {
    public static void main(String[] args) {

        System.out.println("Flexible array");
        System.out.println("________________");
        System.out.println("Enter the length of the array : ");
        Scanner scn = new Scanner(System.in);
        int len = scn.nextInt();

        // Create a temporary array for add elements
        int[] arrTmp = new int[len];

        // Get elements for array
        for (int i = 0; i < len; i++) {
            System.out.println("Enter a number for index : " + i);
            arrTmp[i] = scn.nextInt();
        }

        System.out.println("\n");

        // Create FlexArray object
        FlexArray arr1 = new FlexArray(arrTmp);

        System.out.println("Choose what you want from following options\n");
        System.out.println("Display menu again : 0");
        System.out.println("Display array : 1");
        System.out.println("Insert a new value to the array : 2");
        System.out.println("Delete value by index : 3");
        System.out.println("Delete value by value : 4");
        System.out.println("Search value by index : 5");
        System.out.println("Search index by value : 6");
        System.out.println("Update value by index : 7");
        System.out.println("Update value by value : 8");
        System.out.println("View array in ascending order : 9");
        System.out.println("Sort array in ascending order : 10");
        System.out.println("View array in descending order : 11");
        System.out.println("Sort array in descending order : 12");
        System.out.println("To Exit press any other key");

        String opt = scn.nextLine();


        boolean trigger = true;
        while(trigger){
            switch (day) {
                case 1:
                  System.out.println("Monday");
                  break;
                case 2:
                  System.out.println("Tuesday");
                  break;
                case 3:
                  System.out.println("Wednesday");
                  break;
                case 4:
                  System.out.println("Thursday");
                  break;
                case 5:
                  System.out.println("Friday");
                  break;
                case 6:
                  System.out.println("Saturday");
                  break;
                case 7:
                  System.out.println("Sunday");
                  break;
              }

        }

        arr1.display();
        System.out.println("\n");

        System.out.println("Enter a insertValue:");
        int insertValue = scn.nextInt();
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

        // Calling the deleteByIndex method from flexArray class
        System.out.println("Enter a deleteIndex:");
        int deleteIndex = scn.nextInt();
        arr1.deletByIndex(deleteIndex);
        arr1.display();
        System.out.println("\n");

        // Calling the deleteByValue method from flexArray class
        System.out.println("Enter a deleteValue:");
        int deleteValue = scn.nextInt();
        arr1.deletByValue(deleteValue);
        arr1.display();
        System.out.println("\n");

        // Calling the searchKey method from flexArray class
        System.out.println("Enter a searchKey:");
        int searchKey = scn.nextInt();
        arr1.search(searchKey);
        System.out.println("\n");

        // Calling the update method from flexArray class
        System.out.println("Enter a updateValue:");
        int updateValue = scn.nextInt();
        System.out.println("Enter a updateIndex:");
        int updateIndex = scn.nextInt();
        arr1.update(updateIndex, updateValue);
        arr1.display();
        System.out.println("\n");

        // close scanner
        scn.close();
    }
}

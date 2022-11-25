package FLEXARRAY;


public class FlexArray {
        
    //Declare an array
    private int[] anArray; 
    
    //Creating a constructor to initializes the array object
    public FlexArray(int[] anArray){
        this.anArray = anArray;
    }
    
    /*Creating a method to add a element to a array if there is a
      position last*/
    public void insert(int insertValue){
            this.increase();
            anArray[anArray.length - 1 ] = insertValue;

    }
    
    // Creating a method to delete an element of array by using index
    public void deletByIndex(int deleteIndex){
        // temporary array to hold values without deleted index
         int [] arrayTempDel = new int [anArray.length - 1];

        // copy elements from original anArray from beginning till deleteIndex into arrayTempdel
        System.arraycopy(anArray, 0, arrayTempDel, 0, deleteIndex); 
 
        // copy elements from anArray from deleteIndex+1 till end into arrayTempdel
        System.arraycopy(anArray, deleteIndex+1, arrayTempDel, deleteIndex, anArray.length - deleteIndex-1);

        anArray = arrayTempDel;

    }
    
    // Creating a method to delete an element with it's value
    public void deletByValue(int deleteValue){
        for(int i=0; i<anArray.length; i++){
            if(anArray[i] == deleteValue){
                // temporary array to hold values without deleted index
            int [] arrayTempDel = new int [anArray.length - 1];

            // copy elements from original anArray from beginning till deleteIndex into arrayTempdel
            System.arraycopy(anArray, 0, arrayTempDel, 0, i); 
  
            // copy elements from anArray from deleteIndex+1 till end into arrayTempdel
            System.arraycopy(anArray, i+1, arrayTempDel, i, anArray.length - i-1);
 
            anArray = arrayTempDel;

                break; 
            }

            else if (i>=anArray.length){
                System.out.println("Cound't find the value" + deleteValue + "in index" + i);
                break; 
            }
        }
    }
   
    // Creating a method to update a value of an element in array
   public void update(int updateIndex, int updateValue){
       anArray[updateIndex] = updateValue;
   }
     
    //Creating a method to display all the elements of array
    public void display(){
        for(int i=0; i<anArray.length; i++){
            System.out.print(anArray[i] + "\t"); 
        }
    }
    
    
    //Creating a method to find a element in array
    public void search(int searchKey){
        for(int i=0; i<anArray.length; i++){
            if(anArray[i] == searchKey){
                System.out.println("Found" + searchKey + "in index" + i);
                break; 
            }
            else if(i == anArray.length){
                System.out.println("Cound't find the value" + searchKey + "in index" + i);
                break; 
            }
        }
    }
    //method of sorting  all the items of the array in ascending order
    
    
    //Creating a method to increase the array size for insert values
    public void increase(){
        int[] anArrayTemp = new int[anArray.length + 1];
        System.arraycopy(anArray, 0, anArrayTemp, 0, anArray.length);
        anArray = anArrayTemp;
    }

    //sort the array in acending order method
    public void sortAsc(){
       
        //sort by using insertion sort
        for (int mainLoop = 0; mainLoop < anArray.length; mainLoop++) {
            int temp = anArray[mainLoop];   //remove the value
            int searchLoop=mainLoop;    //start from main loop
            while (searchLoop>0 && anArray[searchLoop-1] >= temp) {
                anArray[searchLoop]=anArray[searchLoop-1];  //shifting to right
                searchLoop--;
            }
            anArray[searchLoop] = temp; //insert the value in relevent place
        }
    }
    //sort the array in decending order method
    public void sortDes(){
        //sort by using insertion sort
        for (int mainLoop = 1; mainLoop < anArray.length; mainLoop++) {
            int temp = anArray[mainLoop];  //remove the value
            int searchLoop=mainLoop;    //start from main loop
            while (searchLoop>0 && anArray[searchLoop-1] <= temp) {
                anArray[searchLoop]=anArray[searchLoop-1]   ;//shifting to right
                searchLoop--;
            }
            anArray[searchLoop] = temp;//insert the value in relevent place
        }
    }
}   
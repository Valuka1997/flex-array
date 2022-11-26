package FLEXARRAY;


public class FlexArray {
        
    //Declare an array
    private int[] arr0; 
    
    //Creating a constructor to initializes the array object
    public FlexArray(int[] arr0){
        this.arr0 = arr0;
    }
    
    /*Creating a method to add a element to a array if there is a
      position last*/
    public void insert(int insertValue){
            this.increase();
            arr0[arr0.length - 1 ] = insertValue;

    }
    
    // Creating a method to delete an element of array by using index
    public void deletByIndex(int deleteIndex){
        // temporary array to hold values without deleted index
         int [] arrTmpDel = new int [arr0.length - 1];

        // copy elements from original arr0 from beginning till deleteIndex into arrTmpDel
        System.arraycopy(arr0, 0, arrTmpDel, 0, deleteIndex); 
 
        // copy elements from arr0 from deleteIndex+1 till end into arrTmpDel
        System.arraycopy(arr0, deleteIndex+1, arrTmpDel, deleteIndex, arr0.length - deleteIndex-1);

        arr0 = arrTmpDel;

    }
    
    // Creating a method to delete an element with it's value
    public void deletByValue(int deleteValue){
        for(int i=0; i<arr0.length; i++){
            if(arr0[i] == deleteValue){
                // temporary array to hold values without deleted index
            int [] arrTmpDel = new int [arr0.length - 1];

            // copy elements from original arr0 from beginning till deleteIndex into arrTmpDel
            System.arraycopy(arr0, 0, arrTmpDel, 0, i); 
  
            // copy elements from arr0 from deleteIndex+1 till end into arrTmpDel
            System.arraycopy(arr0, i+1, arrTmpDel, i, arr0.length - i-1);
 
            arr0 = arrTmpDel;

                break; 
            }

            else if (i>=arr0.length){
                System.out.println("Cound't find the value" + deleteValue + "in index" + i);
                break; 
            }
        }
    }
   
    // Creating a method to update a value of an element in array
   public void update(int updateIndex, int updateValue){
       arr0[updateIndex] = updateValue;
   }
     
    //Creating a method to display all the elements of array
    public void display(){
        for(int i=0; i<arr0.length; i++){
            System.out.print(arr0[i] + "\t"); 
        }
    }
    
    
    //Creating a method to find a element in array
    public void search(int searchKey){
        for(int i=0; i<arr0.length; i++){
            if(arr0[i] == searchKey){
                System.out.println("Found" + searchKey + "in index" + i);
                break; 
            }
            else if(i == arr0.length){
                System.out.println("Cound't find the value" + searchKey + "in index" + i);
                break; 
            }
        }
    }
    //method of sorting  all the items of the array in ascending order
    
    
    //Creating a method to increase the array size for insert values
    public void increase(){
        int[] arr0Temp = new int[arr0.length + 1];
        System.arraycopy(arr0, 0, arr0Temp, 0, arr0.length);
        arr0 = arr0Temp;
    }

    //sort the array in acending order method
    public void sortAsc(){
       
        //sort by using insertion sort
        for (int mainLoop = 0; mainLoop < arr0.length; mainLoop++) {
            int temp = arr0[mainLoop];   //remove the value
            int searchLoop=mainLoop;    //start from main loop
            while (searchLoop>0 && arr0[searchLoop-1] >= temp) {
                arr0[searchLoop]=arr0[searchLoop-1];  //shifting to right
                searchLoop--;
            }
            arr0[searchLoop] = temp; //insert the value in relevent place
        }
    }
    //sort the array in decending order method
    public void sortDes(){
        //sort by using insertion sort
        for (int mainLoop = 1; mainLoop < arr0.length; mainLoop++) {
            int temp = arr0[mainLoop];  //remove the value
            int searchLoop=mainLoop;    //start from main loop
            while (searchLoop>0 && arr0[searchLoop-1] <= temp) {
                arr0[searchLoop]=arr0[searchLoop-1]   ;//shifting to right
                searchLoop--;
            }
            arr0[searchLoop] = temp;//insert the value in relevent place
        }
    }
}   
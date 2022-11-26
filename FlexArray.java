public class FlexArray {

    // Declare an array
    private int[] arr0;

    // Creating a constructor to initializes the array object
    public FlexArray(int[] arr0) {
        this.arr0 = arr0;
    }

    // method to add element to tail
    public void insert(int insertValue) {
        this.increase();
        arr0[arr0.length - 1] = insertValue;

    }

    // method to delete an element of array by using index
    public void deletByIndex(int deleteIndex) {
        // temporary array to hold values without deleted index
        int[] arrTmpDel = new int[arr0.length - 1];

        // copy elements from original arr0 from beginning till deleteIndex into
        // arrTmpDel
        System.arraycopy(arr0, 0, arrTmpDel, 0, deleteIndex);

        // copy elements from arr0 from deleteIndex+1 till end into arrTmpDel
        System.arraycopy(arr0, deleteIndex + 1, arrTmpDel, deleteIndex, arr0.length - deleteIndex - 1);

        arr0 = arrTmpDel;

    }

    // method to delete an element by it's value
    public void deletByValue(int deleteValue) {
        for (int i = 0; i < arr0.length; i++) {
            if (arr0[i] == deleteValue) {
                // temporary array to hold values without deleted index
                int[] arrTmpDel = new int[arr0.length - 1];

                // copy elements from original arr0 from beginning till deleteIndex into
                // arrTmpDel
                System.arraycopy(arr0, 0, arrTmpDel, 0, i);

                // copy elements from arr0 from deleteIndex+1 till end into arrTmpDel
                System.arraycopy(arr0, i + 1, arrTmpDel, i, arr0.length - i - 1);

                arr0 = arrTmpDel;

                break;
            }

            else if (i >= arr0.length) {
                System.out.println("Cound't find the value" + deleteValue + "in index" + i);
                break;
            }
        }
    }

    // method to update a value by index
    public void update(int updateIndex, int updateValue) {
        arr0[updateIndex] = updateValue;
    }

    // method to update a value by value
    public void updateVal(int toUpdated, int newValue) {
        for (int i = 0; i < arr0.length; i++) {
            if (arr0[i] == toUpdated) {
                System.out.println("Found" + toUpdated + "in index" + i);
                arr0[i] = newValue;
            }
            else{
                System.out.println("Cound't find the value" + toUpdated + "in array");
            }
        }
    }

    // method to display all the elements of array
    public void display() {
        for (int i = 0; i < arr0.length; i++) {
            System.out.print(arr0[i] + "\t");
        }
    }

    // method to find a element in array by index
    public void searchIndex(int searchKey) {
            if (arr0.length < searchKey) {
                System.out.println("Array size is less than the entered index");
            } else {
                System.out.println("Found" + arr0[searchKey] + "in index" + searchKey);
            }
        }

    // method to find a element in array by value
    public void search(int searchKey) {
        for (int i = 0; i < arr0.length; i++) {
            if (arr0[i] == searchKey) {
                System.out.println("Found" + searchKey + "in index" + i);
                break;
            } else if (i == arr0.length) {
                System.out.println("Cound't find the value" + searchKey + "in array");
                break;
            }
        }
    }

    // method to increase the array size by 1
    public void increase() {
        int[] arr0Temp = new int[arr0.length + 1];
        System.arraycopy(arr0, 0, arr0Temp, 0, arr0.length);
        arr0 = arr0Temp;
    }

    // method of sorting all the items of the array in ascending order
    public void sortAsc() {

        // sort by using insertion sort
        for (int mainLoop = 0; mainLoop < arr0.length; mainLoop++) {
            int temp = arr0[mainLoop];
            int searchLoop = mainLoop;
            while (searchLoop > 0 && arr0[searchLoop - 1] >= temp) {
                arr0[searchLoop] = arr0[searchLoop - 1];
                searchLoop--;
            }
            arr0[searchLoop] = temp;
        }
    }

    //view array in ascending order
    public void viewAsc() {

        int [] arr1 = arr0;
        // sort by using insertion sort
        for (int mainLoop = 0; mainLoop < arr1.length; mainLoop++) {
            int temp = arr1[mainLoop];
            int searchLoop = mainLoop;
            while (searchLoop > 0 && arr1[searchLoop - 1] >= temp) {
                arr1[searchLoop] = arr1[searchLoop - 1];
                searchLoop--;
            }
            arr1[searchLoop] = temp;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }

    // sort the array in decending order method
    public void sortDes() {
        // sort by using insertion sort
        for (int mainLoop = 1; mainLoop < arr0.length; mainLoop++) {
            int temp = arr0[mainLoop];
            int searchLoop = mainLoop;
            while (searchLoop > 0 && arr0[searchLoop - 1] <= temp) {
                arr0[searchLoop] = arr0[searchLoop - 1];
                searchLoop--;
            }
            arr0[searchLoop] = temp;
        }
    }

    // View the array in decending order method
    public void viewDes() {
        int [] arr1 = arr0;
        // sort by using insertion sort
        for (int mainLoop = 1; mainLoop < arr1.length; mainLoop++) {
            int temp = arr1[mainLoop];
            int searchLoop = mainLoop;
            while (searchLoop > 0 && arr1[searchLoop - 1] <= temp) {
                arr1[searchLoop] = arr1[searchLoop - 1];
                searchLoop--;
            }
            arr1[searchLoop] = temp;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }
}
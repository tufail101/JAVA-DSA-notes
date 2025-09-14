public class Linear_Search{
    static int linearSearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }
    //TODO: Explore Time and Space coplexity
    public static void main(String agrs[]){
        int arr [] ={10,20,30,40,50};
        int key = 40;
        int index = linearSearch(arr, key);
        if(index == -1){
            System.err.println("Key:" + key + "not found in arr");
        }else{
            System.err.println("key: " + key + " at index: " + index);
        }

    }
}
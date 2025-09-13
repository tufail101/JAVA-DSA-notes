//Array as Function Arguments
public class Array_As_args{
    static void update(int array[]){
        for(int i = 0; i < array.length; i++){
            array[i] = array[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        update(marks);

        for (int i = 0; i < marks.length; i++) {
            
        System.out.println(marks[i]);
        }
    }
}
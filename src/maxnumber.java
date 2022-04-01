
public class maxnumber {


    public void maxnumber(int [] array ){
        int max_number = array[0];
        for (int i =0; i< array.length; i++){
            if (array[i] > max_number){
                max_number = array[i];
            }
        }

         System.out.println("die größte zahl ist: " + max_number);

    }
}

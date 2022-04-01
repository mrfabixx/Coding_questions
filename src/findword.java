public class findword {

    public void Übung_3(){

        int count = 0 ;
        String find_char = "auto";
        String [] array ={"auto", "boot", "fledemaus"};
        for (int i=0; i<= array.length-1; i++){
            if(array[i] == find_char){
                count ++;
                System.out.println("buchstaben gefunden: " + count + " mal ");

            }
        }
    }
    }


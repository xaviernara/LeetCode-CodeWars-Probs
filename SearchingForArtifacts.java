import java.util.*;

class SearchingForArtifacts {

   public static void main(){
      System.out.println(searchingForArtifacts(3,"1B 2C 2D 4D", "2B 2D 3D 4D 4A"));
   
   }



    public static int[] searchingForArtifacts (int N, String artifacts, String searched) {
        // write your code in Java
        int[][]array = new int[N][N];
        int row1 = 0;
        int col1 = 0;
        int count =0;

        array = populateArray(array);


        //int[][] searchedArray = new int[N][N];

        //populating array[][] with artifacts spots
        for(int i = 0; i<artifacts.length(); i++){
          if(count != 2){
             if(Character.isLetter(artifacts.charAt(i))){
                 col1 = convertLetterToNumber(artifacts.charAt(i));
            }else{
                 row1 = Character.getNumericValue(artifacts.charAt(i));
            }// you can also use imports, for example:
         }else{
            array[row1 -1][col1 -1] = 1;
            count = 0;
         } 

          count++;
        }
        
        count = 0;

         //populating array[][] with searched spots
        for(int i = 0; i<searched.length(); i++){
          if(count != 2){
             if(Character.isLetter(searched.charAt(i))){
                 col1 = convertLetterToNumber(searched.charAt(i));
            }else{
                 row1 = Character.getNumericValue(searched.charAt(i));
            }// you can also use imports, for example:
         }else{
           if(array[row1 -1][col1 -1] == 1){
              array[row1 -1 ][col1 -1] = 2;
           }else{
              array[row1 -1][col1 - 1] = 0;
           }
            
            count = 0;
         } 

          count++;
        }

     
      int[] result = new int[2];
    /*
       for(int row = 0; row<array.length;row++){
         for(int col =0; col<array[row].length;col++ ){
           //System.out.println(array[row][col] + '/t');


          }
       }
      */
     
        
       
        

      return findArtifact(array);   
 
    }

    public int convertLetterToNumber(char letter){

      int result = 0;

      result*= 26;
      result += letter - 'A'+1;
      return result;

    }

    public static int[][] populateArray(int[][] array){

       for(int row = 0; row<array.length;row++){
         for(int col =0; col<array[row].length;col++ ){
           array[row][col] = 0;
           System.out.println(array[row][col] + '\t');

          }
       }

        return array;

    } 

    public static int[] findArtifact(int[][] array){

     int[] result = new int[2];

       for(int row = 0; row<array.length;row++){
         for(int col =0; col<array[row].length;col++ ){
           //array[row][col]= 0;
           //System.out.println(array[row][col] + '/t');
           if(array[row][col] == 1){
             result[0] = row;
             result[1] = col;
             return result;
           }

          }
       }

        return new int[2];

    } 


}
public class isogram {
    public static boolean  isIsogram(String str) {
      String strLower = str.toLowerCase();
      int contador;
      
        for (char c : strLower.toCharArray()){
          contador = 0;
          
          for (char a : strLower.toCharArray()){
            if(a==c){contador++;}
            } 
          
          if (contador >= 2){return false;}
          }
      
      return true;
    } 
}

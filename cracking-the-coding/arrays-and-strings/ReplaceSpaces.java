public class ReplaceSpaces {

  public static void main (String[] args){

    System.out.println(replaceSpaces("Hey hey it's Dize"));
  }

  public static String replaceSpaces(String s){
    char[] charArray = s.toCharArray();
    String newS = "";
    for (int i = 0; i < charArray.length; i++) {
      if(charArray[i] == ' '){
        newS += "%20";
      } else {
        newS += charArray[i];
      }
    }
    return newS;
  }

}

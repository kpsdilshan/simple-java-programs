
package removevowelsfromastring;

/**
 *
 * @author Supun Dilshan
 */
public class RemoveVowelsFromAString {

    public static String removeVowels(String str){
        return str.replaceAll("[AaEeIiOoUu]", "");
    }
    
    public static void main(String[] args) {
        String newStr = removeVowels("This is A Example for It");
        System.out.println(newStr);
    }
    
}

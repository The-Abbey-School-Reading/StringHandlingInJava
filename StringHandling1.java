public class StringHandlingExample {
    public static void main(String[] args) {
        // String handling
        String str = "Hello, World!";
        
        // Length
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // Position (indexOf)
        int position = str.indexOf('W');
        System.out.println("Position of 'W' in the string: " + position);
        
        // Substring
        String substring = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substring);
        
        // Concatenation
        String str2 = " How are you?";
        String concatenatedString = str.concat(str2);
        System.out.println("Concatenated string: " + concatenatedString);
    }
}

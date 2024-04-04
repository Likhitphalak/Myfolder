public class DuplicateCharacters {
    public static void main(String[] args) {
        String string1 = "winsoft technologies";
        int count;
        char[] string = string1.toCharArray();

        System.out.println("Duplicate characters in the given string:");
        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                
                }
            }
            if (count > 1 && string[i] != '0') {
                System.out.print(string[i] + " ");
            }
        }
    }
}
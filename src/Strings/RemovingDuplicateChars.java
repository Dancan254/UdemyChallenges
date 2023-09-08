package Strings;

public class RemovingDuplicateChars {
    public static void main(String[] args) {
        checkDuplicate("helllo");
    }

    //using String bUilder
    public static void checkDuplicate(String string){
        //hello
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {

            char character = string.charAt(i);
            if (builder.indexOf(String.valueOf(character)) == -1){
                builder.append(character);
            }
        }
        System.out.println(builder);
    }
}

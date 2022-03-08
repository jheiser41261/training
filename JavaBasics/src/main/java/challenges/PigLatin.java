package challenges;

public class PigLatin {
    public static String encrypt(String sentence){

        //Creates an empty StringBuilder for holding the encrypted phrase
        StringBuilder pigSentence = new StringBuilder();

        //Splits the given String into an array of individual words
        String[] words = sentence.split( " ");

        //Iterates through the array and encrypts each word
        for(String word : words){ //Ex: words[0] = "Test"
            pigSentence
                    .append(word.substring(1)) //pigSentence = "est"
                    .append(word.charAt(0)) //pigSentence = "estT"
                    .append("ay "); //pigSentence = "estTay "
        }

        return pigSentence.deleteCharAt(pigSentence.length() - 1).toString();
    }

    public static String decrypt(String sentence){

        //Creates an empty StringBuilder for the decrypted phrase
        StringBuilder boringLanguage = new StringBuilder();

        //Splits the given String into an array of individual words
        String[] words = sentence.split( " ");

        //Iterates through the array and decrypts each word
        for(String word : words){ //Ex: words[0] = "estTay"
            word = word.replace("ay",""); //words[0] = "estT"
            boringLanguage
                    .append(word.charAt(word.length() - 1)) //boringLanguage = "T"
                    .append(word, 0, word.length() - 1) //boringLanguage = "Test"
                    .append(" "); //boringLanguage = "Test "
        }
        return boringLanguage.toString();
    }

    public static boolean isValidSentence(String sentence) {

        //Splits the given String into an array of individual words
        String[] words = sentence.split(" ");
        boolean isValid = true; //The given String is valid by default

        //Iterates through the array and checks for invalid characters
        for(String word : words){
            for(int c = 0; c < word.length(); c++){
                if(!Character.isLetter(word.charAt(c))){ //Checks every character in every word
                    isValid = false; //Sentence is invalid if any character is not a letter
                }
            }
        }
        return isValid;
    }
}

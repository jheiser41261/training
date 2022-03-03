package challenges;

public class PigLatin {
    public static String encrypt(String sentence){
        if(!isValidSentence(sentence)){
            return "Invalid Sentence";
        }

        StringBuilder pigSentence = new StringBuilder("");

        String[] words = sentence.split( " ");

        for(String word : words){
            pigSentence
                    .append(word.substring(1))
                    .append(word.charAt(0))
                    .append("ay ");
        }

        return pigSentence.deleteCharAt(pigSentence.length() - 1).toString();
    }

    public static String decrypt(String sentence){
        if(!isValidSentence(sentence)){
            return "Invalid Sentence";
        }

        StringBuilder boringLanguage = new StringBuilder("");

        String[] words = sentence.split( " ");

        for(String word : words){
            word = word.replace("ay","");
            boringLanguage
                    .append(word.charAt(word.length() - 1))
                    .append(word.substring(0, word.length() - 1))
                    .append(" ");
        }
        return boringLanguage.toString();
    }

    public static boolean isValidSentence(String sentence) {
        String[] words = sentence.split(" ");
        boolean isValid = true;

        for(String word : words){
            for(int c = 0; c < word.length(); c++){
                if(!Character.isLetter(word.charAt(c))){
                    isValid = false;
                }
            }
        }
        return isValid;
    }
}

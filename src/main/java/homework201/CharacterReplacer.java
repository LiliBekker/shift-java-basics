package homework201;

public class CharacterReplacer {

    public String getStringWithCharacterReplacement(String input, char target) {

        String deleteExtraSpaces = deleteExtraSpaces(input);
        String replaceCharWithSpace = replaceCharWithSpace(deleteExtraSpaces, target);

        return deleteExtraSpaces(replaceCharWithSpace);
    }

    private String deleteExtraSpaces(String text) {
        return text.trim().replaceAll("\\s+", " ");
    }

    private String replaceCharWithSpace(String text, char target) {
        return text.replace(target, ' ');
    }
}
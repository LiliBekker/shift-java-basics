package homework201;

public class CharacterReplacer {

    public String getStringWithCharacterReplacement(String input, char target) {
        String replaceCharWithSpace = replaceCharWithSpace(input, target);
        return deleteExtraSpaces(replaceCharWithSpace);
    }

    private String deleteExtraSpaces(String text) {
        return text.trim().replaceAll(" +", " ");
    }

    private String replaceCharWithSpace(String text, char target) {
        return text.replace(target, ' ');
    }
}
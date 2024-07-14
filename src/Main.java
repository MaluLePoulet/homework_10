public class Main {

    public static void main(String[] args) {
        String documentNumber = "5554-abc-5678-def-1a2b";
        System.out.println("Two first blocks: " + getFirstTwoBlocks(documentNumber));
        System.out.println("Document number with ***: " + replaceLettersWithAsterisks(documentNumber));
        System.out.println("Letters in lowercase: " + getLettersInLowerCase(documentNumber));
        System.out.println(getLettersInUpperCase(documentNumber));
        System.out.println(checkSequence(documentNumber, "abc"));
        System.out.println(checkStartsWith(documentNumber, "555"));
        System.out.println(checkEndsWith(documentNumber, "1a2b"));
    }

    public static String getFirstTwoBlocks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        return blocks[0] + " " + blocks[2];
    }

    public static String replaceLettersWithAsterisks(String documentNumber) {
        return documentNumber.replaceAll("[a-zA-Z]{3}", "***");
    }

    public static String getLettersInLowerCase(String documentNumber) {
        String letters = documentNumber.replaceAll("[^a-zA-Z]", "");
        String var10000 = letters.substring(0, 3).toLowerCase();
        return var10000 + "/" + letters.substring(3, 6).toLowerCase() + "/" + letters.substring(6, 7).toLowerCase() + "/" + letters.substring(7, 8).toLowerCase();
    }

    public static String getLettersInUpperCase(String documentNumber) {
        String letters = documentNumber.replaceAll("[^a-zA-Z]", "");
        StringBuilder stringBuilder = new StringBuilder("Letters:");
        stringBuilder.append(letters.substring(0, 3).toUpperCase()).append("/").append(letters.substring(3, 6).toUpperCase()).append("/").append(letters.substring(6, 7).toUpperCase()).append("/").append(letters.substring(7, 8).toUpperCase());
        return stringBuilder.toString();
    }

    public static String checkSequence(String documentNumber, String sequence) {
        return documentNumber.toLowerCase().contains(sequence.toLowerCase()) ? "The document number contains the sequence " + sequence : "The document number does not contain the sequence " + sequence;
    }

    public static String checkStartsWith(String documentNumber, String sequence) {
        return documentNumber.startsWith(sequence) ? "The document number starts with the sequence " + sequence : "The document number does not start with the sequence " + sequence;
    }

    public static String checkEndsWith(String documentNumber, String sequence) {
        return documentNumber.endsWith(sequence) ? "The document number ends with the sequence " + sequence : "The document number does not end with the sequence " + sequence;
    }
}

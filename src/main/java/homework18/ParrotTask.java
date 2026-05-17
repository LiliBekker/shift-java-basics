package homework18;

public class ParrotTask {

    public static void main(String[] args) {
        System.out.println("Задача №2 — 38 попугаев");
        calculateAnimalLengths();
    }

    private static void calculateAnimalLengths() {
        float boaLength = 3.8f;
        float parrotLength = boaLength / 38;
        float monkeyLength = boaLength / 5;
        float elephantLength = boaLength / 2;

        float totalLength =
                boaLength
                        + parrotLength
                        + monkeyLength
                        + elephantLength;

        System.out.println("Рост удава: " + boaLength + " м");
        System.out.println("Рост попугая: " + parrotLength + " м");
        System.out.println("Рост мартышки: " + monkeyLength + " м");
        System.out.println("Рост слонёнка: " + elephantLength + " м");
        System.out.println("Суммарный рост: " + totalLength + " м");
    }
}
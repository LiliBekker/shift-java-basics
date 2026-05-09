package homework18;

public class LogicalOperationTable {

    static void main(String[] args) {
        System.out.println("Задача №1- Таблица истинности");
        taskTruthTable();

        System.out.println("\nЗадача №2 – 38 попугаев");
        taskParrots();
    }

    private static void taskTruthTable() {
        System.out.println("P\t\tQ\t\tP AND Q\t\tP OR Q\t\tP XOR Q\t\tNOT P");

        boolean[] values = {false, true};

        for (boolean q : values) {
            for (boolean p : values) {
                System.out.println(
                        p + "\t" + q + "\t" + (p && q) + "\t\t" + (p || q) + "\t\t" + (p ^ q) + "\t\t" + (!p)
                );
            }
        }
    }

    private static void taskParrots() {
        float boaLength = 3.8f;
        float parrotLength = boaLength / 38;
        float monkeyLength = boaLength / 5;
        float elephantLength = boaLength / 2;

        float totalLength = boaLength + parrotLength + monkeyLength + elephantLength;

        System.out.println("Рост удава: " + boaLength + "м");
        System.out.println("Рост попугая: " + parrotLength + "м");
        System.out.println("Рост мартышки: " + monkeyLength + "м");
        System.out.println("Рост слонёнка: " + elephantLength + "м");
        System.out.println("Суммарный рост: " + totalLength + "м");
    }
}
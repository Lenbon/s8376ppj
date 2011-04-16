package zadanie04_2;

public class Employee {
    String[][] storage;

    public Employee() {
        storage = new String[][] { new String[] { "AB", "10", "12", "75" },
                new String[] { "ZK", "03", "03", "85" },
                new String[] { "OL", "12", "11", "80" },
                new String[] { "PE", "26", "07", "72" },

                new String[] { "ZA", "03", "03", "85" },
                new String[] { "OB", "12", "11", "80" },
                new String[] { "PC", "26", "07", "72" },
                new String[] { "ZD", "03", "03", "85" },
                new String[] { "OE", "12", "11", "80" },
                new String[] { "PF", "26", "07", "72" },
                new String[] { "ZG", "03", "03", "85" },
                new String[] { "OH", "12", "11", "80" },
                new String[] { "PI", "26", "07", "72" },
                new String[] { "ZJ", "03", "03", "85" },
                new String[] { "OK", "12", "11", "80" },
                new String[] { "PL", "26", "07", "72" },
                new String[] { "ZM", "03", "03", "85" },
                new String[] { "ON", "12", "11", "80" },
                new String[] { "PO", "26", "07", "72" },
                new String[] { "ZP", "03", "03", "85" },
                new String[] { "OR", "12", "11", "80" },
                new String[] { "PS", "26", "07", "72" },
                new String[] { "ZT", "03", "03", "85" },
                new String[] { "OQ", "12", "11", "80" },
                new String[] { "PW", "26", "07", "72" },
                new String[] { "ZX", "03", "03", "85" },
                new String[] { "OY", "12", "11", "80" },
                new String[] { "PZ", "26", "07", "72" },

                new String[] { "KE", "30", "05", "66" } };
    }

    public String[] getInitials() {
        String[] returnArray = new String[storage.length];

        for (int x = 0; x < storage.length; x++) {
            returnArray[x] = storage[x][0];
        }

        return returnArray;
    }

    public String[][] getStorage() {
        return storage;
    }
}

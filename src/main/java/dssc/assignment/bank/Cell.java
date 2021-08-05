package dssc.assignment.bank;

public class Cell {

    private static final String ZERO_CELL =
                    " _ " +
                    "| |" +
                    "|_|";
    private static final String ONE_CELL =
                    "   " +
                    "  |" +
                    "  |";
    private String cellAsText;

    public Cell(String cellAsText) {
        this.cellAsText = cellAsText;
    }

    @Override
    public String toString() {
        if (ZERO_CELL.equals(cellAsText)) {
            return Integer.toString(0);
        } else if (ONE_CELL.equals(cellAsText)) {
            return Integer.toString(1);
        } else {
            return Integer.toString(3);
        }
    }
}

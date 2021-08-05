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

    private static final String TWO_CELL =
                    " _ " +
                    " _|" +
                    "|_ ";



    private String cellAsText;

    public Cell(String cellAsText) {
        this.cellAsText = cellAsText;
    }

    @Override
    public String toString() {

        switch (cellAsText){
            case ZERO_CELL: return "0";
            case ONE_CELL: return "1";
            case TWO_CELL: return  "2";
        }
        return "3";

    }
}

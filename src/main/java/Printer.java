public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int getTonerVolume() {
        return this.toner;
    }

    public void print(int pages, int copies) {
        int pagesNumber = pages * copies;
        if(this.sheets >= pagesNumber && this.toner >= pagesNumber) {
            this.sheets -= pagesNumber;
            this.toner -= pagesNumber;
        }
    }
}


package Bridge.Sample;

public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rowOpen() {
        printLine();
    }

    @Override
    public void rowPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rowClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");

        }
        System.out.println("+");
    }
}

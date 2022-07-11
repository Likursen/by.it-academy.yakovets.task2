package page.field;

public enum Label {
    FIRSTNAME("firstname"),
    LASTNAME("lastname");

    private final String xpathValue;

    Label(String xpathValue) {
        this.xpathValue = xpathValue;
    }

    public String getXpathValue() {
        return xpathValue;
    }
}
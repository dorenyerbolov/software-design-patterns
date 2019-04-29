package WM;

public class Element {
    private String name;
    private String innerText;
    private String xPos;
    private String yPos;

    public Element(String name, String innerText, String xPos, String yPos) {
        this.name = name;
        this.innerText = innerText;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInnerText() {
        return innerText;
    }

    public void setInnerText(String innerText) {
        this.innerText = innerText;
    }

    public String getX() {
        return xPos;
    }

    public void setX(String xPos) {
        this.xPos = xPos;
    }

    public String getY() {
        return yPos;
    }

    public void setY(String yPos) {
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", name, innerText, xPos, yPos);
    }
}

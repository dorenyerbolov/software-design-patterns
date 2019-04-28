package Managers;

public class Node {
    private String nodeName;
    private String innerText;
    private String xPos;
    private String yPos;

    public Node(String nodeName, String innerText, String xPos, String yPos) {
        this.nodeName = nodeName;
        this.innerText = innerText;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
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
        return String.format("Name: %s\nInnerText: %s\nxPos: %s\nyPos: %s\n", nodeName, innerText, xPos, yPos);
    }
}

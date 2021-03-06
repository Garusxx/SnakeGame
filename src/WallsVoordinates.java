public class WallsVoordinates {
    int x;
    int y;
    int size;
    int direction;

    public WallsVoordinates(int x, int y, int size, int direction) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

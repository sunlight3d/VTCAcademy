package lab3.bai03;

public class Rectangle implements IShape {
    private double x, y, a, b;

    public Rectangle(double x, double y, double a, double b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    @Override
    public void moveUp() {
        this.y++;
    }

    @Override
    public void moveDown() {
        this.y--;
    }

    @Override
    public void moveLeft() {
        this.x--;
    }

    @Override
    public void moveRight() {
        this.x++;
    }
}

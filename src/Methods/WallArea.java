package Methods;

public class WallArea {
   private double width;
   private double height;

    public WallArea() {
    }

    public WallArea (double width, double height){
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0){
            this.width = 0;
        } else this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0){
            this.height = 0;
        } else this.height = height;
    }

    public double getArea(){
        return this.height * this.width;
    }

    public static void main(String[] args) {
        WallArea wall = new WallArea(5, 4);
        System.out.println(wall.getArea());
        wall.setHeight(-1.5);
        System.out.println(wall.getWidth());
        System.out.println(wall.getHeight());
        System.out.println(wall.getArea());
    }
}

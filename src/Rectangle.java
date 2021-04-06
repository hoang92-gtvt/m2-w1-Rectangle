public class Rectangle {
    double width;
    double heigth;

    public Rectangle(double _width, double _heigth) {
        this.width = _width;
        this.heigth = _heigth;
    }
    public double getArea(){
        return this.width*this.heigth;
    }
    public double getPrimeter(){
        return (this.width+this.heigth)*2;
    }
    public void display(){
        double[] arr = new double[2];
        arr[0]=this.width;
        arr[1]=this.heigth;
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }
    }


    public static void main(String[] args) {

    }

}

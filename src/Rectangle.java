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
            System.out.println(arr[i]);
        }

    }


    public static void main(String[] args) {
        Rectangle hcn1= new Rectangle(5,10);
        hcn1.display();
        double dientich= hcn1.getArea();
        double chuvi=hcn1.getPrimeter();
        System.out.println("Diện tích hình chữ nhật là " + dientich);
        System.out.println("Chu vi hình chữ nhật là "+ chuvi);
    }

}

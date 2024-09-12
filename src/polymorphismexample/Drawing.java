package polymorphismexample;

public class Drawing {

    public void draw(){
        System.out.println("draw method without params");
    }

    public void draw(int a){
        System.out.println("draw method with one params:"+a);
    }

    public void draw(int a, int b){
        System.out.println("draw method with two params:"+a+" and "+b);
    }

    public void draw(float a){
        System.out.println("draw method with one params:"+a);
    }

    public double draw(double a){
        System.out.println("draw method with one double params:"+a);
        return a;
    }
}

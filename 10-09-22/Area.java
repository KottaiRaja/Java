class kgm1{
    void Rectangle(int l, int b){
        System.out.println("Rectangle:"+l*b);
    }
}

class kgm2 extends kgm1{
    void Rhombus(float d1, float d2){
        System.out.println("Rhombus:"+(d1*d2)/2);
    }
}

class Area{
    public static void main(String args[]){
        kgm2 a = new kgm2();
        a.Rectangle(12,13);
        a.Rhombus(20.5f,30.5f);
    }
}
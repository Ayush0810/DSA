 class inheritance {
    protected String brand = "ford";
    public void honk(){
        System.out.println("tuut , tuut!");
    }
}

 class Car extends inheritance{
    private String modelName= "mustang";
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println("my car name" + myCar.modelName);
        System.out.println("my car brand name" + myCar.brand);
    }
}
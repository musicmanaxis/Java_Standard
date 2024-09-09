package Java_UpGrade;

/*
빌더패턴1:생성자의 매개변수가 많을 경우 빌더패턴을 이용하여
        사용자가 원하는데로 생성자타입을 생성할 수 있다.
        생성자매개변수가 하나혹은 그 이상의 것을 입맛데로 생성할 수 있음..
*/


public class Java_Bulder_Pattern1 {
    public static void main(String[] args) {
        Car1 car1=new Car1("V6", true, "red", false, true );

        Car1 car2=new CarBuilder1()
                .setEngine("V4")
                .setColor("blue")
                .build();       //이런식으로 조절할 수 있다.

        System.out.println(car1);
        System.out.println(car2);
    }


}


class Car1{
    private String engine;
    private boolean airbag;
    private String color;
    private boolean carmeraSense;
    private boolean ABS;

    public Car1(String engine, boolean airbag, String color, boolean carmeraSense, boolean ABS) {
        this.engine = engine;
        this.airbag = airbag;
        this.color = color;
        this.carmeraSense = carmeraSense;
        this.ABS = ABS;
    }

    @Override
    public String toString() {  //car객체를 설명하기 위해서...
        return "Car1{" +
                "engine='" + engine + '\'' +
                ", airbag=" + airbag +
                ", color='" + color + '\'' +
                ", carmeraSense=" + carmeraSense +
                ", ABS=" + ABS +
                '}';
    }

}

class CarBuilder1{
    private String engine;
    private boolean airbag;
    private String color;
    private boolean carmeraSense;
    private boolean ABS;

    public CarBuilder1 setEngine(String engine) {  //set계열 메서드이지만 반환타입이 클래스 객체임을 주목
        this.engine = engine;
        return this;    //객체를 반환하여야 메서드 체이닝을 할 수 있다.
        // 메서드 체이닝:carbuilder1.setEngine(gear).setColer(blue).setABS(true) 이런식으로 메서드들을 연결하는것
    }

    public CarBuilder1 setAirbag(boolean airbag) {
        this.airbag = airbag;
        return this;
    }

    public CarBuilder1 setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder1 setCarmeraSense(boolean carmeraSense) {
        this.carmeraSense = carmeraSense;
        return this;
    }

    public CarBuilder1 setABS(boolean ABS) {
        this.ABS = ABS;
        return this;
    }

    public Car1 build(){
        return new Car1(engine, airbag, color, carmeraSense, ABS);
        //CarBuilder1의 필드값을 Car1의 생성자에 주입했다.
    }


}

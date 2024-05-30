package Ex7;

//인터페이스를 이용한 다형성
interface Parsable{
    public abstract void parse(String fileName);
}

class ParseManager{
    public static Parsable getParser(String fileName){  //리턴타입이 Parsable에 주목
        if(fileName.equals("XML")){
            return new XMLParser();    //Parsable을 구현한 클래스의 객체를 반환
        }else if(fileName.equals("HTML")){
            return new HTMLParser();   //Parsable을 구현한 클래스의 객체를 반환
        }else{
            return null;

        }
    }

    public void msg(){
        System.out.println("Can Not Parse");
    }
}

class XMLParser implements Parsable{
    public void parse(String fileName){        ////Parsable인터페이스 메서드 구현
        System.out.println(fileName+"Parse is Running");
    }
}

class HTMLParser implements Parsable{
    public void parse(String fileName){
        System.out.println(fileName+"Parse is Running");
    }
}


public class Ex7_25 {
    public static void main(String[] args) {
        Parsable parse= ParseManager.getParser("XML");  //실제로는 XMLParser객체이고 타입이 인터페이스형
        parse.parse("XML");   //실제로는 XMLParser객체이기 떼문에 메서드는 실제객체의 클래스 메서드가 실행된다.
        Parsable parse1= ParseManager.getParser("HTML");
        parse1.parse("HTML");

    }

}

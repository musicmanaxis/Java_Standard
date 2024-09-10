package Java_Design_Pattern;

public class Java_Singleton_Pattern {

    public static void main(String[] args) {
        Singleton s1=Singleton.getSingletonSpeaker();
        Singleton s2=Singleton.getSingletonSpeaker();

        System.out.println("s1.getVolume():"+s1.getVolume());
        System.out.println("s2.getVolume():"+s2.getVolume());

        s1.setVolume(100);

        System.out.println("s1.getVolume():"+s1.getVolume());
        System.out.println("s2.getVolume():"+s2.getVolume());
    }
}


 class Singleton{
    private static  Singleton singletonSpeaker;  //  **여기 주목...
    private int volume;
    private Singleton(){
        volume=3;
    }

    public static Singleton getSingletonSpeaker(){ // **여기 주목
        if(singletonSpeaker==null){
            singletonSpeaker=new Singleton();

            System.out.println("인스턴스가 생성되었습니다.");
        }else{
            System.out.println("이미 인스턴스가 존재합니다.");

        }
         return singletonSpeaker;
     }

     public int getVolume(){
        return this.volume;
     }

     public void setVolume(int a){
        volume=a;
     }

}
package Test;

//싱글톤:하나의 객체만 생성해서 사용할 경우
//예)크롬탭에 한 아이디로 로그인하면 여러탭을 띄워도 동일아이디 정보가 남아있게 작동시킬 경우에 해당ㄹ


public class SingleToneTest {

    public static void main(String[] args) {
        Tab tab1= new Tab();
        Tab tab2= new Tab();
        Tab tab3= new Tab();

        System.out.println(tab1.getSetting().getField());
        tab2.getSetting().setField(3);
        System.out.println(tab1.getSetting().getField());
    }
}



 class Setting {   //이 클래스를 싱글톤으로 만든다!!. 여기부분이 핵심
     private int a;
     private static Setting s;   //자신의 클래스도 필드로 가능

     private Setting() { }  //생성자를 private로!!


     public static Setting getInstance() {

        if(s==null) {  //프로그램이 처음 호출시 생성됨
            s= new Setting();
        }

        return s;
     }

     public int  getField() {
         return this.a;

     }

     public void  setField(int a) {
         this.a=a;

     }
 }

 class Tab{
        Tab(){}
        private  Setting s=Setting.getInstance();  //공유되는 유일한 인스턴스를 받아온다.

        public Setting getSetting(){
            return s;
        }

 }



package Ex7;

public class Ex7_26 {
    public static void main(String[] args) {
        SCV scv=new SCV();
        Tank tank=new Tank();
        tank.hitPoint=30;
        System.out.println("Tank의 hitPoint="+tank.hitPoint);

        Marine mar=new Marine();
        DropShip ds=new DropShip();

        scv.repair(tank);
    }
}


interface Repairable{} //이런식으로도 인터페이스를 빈껍데기로 정의할수 있다..
//이 인터페이스의 용도는  고칠수 있는 대상만 관련지을려고 정의한 것이다.

class Unit{
    int hitPoint;
    final int HP_MAX;  //각 객체가 가질수 있는 생명력 최대치
    Unit(int hp){
        HP_MAX=hp;
    }
}

class GroundUnit extends Unit{
    GroundUnit(int hp){
        super(hp);
    }
}

class AirUnit extends Unit{
    AirUnit(int hp){
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable{
    Tank(){
        super(150);  //탱크 객체를 생성하면 생명력을 150 준다.
        hitPoint=HP_MAX;
    }

    public  String toString(){return "Tank";}
}

class Marine extends GroundUnit{    //마린은 고칠수 있는 대상에서 제외시켜서 Repairable 인터페이스를 implement 않도록 했다.
    Marine(){
        super(40);
        hitPoint=HP_MAX;
    }
    public String toString(){return "Marine";}
}

class SCV extends GroundUnit implements Repairable{
    SCV(){
        super(60);
        hitPoint=HP_MAX;
    }

    public void repair(Repairable r){  //(Repairable 를 구현한 객체만 수리할수 있게 했다.
        if(r instanceof Unit){
            Unit u=(Unit)r;
            System.out.print("-수리중:");
            while(u.hitPoint != u.HP_MAX){
               System.out.print("#");
                try {
                    Thread.sleep(100);
                } catch(Exception e){

                }
                u.hitPoint++;

            }
            System.out.println();
            System.out.println(u+"의 수리를 마쳤습니다.");
            System.out.print(u+"의 현재성능:"+u.hitPoint);
        }

    }

    public  String toString(){return "SCV";}
}

class DropShip extends AirUnit implements Repairable{
    DropShip(){
        super(125);
        hitPoint=HP_MAX;
    }

    public String toString(){return "DropShip";}
}

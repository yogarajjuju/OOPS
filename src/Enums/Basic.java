package Enums;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //These are enum constants
        //public , static and final member
        // since it is final we cannot create child enums
        //The type is Week

        Week() {
            System.out.println("Constructor called for "+this);
        }
        // this is not public or protected , only private or default
        //why? we don't want to create new objects
        // thus this is not the enum concept ,thats why


        // internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week= Week.Sunday;
        //week=Week.Friday;


//        for(Week day:Week.values()){
//            System.out.println(day);
//        }
        System.out.println(week.ordinal());
    }
}

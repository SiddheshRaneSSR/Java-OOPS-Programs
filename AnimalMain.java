
/*
 * 
 * 
 * attirutes : name age 
 * metods : sound 
 * 
 * superclass : animal  --will have attibutes
 * sub class cat dog bird  -- will have method
 * 
 * 
 * 
 * 
 * 
 */


class animal{
    String name;
    int age;

}

class cat extends animal{
    cat(String name,int age){
        super.name=name;
        super.age=age;
    }

    public void sound(){
        System.out.printf("%s says MEOW\n",super.name);
    }
}

class dog extends animal{
    dog(String name,int age){
        super.name=name;
        super.age=age;


    }


    public void sound(){
        System.out.printf("%s BARK\n",super.name);
    }
}

class bird extends animal{
    bird(String name,int age){
        super.name=name;
        super.age=age;
    }

    public void sound(){
        System.out.printf("%s CHU\n",super.name);
    }
}








 class AnimalMain{
        public static void main(String [] args) {
            
            cat pussycat = new cat("pussy",5);
            pussycat.sound();
            dog sheru = new dog("sheru",10);
            sheru.sound();
            bird eagle = new bird("eagle",1);
            eagle.sound();
        }    
 }
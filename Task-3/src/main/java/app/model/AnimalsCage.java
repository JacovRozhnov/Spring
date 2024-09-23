package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import java.sql.Time;
import java.time.LocalDateTime;


@Component
public class AnimalsCage {


    private final Animal animal1;
    private final Animal animal2;
    private final Timer time;


    @Autowired
    public AnimalsCage(@Qualifier("cat") Animal animal1, @Qualifier("dog") Animal animal2, Timer time) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.time = time;
    }
    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal1.toString()+" "+animal2.toString());
        System.out.println("At:");
        System.out.println(time.getTime());
        System.out.println("________________________");
    }


    public Timer getTimer() {
        return time;
    }
}

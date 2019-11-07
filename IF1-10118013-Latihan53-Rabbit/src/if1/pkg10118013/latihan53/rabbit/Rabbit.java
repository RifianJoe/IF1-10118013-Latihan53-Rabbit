/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan53.rabbit;

/**
 *
 * @author Rifian
 */
public class Rabbit extends Animal{
    private final String color;
    private final String name;

    public Rabbit( String name ,  boolean vegetarian, String food, int legs, String color ) {
        super(vegetarian, food, legs);
        this.name = name;
        this.color = color;
        
        System.out.println("Hello, His name is " + name);
        System.out.println(name + " is Vegetarian? " + vegetarian);
        System.out.println(name + " eats " + food);
    }
 

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}

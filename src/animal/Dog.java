/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

public class Dog extends Animal {

    private String name;
    private int age;

    @Override
    public void say() {
        System.out.println("Gau Gau");
    }

}


package kata2;

import java.util.ArrayList;

public class Kata2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0; i<10; i++){
              list.add((int) (Math.random()*80));
        }
        
        System.out.println("Valores del list:");
        for (Integer value : list){
            System.out.print(value+" ");
        }
        
        ArrayList<Integer> elderPeople = new ArrayList<>();
        
        for (Integer value : list){
            if (value <= 60) continue;
            elderPeople.add(value);
        }
        list.removeAll(elderPeople);
        
        System.out.println();
        System.out.println("Menores que 70:");
        for (Integer value : list) {
            System.out.print(value+" ");
        }
    }
}


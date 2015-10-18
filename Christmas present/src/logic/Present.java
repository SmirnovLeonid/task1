package logic;

import comporator.SortBySugar;
import comporator.SortByWeight;
import entity.Sweets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Present {
    List<Sweets> list;
    public Present() {list = new ArrayList<Sweets>();}
    public void addSweets(Sweets sweets) {list.add(sweets);}

    public double getPresentWeight(){
        double result = 0;
        for (Sweets f : list) {
            result += f.getWeight();
        }
        return result;
    }

    /**
     * method of finding the total sum
     *
     */
    public double getPresentPrice(){
        double result = 0;
        for (Sweets f : list) {
            result += f.getPrice();
        }
        return result;
    }

    public void sortBySugar(){
        Collections.sort(list, new SortBySugar());
    }

    public void sortByWeight(){
        Collections.sort(list, new SortByWeight());
    }

    public void print(){
        if(list.size()>0){
            for (Sweets f : list) {
                System.out.println(f.toString());
            }
        }
        else System.out.println("Your present is empty :(");

    }

    /**
     * method of finding candy
     *
     */
    public Sweets getSweetsBySugar(int a, int b){
        Sweets sweets = null;
        for (Sweets find : list) {
            if ((find.getSugar() >= a) && (find.getSugar() <= b)){
                sweets = find;
            }
        } return sweets;
    }



}

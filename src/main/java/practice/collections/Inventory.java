package practice.collections;

import java.util.*;
import java.util.stream.Collectors;


public class Inventory {
    List<Products> inventory = new ArrayList<>();

    public void addProductToInventory(Products products){
        inventory.add(products);
    }
    public Inventory productsPrizedZero(){
        Inventory inv = new Inventory();
        inventory.stream().filter(e->e.price==0).forEach(inv::addProductToInventory);
        return inv;
    }
    public void productsByCategory(){
        System.out.println("Products with prize less than 1000 or greater than 10000 sorted by category");
        Map<String,List<Products>> productCategory = inventory.stream().collect(Collectors.groupingBy(Products::getCategories ));
        productCategory.values().stream().forEach(p->p.stream().filter(e->e.price<1000 || e.price>10000).forEach(Products::printString));
        Map<String, Integer> totalByCategory = inventory.stream()
                .collect(Collectors.groupingBy(Products::getCategories,
                        Collectors.summingInt(Products::productValue)));
        System.out.println("Total Value of Each Category");
        totalByCategory.entrySet().stream().forEach(p->System.out.println(p.getKey()+":"+p.getValue()));
        System.out.println("Number of Products in Category");
        productCategory.entrySet().stream().forEach(p->System.out.println(p.getKey()+":"+p.getValue().size()));
    }
    public void Print(){
        inventory.stream().forEach(Products::printString);
    }
}

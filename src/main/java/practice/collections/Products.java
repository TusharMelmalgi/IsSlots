package practice.collections;

import java.util.List;

public class Products {
        String name;
        String categories;
        List<String> tags;
        int price;
        int volume;
        public Products(String name,String categories,List<String> tags, int price,int volume){
            this.name = name;
            this.categories = categories;
            this.tags = tags;
            this.price = price;
            this.volume = volume;
        }

    public String getName() {
        return name;
    }
    public int productValue(){
            return price*volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
    public void printString() {
        System.out.println("Products{" +
                "name='" + name + '\'' +
                ", categories='" + categories + '\'' +
                ", tags=" + tags +
                ", price=" + price +
                ", volume='" + volume + '\'' +
                '}');
    }
}

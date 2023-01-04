package org.example;

public class Cat {
    private String name;
    private int weight;
    private boolean isAngry;

   private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public <T> Cat(String name, int weight, T id) {
        this.name = name;
        this.weight = weight;
        this.id = Integer.valueOf(id.toString());
    }
    public Cat(String name, int weight) throws Exception {
        if (weight <0) {
            // throw new IncorrectCatWeightException("Неправильный кот");
        }
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String toString(){
        return "Cat{"+"name "+getName()+" weight "+getWeight()+'}';
    }

    public Cat(String name, int weight, boolean isAngry) throws Exception {
        if (weight <0) {
            // throw new IncorrectCatWeightException("Неправильный кот");
        }
        this.name = name;
        this.weight = weight;
        this.isAngry = isAngry;
    }



    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }
}

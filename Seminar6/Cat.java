package Seminar6;

public class Cat {

    private String name;
    private int appetite;
    private volatile int satiety = 0;
    
    public Cat(String name) {
        this(name, 10);
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

        Thread backgroundSatietyManagement = new Thread(() -> {
            while (true) {
                if (this.satiety > 0) {
                this.satiety -= 1;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        backgroundSatietyManagement.setDaemon(true);
        backgroundSatietyManagement.start();
    }

    public void eat(Plate plate) {
        if (this.satiety == 0) {
            this.satiety = plate.decreaseFood(this.appetite);
            if (this.satiety == 0) {
                System.out.println(toString() + " Еды не осталось. Кот ничего не съел");
            } else {
                System.out.println(toString() + " съел " + this.appetite + " еды из тарелки");
            }
        } else {
            System.out.println(toString() + " еще не голоден");
        }

    }

    public void makeHungry() {
        this.satiety = 0;
    }

    @Override
    public String toString() {
        return this.name + "{аппетит=" + this.appetite + ", сытость=" + this.satiety + "}";
    }

    public int getCatAppetite() {
        return this.appetite;
    }

    public int getCatSatiety() {
        return this.satiety;
    }
}
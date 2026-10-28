public class Bowl {
    int food;

    public Bowl (int food) {
        if (food < 0){
            food = 0;
        }
        else {
            this.food = food;
        }
    }
    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }
    public boolean takeFood(int amount) {
        if (amount <= 0 || amount > food) {
            return false;
        }
        food -= amount;
        return true;
    }
}

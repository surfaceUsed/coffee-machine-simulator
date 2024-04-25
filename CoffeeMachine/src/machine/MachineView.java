package machine;

class MachineView {

    private final CoffeeMachine coffeeMachine;

    MachineView(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    void choice() {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
    }

    void menu() {

        System.out.printf("""
                        The coffe machine has:
                        %d ml of water
                        %d ml of milk
                        %d g of coffee beans
                        %d disposable cups
                        $%d of money
                        """,
                this.coffeeMachine.getAmountOfWater(),
                this.coffeeMachine.getAmountOfMilk(),
                this.coffeeMachine.getAmountOfBeans(),
                this.coffeeMachine.getAmountOfCups(),
                this.coffeeMachine.getAmountOfCash());
    }
}

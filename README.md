# coffee-machine-simulator
Application runs a simple representation of a modern coffee machine.

Hyperskill project "Coffee machine simulator" (Introduction to Java). Stage 6/6.

The application represents a coffee machine that can make 3 types of coffee. Each type requires a different 
amounts of ingredients, to be made:

Espresso: 250 ml water, 16 g coffee beans; price -> 4$.

Latte: 350 ml water, 75 ml milk, 20 g coffee beans; price -> 7$.

Cappuccino: 200 ml water, 100 ml milk, 12 g coffee beans; price -> 6$.

User actions are:

1. Buy-> user buys a coffee. After the user has chosen a coffee type, the application checks if the machine
   has enough resources to make the coffee. If it has, the coffee will be made, else the user won't get
   a coffee. 

2. Fill -> fills the coffee machine with fresh ingredients. The user specifies the amount for each ingredient. 

3. Take -> empties the coffe machine for all its cash.

4. Remaining -> lists all the remaining ingredients in the coffee machine. 

5. Exit -> stops the application/shuts down the coffee machine. 


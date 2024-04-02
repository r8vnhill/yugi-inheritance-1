# Yu-Gi-Oh! Deck and Monster Class Architecture Exercise

Welcome to the Yu-Gi-Oh! Deck and Monster Class Architecture Exercise. This project aims to establish a foundational 
class structure for a card game based on the popular "Yu-Gi-Oh!" series by late Kazuki Takahashi. Below are the
specifications for your implementation.

## Specifications

### Monsters

In "Yu-Gi-Oh!", there are two types of monster cards:

- Main Deck Monsters
- Extra Deck Monsters

Each type of monster belongs in its respective deck. You will need to implement the necessary classes and methods to
support this.

### Decks

There are two decks where the monsters can be played:

- Main Deck
- Extra Deck

You must implement functionality for both decks. The provided `Deck` trait will serve as the base for your deck
implementations.

### Tasks

1. **Implement Deck Interface:**
    - Utilize the provided `Deck` trait to implement two classes: `MainDeck` and `ExtraDeck`.
    - Ensure that only the appropriate type of monster can be added to each deck.

2. **Create Monster Classes:**
    - Design and implement classes for "Main Deck Monsters" and "Extra Deck Monsters".
    - Both types of monsters should conform to a `Card` trait.

3. **Test-Driven Development (TDD):**
    - Use TDD to guide the development of your classes.
    - Write tests before implementing the functionalities to ensure that your code meets all the requirements.

4. **Project Structure:**
    - Your project should be well-structured, with separate packages for different components.
    - Properly organize your classes and traits within these packages.
    - You can move the provided code to a separate package if you wish.

5. **Documentation:**
   - Provide a UML diagram showcasing the class structure of your implementation.
   - Include comments in your code to explain the purpose of each class and method, use the provided code as a
     reference.
    
## Provided Code

```scala
trait Card {
  val name: String
}

trait Deck {
  val size: Int
  val cards: List[Card]
  def draw: (Card, Deck)
  def shuffle: Deck
  def search(name: String): Option[Card]
  def addCard(card: Card): Deck
  def removeCard(name: String): Deck
}
```

You cannot modify the provided code. You must implement your classes based on the provided traits.

## Deliverables

- A UML diagram showcasing the class structure of your implementation.
- The source code for your implementation.

# Note

Remember to listen to the heart of the cards.
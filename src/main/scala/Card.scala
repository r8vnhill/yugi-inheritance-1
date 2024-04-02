/** A trait representing the fundamental properties of a card in a card game.
  *
  * This trait is intended to be implemented by any class that represents a card.
  */
trait Card {

  /** The name of the card.
    *
    * This is a 'val' meaning it is immutable and should be assigned a value when a concrete class implementing this
    * trait is instantiated.
    */
  val name: String
}

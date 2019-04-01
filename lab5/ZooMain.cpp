#include "animal.h"
#include "childAnimal.h"

int main() {
  // Mammal a("Dog", Brown);
  // a.speak();
  // Mammal b("Dog", Brown);

  // Dog dog1("dogName", Brown, "owner43");
  // dog1.speak();
  // dog1.move();

/*
  Animal *animalPtr = new Dog("Lassie", White, "Andy");
  animalPtr->speak();
  animalPtr->move();
  delete animalPtr;
*/

/*
  Dog dogi("Lassie", White, "Andy");
  Mammal *aniPtr = &dogi;
  Mammal &aniRef = dogi;
  Mammal aniVal = dogi;
  aniPtr->speak();    // Woof
    aniRef.speak();   // Woof
      aniVal.speak(); // Animal speaks
*/
  int choice = 0;
  int counter = 0;
  // Animal *zoo[20];
  Mammal *zoo[20];

  do {
    cout << "Select the animal to send to Zoo: " << endl;
    cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;
    cin >> choice;

    switch (choice) {
      case 1: zoo[counter] = new Dog("dog", White, "zoo");
              counter++;
              break;
      case 2: zoo[counter] = new Cat("cat", Black);
              counter++;
              break;
      case 3: zoo[counter] = new Lion("lion", Brown);
              counter++;
              break;
      case 4: for (size_t i = 0; i < min(counter, 20); i++) {
                  cout << endl << "Animal id: " << i << endl;
                  zoo[i]->move();
                  zoo[i]->speak();
                  zoo[i]->eat();
              }
              break;
      default:
              break;
    }
  } while(choice != 5);




  cout << "Program exiting... " << endl;
  return 0;
}

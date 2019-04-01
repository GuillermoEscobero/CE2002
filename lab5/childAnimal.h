#include "animal.h"

#ifndef DOG_H
#define DOG_H
class Dog: public Mammal {
private:
  string owner;

public:
  Dog(string n, COLOR c, string o) : Mammal(n, c) {
    cout << "constructing Dog object " << _name << " " << _color << " " << owner << endl;
    owner = o;
  }

  ~Dog() {
    cout << "destructing Dog object " << _name << endl;
  }

  void speak() {
    cout << "Woof " << endl;
  }

  void move() {
    cout << "Dog moves " << endl;
  }
};
#endif

#ifndef CAT_H
#define CAT_H
class Cat: public Mammal {
private:
  /* data */

public:
  Cat (string n, COLOR c) : Mammal(n, c) {
    cout << "constructing Cat object " << _name << " " << _color << endl;
  }

  virtual ~Cat () {
    cout << "destructing Cat object " << _name << endl;
  }

  void speak() {
    cout << "Meow" << endl;
  }

  void move() {
    cout << "Cat moves " << endl;
  }

};
#endif

#ifndef LION_H
#define LION_H
class Lion: public Mammal {
private:
  /* data */

public:
  Lion (string n, COLOR c) : Mammal(n, c) {
    cout << "constructing Lion object" << _name << " " << _color << endl;
  }

  virtual ~Lion () {
    cout << "destructing Lion object" << _name << endl;
  }

  void speak() {
    cout << "Roar" << endl;
  }

  void move() {
    cout << "Lion moves " << endl;
  }

};
#endif

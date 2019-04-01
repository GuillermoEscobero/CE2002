#ifndef ANIMAL_H
#define ANIMAL_H

#include <iostream>
#include <string>

using namespace std;

enum COLOR { Green, Blue, White, Black, Brown };

class Animal {
public:
  string _name;
  COLOR _color;

public:
  Animal() : _name("unknown") {
    cout << "constructing Animal object " << _name << endl;
  }

  Animal(string n, COLOR c) {
    cout << "constructing Animal object " << _name << " " << _color << endl;
    _name = n;
    _color = c;
  }

  void eat() {
    cout << "Animal eat " << endl;
  }

  virtual ~Animal() {
    cout << "destructing Animal object " << _name << endl;
  }

  virtual void speak()  {
    cout << "Animal speaks " << endl;
  }

  virtual void move() = 0;
};

// *************************************************
class Mammal: public Animal {

public:

  Mammal() : Animal() {
    cout << "constructing Mammal object " << _name << endl;
  }

  Mammal(string n, COLOR c) : Animal(n, c) {
    cout << "constructing Mammal object " << _name << " " << _color << endl;
 }

  ~Mammal() {
    cout << "destructing Mammal object " << _name << endl;
  }

  void eat() {
    cout << "Mammal eat " << endl;
  }

  void move() {
    cout << "Mammal moves " << endl;
  }

  void speak() {
    cout << "Mammal speaks" << endl;
  }

};

#endif

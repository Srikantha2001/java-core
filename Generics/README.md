# Documentation - Java Generics

## Intro :

This documentation contains working of java generics and how to program our own generics.

## Topics :

1. [Why Generics](#why-generics-)
2. [Autoboxing and Unboxing](#autoboxing-and-unboxing)
3. [Type Erasure](#type-erasure)
4. [Creating Our Own Generic Classes](#creating-our-own-generic-classes)
5. [Wildcards in Generics](#wildcards-in-generics)

### Why Generics ?

- Typecasted every single time
- Allow storing values of multiple types (for mismatch it gives ClassCastException)
- Generics Automatically handle types of objects (no need to typecast)

### Autoboxing and Unboxing

- Each primitive has corresponding Object (Wrapper class)

| primitive | Object    |
|-----------|-----------|
| int       | Integer   |
| char      | Character |
| double    | Double    |

- **Autoboxing** :
    - assigning a wrapper class for a primitive
- **Unboxing**:
    - assigning a primitive for a corresponding wrapper class


### Type Erasure

- Type Erasure is a concept in java where type constraints are enforced only at the compile time and it is discarded in the runtime
- This helps developers to prevent accidental insertion of various typed objects into a single collection

**Example :v:**

```java
public class Sample1{
  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>();
    integerList.add(1);
    integerList.add(2);
    integerList.add(3);
    
    // List in java is not type specific, the generic expression List<Integer> is enforcing type in compile time. if it is casted to List, we can insert any typed variable
    List genericList = integerList;
    
    genericList.add("Sri");// WORKS FINE : inserting sample string as a example
    integerList.add("Sri");// ERROR : this line gives error (Class cast exception)
    
    
    for(Object e:integerList) {
      System.out.println(e+" "+e.getClass());
    }
    /*
        OUTPUT :
            1 class java.lang.Integer
            2 class java.lang.Integer
            Sri class java.lang.String
    */
  }
}
```

### Creating Our Own Generic Classes

- Helps in code reuse.
- This helps in restricting the type of objects that can be put in a class.

```java
public class Floor<E> {
    private E employee1;
    private E employee2;

    Floor(){}

    public E getEmployee1() {
        return employee1;
    }

    public void setEmployee1(E employee1) {
        this.employee1 = employee1;
    }

    public E getEmployee2() {
        return employee2;
    }

    public void setEmployee2(E employee2) {
        this.employee2 = employee2;
    }
}
```

In case of Initialiting generics in constructor, the type has to mandatory specified in right hand side (or atleast <>)

```java
import io.sriki.vtp.DeutscheBank;

public class Floor<E> {
  private E employee1;
  private E employee2;

  Floor(E emp1, E emp2) {
    this.employee1 = emp1;
    this.employee2 = emp2;
  }
}

public class Sample {
  public static void main(String[] args) {

    Floor<DeutscheBank> dbfloor = new Floor<DeutscheBank>(new DeutscheBank(),new DeutscheBank());
  }
}
```

### WildCards In Generics


## Resources :

1. [Java - Generics Playlist - Javabrains](https://www.youtube.com/playlist?list=PLqq-6Pq4lTTbJNCU_lS7XC6hPEiTAABn_)
2. Core Java - Cay S Horstmann

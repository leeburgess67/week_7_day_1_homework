package Packages;

import sun.reflect.generics.visitor.Visitor;

public interface ITicketed {

    double defaultPrice();
    double priceForVisitor(Visitor visitor);

}

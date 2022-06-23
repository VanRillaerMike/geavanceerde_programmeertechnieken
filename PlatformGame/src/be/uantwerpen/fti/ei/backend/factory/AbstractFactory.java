package be.uantwerpen.fti.ei.backend.factory;

public interface AbstractFactory<T> {
    T create (String entityType);
}

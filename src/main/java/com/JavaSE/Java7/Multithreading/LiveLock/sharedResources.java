package com.JavaSE.Java7.Multithreading.LiveLock;

public class sharedResources {

    private Worker owner;

    public sharedResources(Worker owner) {
        this.owner = owner;
    }
    public Worker getOwner() {
        return owner;
    }
    public synchronized void setOwner(Worker owner) {
        this.owner = owner;
    }
}

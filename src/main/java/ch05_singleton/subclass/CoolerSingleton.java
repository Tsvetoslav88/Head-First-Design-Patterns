package ch05_singleton.subclass;

public class CoolerSingleton extends Singleton {
  
  protected static Singleton uniqueInstance;
  
  private CoolerSingleton() {
    super();
  }
}
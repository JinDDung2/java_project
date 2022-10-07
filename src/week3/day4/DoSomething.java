package week3.day4;

import java.util.List;


public interface DoSomething<T> {
    //T가 PopultaionMove가 될수도, parent가 될수도 있다.
    List<T> work(String str);
}

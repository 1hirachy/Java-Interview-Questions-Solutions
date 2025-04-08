package design.pattern.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {

    @Test
    void testSingletonReturnsSameInstance(){
        Singleton instance1 = Singleton.getInstance("FOO");
        Singleton instance2 = Singleton.getInstance("BAR");


        assertSame(instance1, instance2, "Both Instance should be the same");

    }
}

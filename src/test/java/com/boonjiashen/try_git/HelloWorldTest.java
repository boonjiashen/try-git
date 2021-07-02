package com.boonjiashen.try_git;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    public void runShouldSucceed() {
        new HelloWorld().run();
    }

    @Test
    public void runAwayShouldSucceed() {
        new HelloWorld().runAway();
    }
}
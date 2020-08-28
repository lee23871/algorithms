package com.thlee.algorithms.leek;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidIpAddressTest {

    @Test
    void restoreIpAddresses() {
        ValidIpAddress validIpAddress = new ValidIpAddress();
        List<String> stringList = validIpAddress.restoreIpAddresses("25525511135");
        System.out.println(stringList.toString());
    }
}
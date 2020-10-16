package ru.miroque.stest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class StestApplicationTests {
    @Value("${foo.name}")
    private String xxxxx;

    @Autowired Api api;

    @Test
    void contextLoads() {
        Map<String, String> expectedResources = new HashMap<>();
        expectedResources.put("foo", "bar");
        assertEquals(expectedResources, api.sample());
    }

}

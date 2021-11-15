package com.example.creation_of_it_team;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
@TestPropertySource("/test.properties")
public /*abstract*/ class CreationOfItTeamApplicationTest {

    @Test
    void contextLoads() {
    }

    /*@Before
    public final void before() throws Exception {
        setUp();
    }

    @After
    public final void after() throws Exception {
        tearDown();
    }

    protected abstract void setUp() throws Exception;
*/
    //protected abstract void tearDown() throws Exception;

}

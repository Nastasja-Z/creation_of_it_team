package com.example.creation_of_it_team;

import com.example.creation_of_it_team.persistence.entity.CurrentProject;
import com.example.creation_of_it_team.persistence.entity.Indicator;
import com.example.creation_of_it_team.persistence.repository.IndicatorRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashSet;
import java.util.Set;

import static com.example.creation_of_it_team.EntityTestHelper.INDICATOR_TEST;
import static com.example.creation_of_it_team.EntityTestHelper.PROJECT_TEST;
import static org.junit.Assert.assertNotNull;

//@WebAppConfiguration
/*
@Transactional
@TestPropertySource("/test.properties")
*/
@SpringBootTest
public class CreationOfItTeamApplicationTest {

    @Test
    public void contextLoads() {
    }

}

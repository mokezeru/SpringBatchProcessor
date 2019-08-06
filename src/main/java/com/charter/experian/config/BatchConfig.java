package com.charter.experian.config;

import com.charter.experian.tasks.ExperianProcessor;
import com.charter.experian.tasks.Task1;
import com.charter.experian.model.Experian;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.batch.item.ItemProcessor;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    @Bean
   public Job job(JobBuilderFactory jbf,
            StepBuilderFactory sbf,
            Task1 task1) throws Exception {

        Step s1 = sbf.get("theStep")
                .<Experian, Experian>chunk(100)
                .reader(task1.fileReader())
                .processor(processor())
                .writer(task1.jdbcWriter(null))
                .build();

        return jbf.get("theJob")
                .incrementer(new RunIdIncrementer())
                .start(s1)
                .build();
    }

    @Bean
    public ItemProcessor<Experian, Experian> processor() {
        return new ExperianProcessor();
    }
}

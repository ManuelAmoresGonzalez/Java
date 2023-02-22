package com.devs4j.kafka.Producers;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class Devs4jProducer {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Properties props = new Properties();
        props.put("bootstrap.servers","localhost:9092"); //Broker al que nos vamos a conectar
        props.put("acks","all");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("linger.ms", "12");

        try( Producer<String, String> producer = new KafkaProducer<>(props) ) {
            for (int i = 0; i < 10000000; i++){
                producer.send(new ProducerRecord<String, String>("devs4j-topic", "devs4j-key", "devs4j-value"+ i));
            }
            producer.flush();


        }
        System.out.println("Tiempo: " + (System.currentTimeMillis() - startTime));



    }
}

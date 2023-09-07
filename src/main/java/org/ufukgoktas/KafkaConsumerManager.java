package org.ufukgoktas;

import com.google.gson.Gson;
import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class KafkaConsumerManager {
    private Consumer<String, String> consumer;

    public KafkaConsumerManager() {
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "central-unit-grup");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());

        this.consumer = new KafkaConsumer<>(props);
        this.consumer.subscribe(Collections.singletonList("sensor_data"));
    }

    public void start() {
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
            for (ConsumerRecord<String, String> record : records) {
                String sensorDataJson = record.value();
                Gson gson = new Gson();

                if (record.key().equals("sensor1")) {
                    SensorData sensorData = gson.fromJson(sensorDataJson, SensorData.class);
                    PositionCalculator.calculateRelativePosition(sensorData, sensorData);
                } else if (record.key().equals("sensor2")) {
                    SensorData sensorData = gson.fromJson(sensorDataJson, SensorData.class);
                    PositionCalculator.calculateRelativePosition(sensorData, sensorData);
                }

            }
        }
    }

    public void stop() {
        consumer.close();
    }
}
package org.ufukgoktas;




public class Main {
    public static void main(String[] args) {
        KafkaConsumerManager kafkaConsumerManager = new KafkaConsumerManager();
        kafkaConsumerManager.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            kafkaConsumerManager.stop();
        }));
    }
}
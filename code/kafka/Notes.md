# Kafka Notes

Start Zookeeper and Kafka
```sh
# Install Kafka
brew install kafka

# Start Zookeeper 
/home/linuxbrew/.linuxbrew/opt/kafka/bin/zookeeper-server-start /home/linuxbrew/.linuxbrew/etc/kafka/zookeeper.properties

# Start Kafka
/home/linuxbrew/.linuxbrew/opt/kafka/bin/kafka-server-start /home/linuxbrew/.linuxbrew/etc/kafka/server.properties

```
FROM openjdk:11
VOLUME /temp
ADD ./target/hr-worker-0.0.1-SNAPSHOT.jar hr-worker.jar
ENTRYPOINT ["java","-jar","/hr-worker.jar"]
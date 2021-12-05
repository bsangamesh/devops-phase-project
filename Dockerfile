From openjdk:8
Expose 8090
Add target/RestDemo-0.0.1-SNAPSHOT.jar RestDemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/RestDemo-0.0.1-SNAPSHOT.jar"]
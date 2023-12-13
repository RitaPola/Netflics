FROM openjdk:17-oracle

WORKDIR ./src

COPY ../target/netflics-0.0.1-SNAPSHOT.jar .

CMD java -jar netflics-0.0.1-SNAPSHOT.jar
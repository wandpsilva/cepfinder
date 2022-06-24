FROM openjdk:11
LABEL maintaner "wpsilva - wanderdesigner@gmail.com"
VOLUME /tmp
ADD ./target/address-wp-0.0.1-SNAPSHOT.jar address-wp.jar
ENTRYPOINT ["java", "-jar", "/address-wp.jar"]
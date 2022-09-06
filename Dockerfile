FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY .gradle/ .gradle
COPY gradle/ gradle
COPY gradlew build.gradle.kts ./
COPY src/ src

RUN ./gradlew bootJar && chmod a+x ./build/libs/app.jar

CMD ["java", "-jar", "./build/libs/app.jar"]

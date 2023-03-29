FROM amazoncorretto:19

WORKDIR /usr/src/app/jmh

ADD jmh/gradle ./gradle

ADD jmh/build.gradle.kts ./
ADD jmh/gradle.properties ./
ADD jmh/gradlew ./
ADD jmh/settings.gradle.kts ./

RUN ./gradlew install --no-daemon --info

ADD jmh/src ./src

CMD ["./gradlew", "mainBenchmark"]


FROM eclipse-temurin:21.0.4_7-jdk

COPY gradle-user-home/caches /gradle-user-home/caches
COPY gradle-user-home/notifications /gradle-user-home/notifications
COPY gradle-user-home/wrapper /gradle-user-home/wrapper

ENV GRADLE_USER_HOME=/gradle-user-home

WORKDIR /build

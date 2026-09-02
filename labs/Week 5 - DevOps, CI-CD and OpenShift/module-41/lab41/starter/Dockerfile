# syntax=docker/dockerfile:1
# TODO(lab41): Pin base image digests if instructor provides them.
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /workspace
COPY pom.xml .
# TODO(lab41): COPY .mvn .mvn and mvnw when Wrapper is present
COPY src ./src
# TODO(lab41): Prefer dependency:go-offline before COPY src for layer cache
RUN mvn -B clean verify -DskipTests
# TODO(lab41): Remove -DskipTests for full verify when tests are green

FROM eclipse-temurin:21-jre
# TODO(lab41): Create non-root user UID 10001 (useradd or equivalent)
# RUN useradd --system --uid 10001 --create-home spring
WORKDIR /app
# TODO(lab41): COPY --from=build --chown=spring:spring /workspace/target/*.jar app.jar
COPY --from=build /workspace/target/*.jar app.jar
# TODO(lab41): USER 10001 — never run as root in runtime stage
EXPOSE 8080
ENV JAVA_TOOL_OPTIONS="-XX:MaxRAMPercentage=75"
# TODO(lab41): Never ENV CRM_DB_PASSWORD or bake secrets into layers
# TODO(lab41): HEALTHCHECK against readiness — prefer /dev/tcp (JRE often lacks wget/curl)
# HEALTHCHECK --interval=30s --timeout=3s --start-period=40s --retries=3 \
#   CMD ["bash", "-c", "exec 3<>/dev/tcp/127.0.0.1/8080 && printf 'GET /actuator/health/readiness HTTP/1.0\r\nHost: localhost\r\n\r\n' >&3 && cat <&3 | grep -q UP"]
ENTRYPOINT ["java","-jar","/app/app.jar"]

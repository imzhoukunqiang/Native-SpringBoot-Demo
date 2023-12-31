ARG TARGETPLATFORM
FROM azul/zulu-openjdk-alpine:17-jre
VOLUME [/tmp , /config]
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["sh", \
 "-c", \
 "java ${JAVA_OPTS} -jar /app.jar ${0} ${@}" \
 ]

FROM heroku/jvm

COPY [".", "*.gradle", "gradlew", "*.properties", "/app/user/"]
COPY ["gradle/wrapper/*", "/app/user/gradle/wrapper/"]

RUN ./run.sh

#RUN ./gradlew clean bootRepackage
##
#CMD ["java", "-Dserver.port=5000", "-jar", "build\libs\jalgoarena-eureka-*.jar"]

CMD ["./gradlew", "clean", "bootRun"]
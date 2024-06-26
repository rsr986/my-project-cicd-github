FROM openjdk:17-oracle

EXPOSE 8080

COPY ./build/libs/my-project-cicd-github-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "my-project-cicd-github-0.0.1-SNAPSHOT.jar"]
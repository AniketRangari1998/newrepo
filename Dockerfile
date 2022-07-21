FROM openjdk:11
ADD target/milestone_4-0.0.1.jar milestone_4-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","milestone_4-0.0.1.jar"]
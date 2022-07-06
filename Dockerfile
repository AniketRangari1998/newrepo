FROM openjdk:11
ADD target/milestone_4-0.0.1.war milestone_4-0.0.1.war
EXPOSE 8091
ENTRYPOINT ["java","-jar","milestone_4-0.0.1.war"]